package com.hoopick.controller;


import com.oracle.tools.packager.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    @RequestMapping(value = "/")
    public String home(){
        return "test";
    }
}
