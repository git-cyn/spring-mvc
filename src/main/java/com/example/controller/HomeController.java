package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public  ModelAndView index(HttpServletRequest request, Model model) {

        //返回一个index.jsp这个视图

        ModelAndView mav= new ModelAndView();
        mav.addObject("s","test");
        mav.setViewName("demo");
        return mav;
    }
}