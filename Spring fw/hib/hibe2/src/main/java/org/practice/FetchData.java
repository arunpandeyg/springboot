package org.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class FetchData {
    public static void main(String[] args) {
        //get and load
        File file = new File("src/main/java/cfg.xml");

        Configuration cfg= new Configuration()
                .configure(file);
        SessionFactory sessionFactory =cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        //get-student 109
        //Student student = (Student) session.get(Student.class, 109);
        Student student = session.get(Student.class, 109);
        //Student student = session.load(Student.class, 109);
        System.out.println(student);

        //Address address = (Address) session.get(Address.class, 1);
        Address address =  session.get(Address.class, 1);
        //System.out.println(address.getStreet());
        System.out.println(address.getStreet() + " : " + address.getCity());


        session.close();
        sessionFactory.close();
    }
}
