package org.automate.actions.automateactions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomateActionsApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(AutomateActionsApplication.class);

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AutomateActionsApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("This is an application for github actions.");
		logger.info("Initiating manual merge");
		logger.info("Initiating linting on merge");
	}

}
