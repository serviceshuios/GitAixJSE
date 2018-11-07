package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private int identifiant;
	private String nom;
	private String prenom;
	//Attribut de relation
	private Compte compte;
	private Agence agence;
	private List<Club> clubs = new ArrayList<Club>();
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public List<Club> getClubs() {
		return clubs;
	}
	public void setClubs(List<Club> clubs) {
		this.clubs = clubs;
	}
	@Override
	public String toString() {
		return "Client [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}
