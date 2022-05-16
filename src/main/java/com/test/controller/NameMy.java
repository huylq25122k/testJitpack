package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NameMy {
    @RequestMapping("/index")
    @ResponseBody
    public String name(String name){
        return name;
    }
}
