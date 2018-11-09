package metier;

public class CodePays {
	private int numeroCode;
	private String commentaires;
	// Attribut de relation : CodePays désigne un Pays
	private Pays pays;
	
	
	public int getNumeroCode() {
		return numeroCode;
	}
	public void setNumeroCode(int numeroCode) {
		this.numeroCode = numeroCode;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "CodePays [numeroCode=" + numeroCode + ", commentaires=" + commentaires + ", pays=" + pays + "]";
	}

}
