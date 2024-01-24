package org.notebook.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@Slf4j
public class authController {


    @PostMapping("/signup")
    public ResponseEntity<?> signup(){
//        if isUserCreated(){
//
//        }
      // User save = userRepository.save(user);
       return ResponseEntity.ok("success");

    }

    @PostMapping("/login")
    public static void login(){

    }
}
