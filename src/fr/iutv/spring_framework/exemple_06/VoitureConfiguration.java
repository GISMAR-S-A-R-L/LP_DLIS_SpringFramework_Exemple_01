package fr.iutv.spring_framework.exemple_06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoitureConfiguration {

	@Bean
	public Conducteur createConducteur() {
		Conducteur c = new Conducteur();
		c.setNom("Jean");
		return c;
	}

	@Bean
	public Voiture createV() {
		return new Voiture();
	}
}
