package com.hacen.evenements;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.hacen.evenements.model.Evenement;
import com.hacen.evenements.service.EvenementService;
import com.hacen.evenements.repos.EvenementRepository;

@SpringBootTest
class EvenementsApplicationTests {
	@Autowired
	private EvenementRepository EvenementRepository;
	@Autowired
	private EvenementService EvenementService;
	@Test
	public void testCreateEvenement() {
	Evenement Even = new Evenement("Crepto Art",100.00,new Date());
	EvenementRepository.save(Even);
	}

	 @Test
	 public void testFindEvenement()
	 {
		 Evenement e = EvenementRepository.findById(4L).get();
	 System.out.println(e);
	 }
	 @Test
	 public void testUpdateEvenement()
	 {
		 Evenement e = EvenementRepository.findById(2L).get();
	 e.setCapacite(200.0);
	 EvenementRepository.save(e);
	 }
	 @Test
	 public void testDeleteEvenement()
	 {
		 EvenementRepository.deleteById(3L);;
	 }

	 @Test
	 public void testListerTousEvenement()
	 {
	 List<Evenement> Even = EvenementRepository.findAll();
	 for (Evenement e : Even)
	 {
	 System.out.println(e);
	 }
	 }
	 @Test
	 public void testFindByNomProduitContains()
	 {
	 Page<Evenement> even = EvenementService.getAllEvenementsParPage(0,2);
	 System.out.println(even.getSize());
	 System.out.println(even.getTotalElements());
	 System.out.println(even.getTotalPages());
	 even.getContent().forEach(e -> {System.out.println(e.toString());
	  });
	 
	 }

}
