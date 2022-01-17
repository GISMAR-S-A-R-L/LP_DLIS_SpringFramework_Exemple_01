package fr.iutv.spring_framework.exemple_06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEx06 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(VoitureConfiguration.class);
		Voiture voiture = (Voiture) applicationContext.getBean(Voiture.class);
		voiture.setPlaque("AR-560-RR");

		System.out.println(voiture.info());

	}

}
