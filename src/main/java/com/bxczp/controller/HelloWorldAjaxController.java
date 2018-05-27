package com.bxczp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//相当于Controller+ResponseBody 的效果
@RestController
@RequestMapping("/ajax")
public class HelloWorldAjaxController {

    @RequestMapping("/hello")
    public String hello1(@RequestParam(required=false, value="data")String data) {
        return "{'msg1' : 'Hello', 'msg2': 'World', 'data' :" + data +"}";
    }
    
}
