package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/com/springcore/collections/conf.xml");
        Emp emp1 = (Emp) context.getBean("emp1");

        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getProps());
        System.out.println(emp1.getPhones().getClass().getName());



    }
}
