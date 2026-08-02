package com.springcore.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//auto wire
public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/com/springcore/annotation/anno.xml");
          Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
    }
}
