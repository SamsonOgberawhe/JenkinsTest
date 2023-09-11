package com.jenkinstest.jenkinstest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class JenkinsTestApplication {

    Logger logger = LoggerFactory.getLogger(JenkinsTestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
