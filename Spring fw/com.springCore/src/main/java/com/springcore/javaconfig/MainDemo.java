package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainDemo {
    public static void main(String[] args) {
        //ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/springcore/jc/config.xml");
        //Student student = context.getBean("firstStudent", Student.class);
                ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
                Student student = context.getBean("getStudent", Student.class);
                System.out.println(student);
                student.study();


    }
}
