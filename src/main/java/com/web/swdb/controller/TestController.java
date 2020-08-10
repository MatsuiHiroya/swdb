package com.web.swdb.controller;

import com.web.swdb.repository.ITestRepository;
import com.web.swdb.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    ITestService testService;

    @GetMapping("/test")
    public String hello(Model model) {
        testService.registerUser("pp","ff");
        model.addAttribute("text", "Thymeleaf with Maven");
        return "test";
    }
}
