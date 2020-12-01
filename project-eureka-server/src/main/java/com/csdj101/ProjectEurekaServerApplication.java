package com.csdj101;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //服务注册中心
public class ProjectEurekaServerApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(ProjectEurekaServerApplication.class,args);
    }
}
