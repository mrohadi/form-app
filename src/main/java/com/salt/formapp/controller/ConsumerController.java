package com.salt.formapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.salt.formapp.entity.Consumer;
import com.salt.formapp.service.ConsumerService;

@Controller
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumers")
    public String viewConsumers(Model model) {
        model.addAttribute("listConsumers", consumerService.getConsumers());
        return "view-consumers";
    }

    @GetMapping("/addConsumer")
    public String addViewConsumer(Model model) {
        model.addAttribute("consumer", new Consumer());
        return "addConsumer";
    }

    @PostMapping("/addConsumer")
    public RedirectView addConsumer(@ModelAttribute("consumer") Consumer consumer,
            RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/consumers", true);
        consumerService.addConsumer(consumer);
        return redirectView;
    }

}
