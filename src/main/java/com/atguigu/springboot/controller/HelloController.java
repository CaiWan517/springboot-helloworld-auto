package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:wanzi
 * @date:2020/6/11 0011 10:27
 * @since:V
 * @desc:com.atguigu.springboot.controller
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET) //指定是get请求 【通用】
    //@GetMapping("/hello")  //默认get请求
    //@PostMapping("/hello")  //默认post请求
    //@PutMapping("/hello") //处理修改操作
    //@DeleteMapping("/hello")  //修改

    public String hello(){return "Hello,springboot...";}
}
