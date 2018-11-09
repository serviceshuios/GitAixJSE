package com.ib.architecture.service;

import java.util.List;

import com.ib.architecture.dao.DaoImpl;
import com.ib.architecture.dao.Idao;
import com.ib.architecture.metier.Transaction;
/**
 * Classe d'implémentation de la couche service
 * @author ib
 *
 */
public class ServiceImpl implements Iservice {
	//attribut de passage d'information à la couche Dao, important de l'initialiser 
	private Idao dao = new DaoImpl();
	
	@Override
	public int ajouterTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return dao.ajouterTransaction(t);
	}

	@Override
	public int modifierTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return dao.modifierTransaction(t);
	}

	@Override
	public void supprimerTransaction(Transaction t) {
		// TODO Auto-generated method stub
		 dao.supprimerTransaction(t);
	}

	@Override
	public Transaction recupererTransaction(int numero) {
		// TODO Auto-generated method stub
		return dao.recupererTransaction(numero);
	}

	@Override
	public List<Transaction> ListerTransaction() {
		// TODO Auto-generated method stub
		return dao.ListerTransaction();
	}

}
