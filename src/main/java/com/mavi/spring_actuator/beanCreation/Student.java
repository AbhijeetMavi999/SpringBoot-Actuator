package com.mavi.spring_actuator.beanCreation;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student() {
        System.out.println("Creating the object of student!");
    }
}
