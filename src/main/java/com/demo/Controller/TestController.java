package com.demo.Controller;

import com.demo.Model.Test;
import com.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/api/test")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/db/test")
    public void test() {
        Test test = new Test(1L, "title", "contents");

        testService.save(test);
        return;
    }
}