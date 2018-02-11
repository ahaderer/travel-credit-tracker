package com.example.travelcredittracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("credits")
public class CreditController {

    static ArrayList<String> credits = new ArrayList<>();

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("credits", credits);
        model.addAttribute("title", "My Credits");

        return "credits/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCreditForm(Model model) {

        // TODO: Create a new branch to complete build on "add credit form"

        model.addAttribute("title", "Add A Travel Credit");
        return "credits/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCreditForm(@RequestParam String credit) {
        credits.add(credit);

        // Redirect to /credits
        return "redirect:";
    }


}
