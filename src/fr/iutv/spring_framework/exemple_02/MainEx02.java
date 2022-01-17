package fr.iutv.spring_framework.exemple_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEx02 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context_02.xml");
		Voiture voiture = (Voiture) applicationContext.getBean("maVoiture");
		
		System.out.println(voiture.info());

	}

}
