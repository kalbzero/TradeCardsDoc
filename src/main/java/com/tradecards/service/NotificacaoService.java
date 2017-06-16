package com.tradecards.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

	@Autowired
    private ConfigurableApplicationContext c;
	
	private JavaMailSender javaMailSender;

	/* Constructor */
	public NotificacaoService(ConfigurableApplicationContext c, JavaMailSender javaMailSender) {
		this.c = c;
		this.javaMailSender = javaMailSender;
	}
	
	/* Methods */
	public SimpleMailMessage enviarNotificacao(SimpleMailMessage mail) throws MailException {
        javaMailSender.send(mail);
        return mail;
    }
	
	public SimpleMailMessage enviarNotificacao(Map<String,String> object) throws MailException {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo(object.get("to"));
        mail.setFrom(c.getEnvironment().getProperty("spring.mail.username"));
        mail.setSubject(object.get("subject"));
        mail.setText(object.get("text"));
        javaMailSender.send(mail);
        return mail;
    }
	
	
}
