package com.ib.personnes.service;

import java.util.List;

import com.ib.personnes.dao.DaoImpl;
import com.ib.personnes.dao.Idao;
import com.ib.personnes.metier.Personne;

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

}
