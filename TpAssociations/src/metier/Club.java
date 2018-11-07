package metier;

import java.util.ArrayList;
import java.util.List;

public class Club {
	private int numeroClub;
	private String nomClub;
	//attributs de relation
	private List<Client> clients = new ArrayList<Client>();
	
	public int getNumeroClub() {
		return numeroClub;
	}
	public void setNumeroClub(int numeroClub) {
		this.numeroClub = numeroClub;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	@Override
	public String toString() {
		return "Club [numeroClub=" + numeroClub + ", nomClub=" + nomClub + "]";
	}
}
