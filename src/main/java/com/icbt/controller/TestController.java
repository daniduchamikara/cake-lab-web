package com.icbt.controller;

import com.icbt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping("/create")
    public ResponseEntity testController(){
        return testService.testController();
    }
}
