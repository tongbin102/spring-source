package com.sunliangliang.springsource.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by sunliangliang
 */
@RestController
public class HomeController {
    private Logger logger = Logger.getLogger(getClass());
    @GetMapping("/index")
    public String index(@RequestParam String name){
        logger.info("-----------{name}:{}"+name);
        return "【welcome to aop】:" +name;
    }
}
