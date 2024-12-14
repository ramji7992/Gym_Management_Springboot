package com.rj.services.implementation;

import com.rj.binding.CustomerBean;
import com.rj.binding.OwnerBean;
import com.rj.services.ICustomerService;
import com.rj.services.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MailService implements IMailService {
    @Autowired
    ICustomerService service;
    @Autowired
    private JavaMailSender mailSender;
    @Override
    public void  sendMail(OwnerBean ob) {
        SimpleMailMessage message = new SimpleMailMessage();
        String subject = "Congratulation";
        String text = "Congratulation, " +ob.getName() + "\nYou are now a caretaker of Fitness World Gym" +
                "\nNow You can visit to your account.\nHere is your credentials. \n UserName: " +ob.getUserName()+
                "\nPassword : " + ob.getPassword();
        message.setTo(ob.getMail());
        message.setText(text);
        message.setSubject(subject);
        mailSender.send(message);
    }

    @Override
    public void sendMail(CustomerBean cb) {
        SimpleMailMessage message = new SimpleMailMessage();
        String subject = "Fitness World GYM";
        String text = "Hello "+cb.getFirstName()+" "+cb.getLastName()+" Congrats!!"+
                "\n\ngreetings From Fitness World Gym, You have successfully registered with us."+
                "\nYour Registration Id is : " + cb.getId();
        message.setTo(cb.getMail());
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }

    @Override
    public void sendMail(Integer id) {
        SimpleMailMessage message = new SimpleMailMessage();
        String subject = "Menbership Renewal";
        String text = "Congratulation! You have successfully renewed your GYM Membership.";
        message.setTo(service.getCustomer(id));
        message.setText(text);
        message.setSubject(subject);
        mailSender.send(message);
    }

}
