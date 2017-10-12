package com.siebre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jhonelee on 2017/8/25.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.siebre")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
