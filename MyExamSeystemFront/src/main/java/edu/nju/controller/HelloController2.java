package edu.nju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/7.
 */

@Controller
public class HelloController2 {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
