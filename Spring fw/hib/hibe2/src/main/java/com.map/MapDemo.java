package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class MapDemo {
    public static void main(String[] args) {
        File file = new File("src/main/java/cfg.xml");

        Configuration cfg= new Configuration()
                .configure(file);
        SessionFactory sessionFactory =cfg.buildSessionFactory();
        //creating question
        Question question = new Question();
        question.setQuestionId(1212);
        question.setQuestion("What is java");
        //Creating answer
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is a Computer programming language");
        question.setAnswer(answer);

        //creating question2
        Question question1 = new Question();
        question1.setQuestionId(242);
        question1.setQuestion("What is collection framework");
        answer.setQuestion(question);
        question.setAnswer(answer);
        //Creating answer2
        Answer answer1 = new Answer();
        answer1.setAnswerId(344);
        answer1.setAnswer("Java API to work with objects in java language");
        answer1.setQuestion(question1);
        question.setAnswer(answer1);
        //session
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        //save
        s.persist(question);
        s.persist(answer);
        s.persist(question1);
        s.persist(answer1);

        tx.commit();
        //fetching.....
        Question newQ = (Question) s.get(Question.class, 1212);
        System.out.println(newQ.getQuestion());
        System.out.println(newQ.getAnswer().getAnswer());

        s.close();
        sessionFactory.close();
    }
}
