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
	 * méthode d'ajout d'une personne en base de données
	 * @param p personne à ajouter
	 * @return 1 si ok et 0 si pas ok
	 */
	public int ajouterPersonne(Personne p);
	/**
	 * méthode de modification d'une transaction en base de données
	 * @param p personne à modifier
	 * @return 1 si ok et 0 si pas ok
	 */
	public int modifierPersonne(Personne p);
	/**
	 * méthode de suppression d'une personne en base de données
	 * @param p personne à supprimer
	 */
	public void supprimerPersonne(Personne p);
	/**
	 * méthode de récupération de la personne à partir de son identifiant
	 * @param numero identifiant de la personne
	 * @return Personne 
	 */
	public Personne recupererPersonne(int numero);
	/**
	 * méthode de listage des personnes
	 * @return toutes les personnes
	 */
	public List<Personne> ListerPersonnes();
	
	public int ajouterVoiture(Voiture v);
	public List<Voiture> listerVoitures();
	public Voiture getVoiture(int idVoiture);
	public int supprimerVoiture(Voiture v);
	public void modifierVoiture(Voiture v);
}
