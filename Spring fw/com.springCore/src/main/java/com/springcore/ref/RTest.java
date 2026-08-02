package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RTest {
    public static void main(String[] args) {

        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/com/springcore/ref/confi.xml");

        A temp = (A) context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);
    }
}
