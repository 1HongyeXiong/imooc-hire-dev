package com.imooc.controller;

import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("u")
public class HelloController {

    @GetMapping ("hello")
    public Object hello() {
        return "Hello UserService~";
    }

    @Autowired
    private StuService stuService;


    @GetMapping("Stu")
    public Object stu() {
        Stu stu = new Stu();
        stu.setAge(18);
        stu.setName("jame");
        //stu.setId(1002);因为用了assign id,所以不用设置了id
        stuService.save(stu);
        return "ok";

    }
}

