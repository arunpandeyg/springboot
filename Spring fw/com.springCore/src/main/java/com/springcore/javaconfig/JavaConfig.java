package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component(basePackages="com.springcore.javaconfig")
public class JavaConfig {
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    //@Bean(name={"student", "temp", "con"}) //here in this way we can change the name of class in @Bean annotation
    @Bean
    public Student getStudent(){
        //creating a new student object
        Student student = new Student(getSamosa());
        return student;
    }
}
