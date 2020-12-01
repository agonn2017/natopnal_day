package com.csdj101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka客户端注解
public class ProjectDataServiceApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(ProjectDataServiceApplication.class,args);
    }
}
