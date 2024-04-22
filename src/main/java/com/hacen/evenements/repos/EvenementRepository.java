package com.hacen.evenements.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hacen.evenements.model.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {

}
