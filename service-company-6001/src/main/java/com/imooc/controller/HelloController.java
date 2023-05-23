package com.imooc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("c")
public class HelloController {

    @GetMapping("hello")
    public Object hello() {
        return "Hello UserService~";
    }
}

