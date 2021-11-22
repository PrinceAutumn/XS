package com.ckcj.xs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller//注解  标识该类为一个控制器   项目功能入口类
public class IndexController {

    @RequestMapping("/index")// 让其他人知道当前我软件有这么一个名字叫index可以让你使唤
    @ResponseBody // 我只会给你数据,不会跟你走
    public <String> String index(){
       // return "success";
    }
}
