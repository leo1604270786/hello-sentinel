package top.zysite.hello.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo
 * @create 2021/4/29 19:16
 **/
@RestController
@RequestMapping("v1/test")
public class TestController {

    @GetMapping("hello")
    public String testHello() {
        return "TestController.testHello";
    }
}