package com.musicwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by KarrySue on 2017/6/29.
 */
@Controller
public class indexController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "adminlogin";
    }
}
