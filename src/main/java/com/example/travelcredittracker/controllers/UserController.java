package com.example.travelcredittracker.controllers;

import com.example.travelcredittracker.models.User;
import com.example.travelcredittracker.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("users", userDao.findAll());
        model.addAttribute("title", "Users");
        return "user/index";
    }

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String displayUserSignupForm(Model model) {

        model.addAttribute("title", "User Signup");
        model.addAttribute(new User());
        return "user/signup";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String processUserSignupForm(Model model, @ModelAttribute @Valid User newUser,
                                        Errors errors) {

        if (!newUser.getVerifyPassword().equals(newUser.getPassword())) {
            model.addAttribute(newUser);
            return "user/signup";

        } else
        if (errors.hasErrors()) {
        model.addAttribute("title", "User Signup");
        model.addAttribute(newUser);
        return "user/signup";
        }
        userDao.save(newUser);
        return "redirect:"; // Redirects to /users (list of users)
    }


    @RequestMapping(value = "login")
    public String userLogin(Model model) {

        model.addAttribute("title", "Login");
        return "user/login";
    }

}