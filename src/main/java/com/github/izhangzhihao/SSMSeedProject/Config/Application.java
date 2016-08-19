package com.github.izhangzhihao.SSMSeedProject.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@EnableCaching
@SpringBootApplication(scanBasePackages = "com.github.izhangzhihao.SSMSeedProject")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
