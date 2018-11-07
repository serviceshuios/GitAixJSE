package metier;
/**
 * Classe de struturation des soci�tes Holding
 * @author Christian
 */
public class Holding {
	private String nom;
	private int chiffreAff;
	private String codeAPE;
	
	/**
	 * Constructeur sans argument
	 */
	public Holding() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur prenant tous les attributs de la classe Holding
	 * @param nom nom de la soci�t�
	 * @param chiffreAff chiffre d'affaire de la soci�t�
	 * @param codeAPE code entreprise de la soci�t�
	 */
	public Holding(String nom, int chiffreAff, String codeAPE) {
		super();
		this.nom = nom;
		this.chiffreAff = chiffreAff;
		this.codeAPE = codeAPE;
	}

	// Getter et Setter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getChiffreAff() {
		return chiffreAff;
	}
	public void setChiffreAff(int chiffreAff) {
		this.chiffreAff = chiffreAff;
	}
	/**
	 * Methode permettant de r�cup�rer le code APE
	 * @return le code APE
	 */
	public String getCodeAPE() {
		return codeAPE;
	}
	public void setCodeAPE(String codeAPE) {
		this.codeAPE = codeAPE;
	}
	/**
	 * Methode d'affichage de la Holding
	 */
	@Override
	public String toString() {
		return "Holding [nom=" + nom + ", chiffreAff=" + chiffreAff + ", codeAPE=" + codeAPE + "]";
	}
	
	
}
