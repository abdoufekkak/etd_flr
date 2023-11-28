package com.app.Mappers;

import org.springframework.stereotype.Component;

import com.app.DTO.DtoRequestEtudiant;
import com.app.DTO.DtoRespenseEtudiant;
import com.app.entities.Etudiant;

import jakarta.persistence.Column;

@Component
public class MapperEtudiant {
	public Etudiant requestEtudiantToEtudiant(DtoRequestEtudiant dtoRequestEtudiant) {
		Etudiant etudiant = new Etudiant();
	 
		
	 
		
		etudiant.setNom(dtoRequestEtudiant.getNom());
		etudiant.setPrenom(dtoRequestEtudiant.getPrenom());
		etudiant.setAge(dtoRequestEtudiant.getAge());
		etudiant.setNote(dtoRequestEtudiant.getNote());
		etudiant.setHasBacLibre(dtoRequestEtudiant.getHasBacLibre());

		
		return etudiant;

	}
		public DtoRespenseEtudiant EtudiantToEtudiantResponseDto(Etudiant etudiant) {
			DtoRespenseEtudiant dtoRespenseEtudiant =new DtoRespenseEtudiant();
			
			dtoRespenseEtudiant.setNom(etudiant.getNom());
			dtoRespenseEtudiant.setPrenom(etudiant.getPrenom());
			dtoRespenseEtudiant.setAge(etudiant.getAge());
			dtoRespenseEtudiant.setId(etudiant.getId());
			dtoRespenseEtudiant.setNote(etudiant.getNote());
			dtoRespenseEtudiant.setHasBacLibre(etudiant.getHasBacLibre());

			return dtoRespenseEtudiant;
		} 
}
