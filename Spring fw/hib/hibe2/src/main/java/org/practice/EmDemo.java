package org.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class EmDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/cfg.xml");

        Configuration cfg= new Configuration()
                .configure(file);
        SessionFactory sessionFactory =cfg.buildSessionFactory();
        Student student1 = new Student();
        student1.setId(21);
        student1.setName("Raj Pandey");
        student1.setCity("Delhi");
        Certificate certificate = new Certificate();
        certificate.setCourse("Android");
        certificate.setDuration("2 months");
        student1.setCerti(certificate);

        Student student2 = new Student();
        student2.setId(22);
        student2.setName("Raje Pandey");
        student2.setCity("Delhi");
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("CSS");
        certificate1.setDuration("2.5 months");
        student2.setCerti(certificate1);
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();

        //object save
        s.persist(student1);
        s.persist(student2);

        tx.commit();
        s.close();
        sessionFactory.close();
    }











}
