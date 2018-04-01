 package com.bxczp.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bxczp.entity.MySQLProperties;

@Controller
public class HelloWorldController {
    
    @Value("${helloWorld}")
    private String helloWorld;
    
    @Value("${mysql.jdbcName}")
    private String jdbcName;
    
    @Value("${mysql.dbUrl}")
    private String dbUrl;
    
    @Value("${mysql.userName}")
    private String userName;
    
    @Value("${mysql.password}")
    private String password;
    
    @Resource
    private MySQLProperties mySQLProperties;
    
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld2() {
        return "Hello Wolrd 2" + helloWorld;
    }
    
    @ResponseBody
    @RequestMapping("/show")
    public String show() {
        return mySQLProperties.getJdbcName()+mySQLProperties.getDbUrl()+mySQLProperties.getUserName();
    }
    
}
