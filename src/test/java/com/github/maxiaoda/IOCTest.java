package com.github.maxiaoda;

import com.github.maxiaoda.bean.Person;
import com.github.maxiaoda.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IOCTest {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    //    @Test
//    public void test01() {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println(name);
//        }
//    }
//
//    @Test
//    public void test02() {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
////        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
////        for (String name : beanDefinitionNames) {
////            System.out.println(name);
////        }
//        System.out.println("ioc创建完成");
//        Object person = annotationConfigApplicationContext.getBean("person");
//        Object person2 = annotationConfigApplicationContext.getBean("person");
//        System.out.println(person==person2);
//    }

    @Test
    public void test03() {
        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        for (String name :
                beanNamesForType) {
            System.out.println(name);
        }

        Map<String, Person> beansOfType = annotationConfigApplicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }
}