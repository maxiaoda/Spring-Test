package com.github.maxiaoda;

import com.github.maxiaoda.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Life {
    @Test
    public void test01() {
        //1.创建ioc容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("创建IOC容器完成");

        //关闭容器
        annotationConfigApplicationContext.close();
    }
}
