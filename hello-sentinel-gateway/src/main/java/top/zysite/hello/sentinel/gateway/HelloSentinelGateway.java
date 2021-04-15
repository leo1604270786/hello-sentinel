package top.zysite.hello.sentinel.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Leo
 * @create 2021/4/9 16:34
 **/
@SpringBootApplication

public class HelloSentinelGateway {
    public static void main(String[] args) {
        //设置为网关类型
        System.setProperty("csp.sentinel.app.type", "1");
        SpringApplication.run(HelloSentinelGateway.class, args);
    }
}