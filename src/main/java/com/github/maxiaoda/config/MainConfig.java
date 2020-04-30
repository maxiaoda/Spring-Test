package com.github.maxiaoda.config;

import com.github.maxiaoda.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(value = "com.github.maxiaoda", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = BookService.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)},
        useDefaultFilters = false)
public class MainConfig {

    @Bean("person")
    public Person person() {
        return new Person("lisi", 12);
    }

}
