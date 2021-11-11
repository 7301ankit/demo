package com.EmployeId.springInitlizerDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controler {
    @RequestMapping("demo")
    public String helloWorld(){
        return "hello from spring boot";
    }
}
