package metier;

import java.util.ArrayList;
import java.util.List;

public class Adresse {
	private int numero;
	private String rue;
	private String CP;
	private String ville;
	
	
	// Attribut de relation : une Adresse peut concerner plusieurs Sociétés
	private List<Societe> societes = new ArrayList<Societe>();
	private Pays pays;
	
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public List<Societe> getSocietes() {
		return societes;
	}
	public void setSocietes(List<Societe> societes) {
		this.societes = societes;
	}
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", CP=" + CP + ", ville=" + ville + "]";
	}
	
	
}
