package com.sahota.subscriptiontracker.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectContext {

    @GetMapping("/")
    public RedirectView redirectToInfo() {
        return new RedirectView("/actuator/info");
    }
}
