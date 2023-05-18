package lt.code.academy.eshopapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/{name}")
    public String hi(@PathVariable String name) {
        return String.format("Hello, %s how are you?", name);
    }
}
