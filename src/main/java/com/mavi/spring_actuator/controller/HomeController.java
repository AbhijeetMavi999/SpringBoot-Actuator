package com.mavi.spring_actuator.controller;

import com.mavi.spring_actuator.beanCreation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private Student student;

    @GetMapping("/user/info")
    public Map<String, String> getUserInfo() {
        return Map.of("Name", "Abhijeet Mavi");
    }
}
