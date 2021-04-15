package top.zysite.hello.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloSentinelApplication {

//    // nacos server ip
//    private static final String remoteAddress = "localhost:8848";
//    // nacos group
//    private static final String groupId = "Sentinel_Hello";
//    // nacos dataId
//    private static final String dataId = "hello.sentinel.flow.rule";
//
//    private static void loadRules() {
//        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>(remoteAddress, groupId, dataId,
//                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
//                }));
//        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
//    }

    public static void main(String[] args) {
//        loadRules();
        SpringApplication.run(HelloSentinelApplication.class, args);
    }



}
