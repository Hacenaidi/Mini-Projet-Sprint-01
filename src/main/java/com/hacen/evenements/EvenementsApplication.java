package com.hacen.evenements;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hacen.evenements.model.Evenement;
import com.hacen.evenements.service.EvenementService;

@SpringBootApplication
public class EvenementsApplication  implements CommandLineRunner{
	
	@Autowired
	EvenementService evenementService;

	public static void main(String[] args) {
		SpringApplication.run(EvenementsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		evenementService.saveEvenement(new Evenement("Isec", 260.0, new Date()));
		evenementService.saveEvenement(new Evenement("Gamming", 280.0, new Date()));
		evenementService.saveEvenement(new Evenement("devops", 90.0, new Date()));
	}

}
