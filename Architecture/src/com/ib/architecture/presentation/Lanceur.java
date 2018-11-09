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
	 * m�thode main
	 * @param args param�tres de lancement
	 */
	public static void main(String[] args) {
		// attribut de passage d'information � la couche service
		Iservice service = new ServiceImpl();
		
		Transaction t = new Transaction();
		
		service.ajouterTransaction(t);
		
	}

}
