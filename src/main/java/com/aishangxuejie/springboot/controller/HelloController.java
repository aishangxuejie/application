package com.aishangxuejie.springboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Cuigm
 * @Description:  
 * @date: 2018年12月24日下午4:01:50 （日期）
 */
@RestController
public class HelloController {

    @ResponseBody
    @GetMapping(value = "/")
    public String hello(){
        return "Hello Aishangxuejie ！";
    }
    @ResponseBody
    @GetMapping(value = "/getLovers")
    public String getLovers(){
        return "学姐！学姐！学姐！";
    }
}
