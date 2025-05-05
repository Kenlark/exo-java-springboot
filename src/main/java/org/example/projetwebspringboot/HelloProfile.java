package org.example.projetwebspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloProfile {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("prenom", "Hello name");
        return "hello";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("prenom", "Hello name");
        return "profile";
    }
}
