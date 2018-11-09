package com.ib.personnes.service;

import java.util.List;

import com.ib.personnes.dao.DaoImpl;
import com.ib.personnes.dao.Idao;
import com.ib.personnes.metier.Personne;
import com.ib.personnes.metier.Voiture;

public class ServiceImpl implements Iservice {

	//attribut de passage d'information à la couche Dao, important de l'initialiser 
		private Idao dao = new DaoImpl();
	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);
	}

	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifierPersonne(p);
	}

	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.supprimerPersonne(p);
	}

	@Override
	public Personne recupererPersonne(int numero) {
		// TODO Auto-generated method stub
		return dao.recupererPersonne(numero);
	}

	@Override
	public List<Personne> ListerPersonnes() {
		// TODO Auto-generated method stub
		return dao.ListerPersonnes();
	}

	@Override
	public int ajouterVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Voiture> listerVoitures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Voiture getVoiture(int idVoiture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int supprimerVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifierVoiture(Voiture v) {
		// TODO Auto-generated method stub
		
	}

}
