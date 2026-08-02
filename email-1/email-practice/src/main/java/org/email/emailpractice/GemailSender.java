package org.email.emailpractice;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class GemailSender {
    public boolean sendEmail(String to, String from, String subject, String text){
        boolean result = false;
        //logic
        //smtp properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", 587);
        properties.put("mail.smtp.host", "smtp.gmail.com");
        final String username = "arunpandeytop";
        final String password = "ajzt zlqj suwc woiy";
        //session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try{
            Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setFrom(new InternetAddress(from));
            message.setSubject(subject);
            message.setText(text);

            Transport.send(message);
            result = true;


        }catch(Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
