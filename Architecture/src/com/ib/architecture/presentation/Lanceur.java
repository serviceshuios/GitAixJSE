package com.ib.architecture.presentation;

import com.ib.architecture.metier.Transaction;
import com.ib.architecture.service.Iservice;
import com.ib.architecture.service.ServiceImpl;
/**
 * Classe de lancement du programme
 * @author ib
 *
 */
public class Lanceur {
	/**
	 * méthode main
	 * @param args paramètres de lancement
	 */
	public static void main(String[] args) {
		// attribut de passage d'information à la couche service
		Iservice service = new ServiceImpl();
		
		Transaction t = new Transaction();
		
		service.ajouterTransaction(t);
		
	}

}
