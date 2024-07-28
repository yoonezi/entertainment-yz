package com.yz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.yz.core"})
@EntityScan(basePackages = {"com.yz.core"})
@EnableJpaRepositories(basePackages = {"com.yz.core"})
@SpringBootApplication
@PropertySource({"classpath:application.yml"})
@EnableFeignClients
public class EntertainmentApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(EntertainmentApiApplication.class, args);
    }
}