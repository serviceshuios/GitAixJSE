package metier;

import java.util.ArrayList;
import java.util.List;

public class Societe {
	private int numero;
	private String nom;
	private double CA;
	// Attribut de relation : une Société peut être dirigée par plusieurs Personnes
	private List<Personne> personnes = new ArrayList<Personne>();
	private Adresse adresse;
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getCA() {
		return CA;
	}
	public void setCA(double cA) {
		CA = cA;
	}
	@Override
	public String toString() {
		return "Societe [numero=" + numero + ", nom=" + nom + ", CA=" + CA + "]";
	}

}
