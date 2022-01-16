package fr.iutv.spring_framework.exemple_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEx01 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("application_context.xml");

		Message msg = (Message) applicationContext.getBean("salutation");
		System.out.println(msg.getText());
	}

}