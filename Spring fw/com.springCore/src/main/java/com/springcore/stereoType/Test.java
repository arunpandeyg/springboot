package com.springcore.stereoType;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
         AbstractApplicationContext context =
         new FileSystemXmlApplicationContext("src/main/java/com/springcore/stereoType/stereo.xml");
         Student student = context.getBean("student", Student.class);
         System.out.println(student);
         System.out.println(student.getAddress());
         System.out.println(student.getAddress().getClass().getName());
         System.out.println(student.hashCode());  //singleton
         //Student student2 = student.getBean("ob", Student.class);
         //System.out.println(student2.hashCode());
         //Teacher t1 = student.getBean("teacher",Teacher.class );
        // Teacher t2 = student.getBean("teacher",Teacher.class );


    }
}
