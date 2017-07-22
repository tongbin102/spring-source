package com.sunliangliang.springsource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunliangliang on 2017/7/22.
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){

        return "Hello world!";
    }
}
