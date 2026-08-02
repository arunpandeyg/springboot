package com.springcore.standaloneCollections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/com/springcore/standaloneCollections/alone.xml");
         Person person1 =  context.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println(person1.getFriend().getClass().getName());
        System.out.println("-----------------------------------------------------------");
        System.out.println(person1.getFeeStructure());
        System.out.println(person1.getFeeStructure().getClass().getName());
        System.out.println("-----------------------------------------------------------");
        System.out.println(person1.getProperties());
    }
}
