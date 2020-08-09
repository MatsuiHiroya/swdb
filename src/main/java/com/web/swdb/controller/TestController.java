package com.web.swdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String hello(Model model) {
        model.addAttribute("text", "Thymeleaf with Maven");
        return "test";
    }
}
