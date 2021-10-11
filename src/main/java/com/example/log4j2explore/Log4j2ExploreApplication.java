package com.example.log4j2explore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2ExploreApplication implements ApplicationRunner {
private static final Logger logger = LogManager.getLogger(Log4j2ExploreApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Log4j2ExploreApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("Debug level log");
		logger.info("Info level log");
		logger.warn("Warning level log");
		logger.error("o.O An erroc occured.");
		logger.fatal("Fatal error occured. Fix it ASAP!");
	}
}
