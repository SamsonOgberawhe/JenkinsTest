package com.jenkinstest.jenkinstest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class controller {

    @RequestMapping(value = "/getname", method = RequestMethod.GET)
    public String getName(){

        log.info("This is a new line that was added");
        return "This is the dev branch";
    }
}
