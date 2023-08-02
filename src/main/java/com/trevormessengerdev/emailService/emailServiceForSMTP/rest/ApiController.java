package com.trevormessengerdev.emailService.emailServiceForSMTP.rest;

import com.trevormessengerdev.emailService.emailServiceForSMTP.EmailService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ApiController {

    private EmailService emailService;

    ApiController (EmailService emailService) {
        this.emailService = emailService;
    }

    @CrossOrigin
    @PostMapping("/email")
    String sendEmailMessage(@RequestBody String message) {
        this.emailService.sendMessage("Message From Website", message);

        return "Message Sent. Thank you for visiting my site!";
    }

}
