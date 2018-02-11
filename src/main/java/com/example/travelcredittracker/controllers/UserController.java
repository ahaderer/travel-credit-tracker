package com.example.travelcredittracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "")
    public String index(Model model) {
        return "redirect:/user/login";
    }

    @RequestMapping(value = "signup")
    public String userSignup(Model model) {

        model.addAttribute("title", "User Signup");

        return "user/signup";
    }

    @RequestMapping(value = "login")
    public String userLogin(Model model) {

        model.addAttribute("title", "Login");

        return "user/login";
    }

}