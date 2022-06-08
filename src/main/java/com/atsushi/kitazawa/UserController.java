package com.atsushi.kitazawa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atsushi.kitazawa.model.User;
import com.atsushi.kitazawa.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String find(@PathVariable("userId") String userId, Model model) {
        User user = new UserRepository().findById(userId);
        model.addAttribute("userId", user.userId());
        model.addAttribute("userName", user.userName());
        model.addAttribute("birthDay", user.birthDay());
        model.addAttribute("email", user.email());
        return "user";
    }
}
