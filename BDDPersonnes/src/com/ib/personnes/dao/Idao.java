package com.ib.personnes.dao;

import java.util.List;

import com.ib.personnes.metier.Personne;
import com.ib.personnes.metier.Voiture;

/**
 * interface dao
 * @author ib
 *
 */
public interface Idao {
	/**
	 * m�thode d'ajout d'une personne en base de donn�es
	 * @param p personne � ajouter
	 * @return 1 si ok et 0 si pas ok
	 */
	public int ajouterPersonne(Personne p);
	/**
	 * m�thode de modification d'une transaction en base de donn�es
	 * @param p personne � modifier
	 * @return 1 si ok et 0 si pas ok
	 */
	public int modifierPersonne(Personne p);
	/**
	 * m�thode de suppression d'une personne en base de donn�es
	 * @param p personne � supprimer
	 */
	public void supprimerPersonne(Personne p);
	/**
	 * m�thode de r�cup�ration de la personne � partir de son identifiant
	 * @param numero identifiant de la personne
	 * @return Personne 
	 */
	public Personne recupererPersonne(int numero);
	/**
	 * m�thode de listage des personnes
	 * @return toutes les personnes
	 */
	public List<Personne> ListerPersonnes();
	
	public int ajouterVoiture(Voiture v);
	public List<Voiture> listerVoitures();
	public Voiture getVoiture(int idVoiture);
	public int supprimerVoiture(Voiture v);
	public void modifierVoiture(Voiture v);
}
