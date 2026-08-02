package com.springJdbc;

import com.springJdbc.entities.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Jai Shri Ram!" );
        ApplicationContext context=
                //new AnnotationConfigApplicationContext(JavaConfig.class);
        new FileSystemXmlApplicationContext("src/main/java/com/springJdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();
        student.setId(21);
        student.setName("Rudra Pandey");
        student.setCity("New Delhi");
        int result = studentDao.insert(student);
        System.out.println("Student added " + result);
        
    }
}
