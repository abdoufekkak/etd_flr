package com.app.reposotiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Filiere;



public interface RepoFiliere extends JpaRepository<Filiere, Integer>{
	
	public Filiere findByName(String nom);
}
