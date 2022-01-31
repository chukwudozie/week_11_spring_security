package com.emeka.monday_assgt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    public ResponseEntity<?> registerUser(@RequestBody UserInfo user){
        return new ResponseEntity<>(new UserInfo(), HttpStatus.CREATED);
    }
}
