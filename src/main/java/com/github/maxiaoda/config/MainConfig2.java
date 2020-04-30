package com.github.maxiaoda.config;

import com.github.maxiaoda.bean.Person;
import com.github.maxiaoda.condition.LinuxCondition;
import com.github.maxiaoda.condition.WindowsCondition;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig2 {

    //    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给ioc容器添加person...");
        return new Person("张三", 25);
    }

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person("bill", 60);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linux")
    public Person person02() {
        return new Person("Linux", 62);
    }

}
