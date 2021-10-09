package org.automate.actions.automateactions.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    private static final String CODE_SITEDOWN = "Site is down";
    private static final String CODE_SITEUP = "Site is up";
    private static final String CODE_INCORRECT_URL = "URL malformed";

    @GetMapping("/check")
    public String checkSiteStatus(@RequestParam String url) {
        String siteStatus = CODE_SITEUP;

        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            int responseCodeCategory = responseCode / 100;
            if (responseCodeCategory != 2 && responseCodeCategory != 3) {
                siteStatus = CODE_SITEDOWN;
            }
        } catch (MalformedURLException ex) {
            siteStatus = CODE_INCORRECT_URL;
        } catch (IOException ex) {
            siteStatus = CODE_SITEDOWN;
        }

        return siteStatus;
    }
}
