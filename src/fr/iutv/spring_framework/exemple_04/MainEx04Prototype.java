package fr.iutv.spring_framework.exemple_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEx04Prototype {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context_04.xml");

		System.out.println("Salutation en mode 'prototype'");
		System.out.println("Création du message01");
		Message message01 = (Message) applicationContext.getBean("salutation_prototype");
		System.out.println("\tmessage01 : " + message01.info());
		message01.setId(20);
		System.out.println("\tsetting id : " + message01.getId());
		message01.setText(message01.getText() + " (id : " + message01.getId() + ")");
		System.out.println("\tmessage01 : " +message01.info());

		System.out.println("Création du message02");
		Message message02 = (Message) applicationContext.getBean("salutation_prototype");
		System.out.println("\tmessage02 : " + message02.info());
		message02.setId(30);
		System.out.println("\tsetting id : " + message02.getId());
		message02.setText(message02.getText() + " (id : " + message02.getId() + ")");
		System.out.println("\tmessage02 : " + message02.info());
	}

}
