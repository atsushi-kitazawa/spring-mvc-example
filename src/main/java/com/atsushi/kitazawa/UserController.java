package com.atsushi.kitazawa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atsushi.kitazawa.model.User;
import com.atsushi.kitazawa.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String find(@PathVariable("userId") String userId, Model model) {
        User user = new UserRepository().findById(userId);
        model.addAttribute("userId", user.getUserId());
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("birthDay", user.getBirthday());
        model.addAttribute("email", user.getEmail());
        return "user";
    }

    @RequestMapping("/userform")
    public ModelAndView showUserForm() {
        return new ModelAndView("userform", "command", new User());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("user") User user) {
        new UserRepository().save(user);
        return new ModelAndView("userform", "command", user);
        // return new ModelAndView("redirect:/viewemp");
    }
}
