package metier;

public class Pays {
	private int numeroPays;
	private String nomPays;
	// Attribut de relation : un Pays aura une adresse de société
	private Adresse adresse;
	// Atribut de relation : un Pays aura un CodePays
	private CodePays codePays;
	
	
	public int getNumeroPays() {
		return numeroPays;
	}
	public void setNumeroPays(int numeroPays) {
		this.numeroPays = numeroPays;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public CodePays getCodePays() {
		return codePays;
	}
	public void setCodePays(CodePays codePays) {
		this.codePays = codePays;
	}
	@Override
	public String toString() {
		return "Pays [numeroPays=" + numeroPays + ", nomPays=" + nomPays + ", adresse=" + adresse + ", codePays="
				+ codePays + "]";
	}
	

}
