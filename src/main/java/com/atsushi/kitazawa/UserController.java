package com.atsushi.kitazawa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atsushi.kitazawa.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String find(Model model) {
        model.addAttribute("message", "this is user controller");
        new UserRepository().findById("1");
        return "user";
    }
}
