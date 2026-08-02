package org.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


public class App {

    public static void main(String[] args ) throws IOException
    {
        System.out.println( "Jai shri Ram!" );
        //File class file variable to read file
        File file = new File("src/main/java/cfg.xml");

        Configuration cfg= new Configuration()
                .configure(file);
        SessionFactory sessionFactory =cfg.buildSessionFactory();

        //creating student

        Student student = new Student();
        student.setId(109);
        student.setName("Rudra Pandey");
        student.setCity("Delhi");
        System.out.println(student);

        //creating object of address class

        Address address = new Address();
        address.setStreet("s1");
        address.setCity("Delhi");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(1234);
        //reading image
        FileInputStream fis = new FileInputStream("src/main/java/org/practice/me.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        address.setImage(data);

        //Session session = sessionFactory.openSession();  //for current if starting openSession();
        Session session = sessionFactory.getCurrentSession();

        //session.beginTransaction();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        session.persist(address);

        //session.getTransaction().commit();

        transaction.commit();
        session.close();
        System.out.println("Done");
    }


}
