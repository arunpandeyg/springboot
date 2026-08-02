package com.springcore.ci;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CiTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/com/springcore/ci/ciconfig.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
        Addition add =(Addition) context.getBean("add");
        add.doSum();

    }
}
