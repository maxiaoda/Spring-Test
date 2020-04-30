package com.github.maxiaoda.config;

import com.github.maxiaoda.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.github.maxiaoda.bean")
@Configuration
public class MainConfigOfLifeCycle {

//    @Scope("prototype")
//    @Bean(initMethod = "init",destroyMethod = "destroy")
//    public Car car() {
//        return new Car();
//    }
}
