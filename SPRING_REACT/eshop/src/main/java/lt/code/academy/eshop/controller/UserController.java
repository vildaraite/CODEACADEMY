package lt.code.academy.eshop.controller;
import jakarta.validation.Valid;
import lt.code.academy.eshop.dto.User;
import lt.code.academy.eshop.service.UserService;
import lt.code.academy.eshop.validator.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserValidator userValidator;
    private final UserService userService;

    public UserController(UserValidator userValidator, UserService userService) {
        this.userValidator = userValidator;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String openUserCreateForm(Model model) {
        model.addAttribute("user", new User());

        return "form/user";
    }

    @PostMapping("/create")
    public String createUser(@Valid User user, BindingResult result) {
        userValidator.validate(user, result);
        if(result.hasErrors()) {
            return "form/user";
        }

        userService.createUser(user);

        return "redirect:/users/create";
    }
}