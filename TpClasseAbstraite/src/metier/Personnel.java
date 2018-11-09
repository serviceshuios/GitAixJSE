package metier;

public abstract  class Personnel {
	private String nom;
	private String prenom;
	private int matricule;
	
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
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	@Override
	public String toString() {
		return "Personnel [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + "]";
	}
	
	public abstract float salaireBrut();
	public abstract int nbMoisTravailles();
	
	public float indemnitesConges() {
		return salaireBrut()*nbMoisTravailles()/12;
	}
}
