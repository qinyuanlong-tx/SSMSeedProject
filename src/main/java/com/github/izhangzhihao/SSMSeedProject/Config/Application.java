package com.github.izhangzhihao.SSMSeedProject.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(scanBasePackages = "com.github.izhangzhihao.SSMSeedProject")
//@MapperScan("sample.mybatis.mapper")
public class Application {

    /*@Autowired
    private CityMapper cityMapper;*/


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
    }*/
}
