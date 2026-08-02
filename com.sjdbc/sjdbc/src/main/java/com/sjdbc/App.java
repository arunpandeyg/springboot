package com.sjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Jai Shri Ram!");
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("com/sjdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        //insert query
        String query = "insert into student(id, name,city) value(?, ?, ?)";
        int result = template.update(query, 21, "Rudra Pandey", "New Delhi");
         System.out.println("Number of records inserted.. " +result);
    }
}
