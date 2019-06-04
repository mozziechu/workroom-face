package com.cdthings.watchtower;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.cdthings.watchtower.dao")
public class WatchtowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatchtowerApplication.class, args);
    }

}
