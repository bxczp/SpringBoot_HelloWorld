package com.bxczp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/block")
public class BlockController {

    @RequestMapping("/{id}")
    public ModelAndView hello1(@PathVariable("id") String id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", id);
        modelAndView.setViewName("helloWorld");
        return modelAndView;
    }
    
}
