package com.ib.architecture.dao;
import java.util.List;
import com.ib.architecture.metier.Transaction;
/**
 * Classe d'interrogation de la base de données
 * @author Christian
 *
 */
public class DaoImpl implements Idao {

	@Override
	public int ajouterTransaction(Transaction t) {
		// TODO Auto-generated method stub
		System.out.println("j'ajoute une transaction");
		return 0;
	}

	@Override
	public int modifierTransaction(Transaction t) {
		// TODO Auto-generated method stub
		System.out.println("je modifie une transaction");
		return 0;
	}

	@Override
	public void supprimerTransaction(Transaction t) {
		// TODO Auto-generated method stub
		System.out.println("je supprime une transaction");
	}

	@Override
	public Transaction recupererTransaction(int numero) {
		// TODO Auto-generated method stub
		System.out.println("je récupère une transaction");
		return null;
	}

	@Override
	public List<Transaction> ListerTransaction() {
		// TODO Auto-generated method stub
		System.out.println("je liste les transactions");
		return null;
	}

}
