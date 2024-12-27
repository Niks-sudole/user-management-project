package com.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
        @RequestMapping("/welcome")
        public String welcome() {
            String text = "this is private page ";
            text+= "this page is not allowed to unauthenticated users";
            return text;
        }
}