package com.hacen.evenements.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.hacen.evenements.model.Evenement;

public interface EvenementService {
	Evenement saveEvenement(Evenement e);
	Evenement updateEvenement(Evenement e);
	void deleteEvenement(Evenement e);
	 void deleteEvenementById(Long id);
	 Evenement getEvenement(Long id);
	List<Evenement> getAllEvenements();
	Page<Evenement> getAllEvenementsParPage(int page, int size);

}
