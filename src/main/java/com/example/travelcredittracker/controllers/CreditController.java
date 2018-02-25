package com.example.travelcredittracker.controllers;

import com.example.travelcredittracker.models.Credit;
import com.example.travelcredittracker.models.data.CreditDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@SuppressWarnings("unused")
@Controller
@RequestMapping("credits")
public class CreditController {

    @Autowired
    private CreditDao creditDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("credits", creditDao.findAll());
        model.addAttribute("title", "My Credits");
        return "credits/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCreditForm(Model model) {

        model.addAttribute("title", "Add A Travel Credit");
        model.addAttribute(new Credit());
        return "credits/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCreditForm(Model model, @ModelAttribute @Valid Credit newCredit,
                                       Errors errors) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add A Travel Credit");
            model.addAttribute(newCredit);
            return "credits/add";
        }
        creditDao.save(newCredit);
        return "redirect:"; // Redirects to /credits (list of credits)
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String displayEditCreditForm(Model model, @PathVariable int id) {

        creditDao.findOne(id);
        return "credits/edit";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    public String processEditCreditForm(int id, Credit newCredit, String traveler, String airline, String confirmationNumber, int ticketNumber, String purchaseDate, String cancelDate, String expirationDate, double creditAmount, String creditNotes, Model model) {

        model.addAttribute(newCredit);
        model.addAttribute(creditDao.findOne(id));

        newCredit.setTraveler(traveler);
        newCredit.setAirline(airline);
        newCredit.setConfirmationNumber(confirmationNumber);
        newCredit.setTicketNumber(ticketNumber);
        newCredit.setPurchaseDate(purchaseDate);
        newCredit.setCancelDate(cancelDate);
        newCredit.setExpirationDate(expirationDate);
        newCredit.setCreditAmount(creditAmount);
        newCredit.setCreditNotes(creditNotes);
        creditDao.save(newCredit);
        return "redirect:/credits";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCreditForm(Model model) {

        model.addAttribute("credits", creditDao.findAll());
        model.addAttribute("title", "Remove Credit");
        return "credits/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCreditForm(@RequestParam int[] ids) {

        for (int id : ids) {
            creditDao.delete(id);
        }
        return "redirect:";
    }
}
