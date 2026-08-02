package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LCTest {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/com/springcore/lifecycle/lconfig.xml");
        //registering shutdown hook
        context.registerShutdownHook();
        Samosa s1 =(Samosa) context.getBean("s1");
        System.out.println(s1);


        System.out.println("____________________________________________");
        Pepsi p1 = (Pepsi) context.getBean("p1");
        System.out.println(p1);

        System.out.println("____________________________________________________");
        Example example =(Example) context.getBean("example");
        System.out.println(example);
    }
}
