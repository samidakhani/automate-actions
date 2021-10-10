package org.automate.actions.automateactions.controller;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    private static Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @PostMapping("/payload")
    public String logWebhook(@RequestBody String payload) {
        logger.info("Recieved data from github webhook");

        JSONObject webhookEvent = new JSONObject(payload);
        JSONObject headCommit = webhookEvent.getJSONObject("head_commit");
        JSONObject committer = headCommit.getJSONObject("committer");
        String commiterId = committer.getString("username");
        logger.info("Head commiter: " + commiterId);

        return "Verified user:" + commiterId;
    }

}
