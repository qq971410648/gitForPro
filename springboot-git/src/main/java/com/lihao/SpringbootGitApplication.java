package com.lihao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lihao.dao")
@SpringBootApplication
public class SpringbootGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGitApplication.class, args);
    }

}
