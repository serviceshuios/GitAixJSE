package com.ib.personnes.presentation;

import java.util.List;

import com.ib.personnes.metier.Personne;
import com.ib.personnes.service.Iservice;
import com.ib.personnes.service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iservice service = new ServiceImpl();
		
		/*Personne p = new Personne();
		p.setNom("ZECUNION");
		p.setPrenom("UNION");
		p.setAge(20);
		service.ajouterPersonne(p);*/
		/*List<Personne> res = service.ListerPersonnes();
		
		for (Personne personne : res) {
			System.out.println(personne);
		}
		System.out.println(service.recupererPersonne(2));
		
		Personne p = service.recupererPersonne(2);
		service.supprimerPersonne(p);*/
		Personne p = service.recupererPersonne(1);
		p.setNom("TOTO");
		p.setPrenom("TITI");
		p.setAge(12);
		service.modifierPersonne(p);
	}

}
