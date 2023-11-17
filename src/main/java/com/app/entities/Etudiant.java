package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer Id;
    @Column(nullable = false)
	public String nom;
    @Column(nullable = false)
	public String prenom;
	@Column()
	public Integer age;
	@ManyToOne
    @JoinColumn(name = "filiere_id", insertable = false, updatable = false)
    private Filiere filiere;
}
