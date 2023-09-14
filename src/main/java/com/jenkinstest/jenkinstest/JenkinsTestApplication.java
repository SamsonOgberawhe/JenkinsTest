package com.jenkinstest.jenkinstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class JenkinsTestApplication {

static Logger logger = LoggerFactory.getLogger(JenkinsTestApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
        logger.info("This is the QA branch");
    }

}
