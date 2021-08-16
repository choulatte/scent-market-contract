package com.choulatte.scentcontract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
public class ScentContractApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScentContractApplication.class, args);
    }

}
