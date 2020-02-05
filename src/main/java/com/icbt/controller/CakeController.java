package com.icbt.controller;

import com.icbt.dto.Cake;
import com.icbt.repository.CakeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cake")
public class CakeController {

    @Autowired
    CakeRepositary cakeRepositary;

    @ResponseBody
    @PostMapping("/create")
    public ResponseEntity create(Cake cake) {
        Cake c = cakeRepositary.save(cake);
        if(c != null){
            return new ResponseEntity("Test", HttpStatus.OK);
        }
    return new ResponseEntity("Test", HttpStatus.BAD_REQUEST);
    }
}
