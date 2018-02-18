package com.example.travelcredittracker.controllers;

import com.example.travelcredittracker.models.User;
import com.example.travelcredittracker.models.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("users", UserData.getAll());
        model.addAttribute("title", "Users");
        return "user/index";
    }

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String displayUserSignupForm(Model model) {

        model.addAttribute("title", "User Signup");
        return "user/signup";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String processUserSignupForm(Model model, @ModelAttribute User user, String verify) {

//        if (!user.getPassword().equals(verify)) {
//            model.addAttribute("pw_error", "Passwords do not match.");
//            return "user/add";
//        }
        UserData.add(user);
        return "redirect:";
    }


//    @RequestMapping(value = "login")
//    public String userLogin(Model model) {
//
//        model.addAttribute("title", "Login");
//        return "user/login";
//    }

}