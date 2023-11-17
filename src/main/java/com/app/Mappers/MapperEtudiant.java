package com.app.Mappers;

import com.app.DTO.DtoRequestEtudiant;
import com.app.DTO.DtoRespenseEtudiant;
import com.app.entities.Etudiant;

public class MapperEtudiant {
	public Etudiant requestEtudiantToEtudiant(DtoRequestEtudiant dtoRequestEtudiant) {
		Etudiant etudiant = new Etudiant();
		
		etudiant.setNom(dtoRequestEtudiant.getNom());
		etudiant.setPrenom(dtoRequestEtudiant.getPrenom());
		etudiant.setAge(dtoRequestEtudiant.getAge());
		return etudiant;

	}
		public DtoRespenseEtudiant EtudiantToEtudiantResponseDto(Etudiant etudiant) {
			DtoRespenseEtudiant dtoRespenseEtudiant =new DtoRespenseEtudiant();
			
			dtoRespenseEtudiant.setNom(etudiant.getNom());
			dtoRespenseEtudiant.setPrenom(etudiant.getPrenom());
			dtoRespenseEtudiant.setAge(etudiant.getAge());
			dtoRespenseEtudiant.setId(etudiant.getId());
			return dtoRespenseEtudiant;
		} 
}
