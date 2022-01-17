package fr.iutv.spring_framework.exemple_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEx03 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("application_context_03.xml");

		Message msg = (Message) applicationContext.getBean("salutation");
		System.out.println(msg.info());
	}

}
