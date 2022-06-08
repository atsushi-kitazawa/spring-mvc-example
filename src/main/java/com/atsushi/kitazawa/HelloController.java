package com.atsushi.kitazawa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}