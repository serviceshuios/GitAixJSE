package metier;

public class Client extends Personne {

	private int numeroAdherent;

	public int getNumeroAdherent() {
		return numeroAdherent;
	}

	public void setNumeroAdherent(int numeroAdherent) {
		this.numeroAdherent = numeroAdherent;
	}

	@Override
	public String toString() {
		return "Client [numeroAdherent=" + numeroAdherent + ", toString()=" + super.toString() + "]";
	}
	
	
}
