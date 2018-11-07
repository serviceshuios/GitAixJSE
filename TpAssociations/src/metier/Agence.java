package metier;

import java.util.ArrayList;
import java.util.List;

public class Agence {
	private int numeroAgence;
	private String nomAgence;
	//attribut de relation
	private List<Client> clients = new ArrayList<Client>();
	
	public int getNumeroAgence() {
		return numeroAgence;
	}
	public void setNumeroAgence(int numeroAgence) {
		this.numeroAgence = numeroAgence;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	@Override
	public String toString() {
		return "Agence [numeroAgence=" + numeroAgence + ", nomAgence=" + nomAgence + "]";
	}
}
