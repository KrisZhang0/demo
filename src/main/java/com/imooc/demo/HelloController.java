package com.imooc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String hello(){
        return "Hello  SpringBoot!!";
    }

}
