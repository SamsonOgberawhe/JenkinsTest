package com.jenkinstest.jenkinstest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class JenkinsTestApplicationTests {

    public Logger logger  = LoggerFactory.getLogger(JenkinsTestApplicationTests.class);
    @Test
    void contextLoads() {
        logger.debug("Test class is running {}", JenkinsTestApplicationTests.class);
        logger.debug("Test");
        assertTrue(true);
    }



}
