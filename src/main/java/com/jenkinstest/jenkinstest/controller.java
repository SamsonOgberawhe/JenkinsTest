package com.jenkinstest.jenkinstest;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
public class controller {

    @RequestMapping(value = "/getname", method = RequestMethod.GET)
    public String getName(){
//
        return "";
    }
}
