package com.xworkz.fileUpload.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SendMail {

    @Autowired
    JavaMailSender javaMailSender;

    public String getOTP(){
        Random random =  new Random();
        return  String.valueOf(random.nextInt(99999));
    }

    public  void sendMail(){
        String otp = getOTP();
        SimpleMailMessage mailMessage =  new SimpleMailMessage();
        mailMessage.setFrom("malodeprasad666@gmail.com");
        mailMessage.setTo("prasadbm666@gmail.com");
        mailMessage.setSubject("otp");
        mailMessage.setText(otp);
        javaMailSender.send(mailMessage);
    }


    public void sendSimpleMessage(String to, String subject, String text) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@baeldung.com");
        message.setTo();
        message.setSubject(subject);
        message.setText(text);
        javaMailSender.send(message);

    }


}
