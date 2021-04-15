package top.zysite.hello.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Hello控制器
 *
 * @author Leo
 * @create 2021/1/27 16:25
 **/
@RestController
@RequestMapping("hello")
public class HelloController {

//    @SentinelResource(value = "hello", fallback = "sentinelFallback")
    @GetMapping("sentinel")
    public String sentinel(){
        return "hello sentinel";
    }

//    @SentinelResource(value = "degrade", fallback = "sentinelFallback")
    @GetMapping("degrade")
    public String degrade(){
        //测试降级
        if(new Random().nextInt() % 2 == 0) {
            return "hello degrade";
        } else {
            throw new RuntimeException("RuntimeException");
        }
    }

    @GetMapping("param")
    public String paramFlowRule(String param1, Integer param2) {
        return "paramFlowRule";
    }

    public String sentinelFallback() {
        return "hello fallback";
    }
}