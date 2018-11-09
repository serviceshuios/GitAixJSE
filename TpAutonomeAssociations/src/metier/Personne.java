package metier;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	// Attribut de relation : une Personne peut diriger plusieurs Sociétés
	private List<Societe> societes = new ArrayList<Societe>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public List<Societe> getSocietes() {
		return societes;
	}
	public void setSocietes(List<Societe> societes) {
		this.societes = societes;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
