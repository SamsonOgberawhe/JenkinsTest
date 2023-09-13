package com.jenkinstest.jenkinstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping(value = "/getname", method = RequestMethod.GET)
    public String getName(){
        return null;
    }
}
