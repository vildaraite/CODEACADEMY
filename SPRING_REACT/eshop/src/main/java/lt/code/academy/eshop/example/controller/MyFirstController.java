package lt.code.academy.eshop.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/myFirstController")
public class MyFirstController {

    @GetMapping
    public String firstController() {
        return "myFirstTemplate";
    }

    // pasiimam kintamaji is path su anotacija pathvariable, butinai turi sutapt tas zodis TARP BEGINO IR ENDO ir stringo kintamasis
    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name, @RequestParam(required = false)String gender) {
        System.out.println("Perduodamas vardas yra" + name);
        System.out.println("Gender " + gender);

        return "myFirstTemplate";

        //narsyklej: myFirstController/sayHi/RASOME BELEKA KA MES NORIME
    }
}
