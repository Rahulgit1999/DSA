package com.rahul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String showPage(Model model) {
        model.addAttribute("msg", "Hi Rahul, Spring MVC is working!");
        return "hello";  // it will load hello.jsp
    }
}
