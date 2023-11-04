package com.ll.exam1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Exam1Application {
    @GetMapping("/")
    @ResponseBody
    public String showHello() {
        return "안녕하세요.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Exam1Application.class, args);
    }

}
