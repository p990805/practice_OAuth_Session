package com.practice.oauth_session_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/my")
    public String myPage(){
        return "myPage";
    }
}
