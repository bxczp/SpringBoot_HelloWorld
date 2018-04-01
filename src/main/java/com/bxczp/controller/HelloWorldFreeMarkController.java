package com.bxczp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
@RequestMapping("/freemark")
public class HelloWorldFreeMarkController {

    @RequestMapping("/hello1")
    public ModelAndView helloWorld1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Hello World");
        modelAndView.setViewName("helloWorld");
        return modelAndView;
    }
    
}
