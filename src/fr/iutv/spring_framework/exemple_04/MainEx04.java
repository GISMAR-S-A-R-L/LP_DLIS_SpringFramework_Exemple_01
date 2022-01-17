package fr.iutv.spring_framework.exemple_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEx04 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context_04.xml");

		Message msg = (Message) applicationContext.getBean("salutation");
		System.out.println("1=>" + msg.info());
		msg.setId(20);
		System.out.println("2=>" +msg.info());

		Message msg1 = (Message) applicationContext.getBean("salutation");
		System.out.println("3=>" +msg1.info());
		msg1.setId(30);
		
		System.out.println("4=>" +msg1.info());
		System.out.println("5=>" +msg.info());
	}

}
