package org.automate.actions.automateactions.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    private static Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @PostMapping("/payload")
    public void logWebhook(@RequestBody String payload) {
        logger.info("Recieved data from github webhook");
        logger.info(payload);
    }

}
