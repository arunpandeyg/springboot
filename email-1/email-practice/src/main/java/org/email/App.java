package org.email;

import org.email.emailpractice.GemailSender;

/**
 * Arun Pandey
 *
 */
public class App 
{
    public static void main( String[] args ){
        GemailSender gemailSender = new GemailSender();
        String to = "arunpandeyom@gmail.com";
        String from = "arunpandeyntop@gmail.com";
        String subject = "Arun Pandey email practice project.";
        String text = "Hello, It's a practice project for java developers. Thanks ";
        boolean b = gemailSender.sendEmail(to, from, subject, text);
        if(b){
            System.out.println("Email is sent successfully.");
        }else{
            System.out.println("Email is not sent successfully.");
        }
    }
}
