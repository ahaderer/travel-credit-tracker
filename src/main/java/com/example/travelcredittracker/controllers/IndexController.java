package com.example.travelcredittracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "")
    public String index(Model model) {

          model.addAttribute("title", "Travel Credit Tracker");

        return "index";
    }
}
