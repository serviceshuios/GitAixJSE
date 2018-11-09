package metier;

public class SCI extends Societe {
	private int nbMaxApparts;

	public int getNbMaxApparts() {
		return nbMaxApparts;
	}

	public void setNbMaxApparts(int nbMaxApparts) {
		this.nbMaxApparts = nbMaxApparts;
	}

	@Override
	public String toString() {
		return "SCI [nbMaxApparts=" + nbMaxApparts + ", toString()=" + super.toString() + "]";
	}
}
