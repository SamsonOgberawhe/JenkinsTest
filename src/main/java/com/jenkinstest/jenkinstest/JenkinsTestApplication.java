package com.jenkinstest.jenkinstest;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
@SpringBootApplication
public class JenkinsTestApplication {

static Logger logger = LoggerFactory.getLogger(JenkinsTestApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
        logger.error("There is an error here");
        logger.warn("I am warning you");

    }

}
