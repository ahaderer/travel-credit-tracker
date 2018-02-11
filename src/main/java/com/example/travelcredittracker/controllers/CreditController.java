package com.example.travelcredittracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
@RequestMapping("credits")
public class CreditController {

    @RequestMapping(value = "")
    public String index(Model model) {

        ArrayList<String> credits = new ArrayList<>();
        credits.add("first");
        credits.add("second");
        credits.add("third");

        model.addAttribute("credits", credits);
        model.addAttribute("title", "My Credits");

        return "credits/index";
    }
}
