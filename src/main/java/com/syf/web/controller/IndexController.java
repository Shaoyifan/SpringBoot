package com.syf.web.controller;


import com.syf.web.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private Logger logger = Logger.getLogger(IndexController.class) ;

    @Autowired
    private UserService userService ;

    @GetMapping("/index")
    public String hello(){
        logger.info("首页");
        return "index" ;
    }
}
