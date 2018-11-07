package metier;

public class ComptePayant extends Compte {
	//5% => 5
	private float pourcentage;

	public float getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	
	public void verser(double mt) {
		if(mt>0)
			{solde+=mt*(1-pourcentage/100);}
		else {
			System.out.println("MONTANT NEGATIF");
		}
	}
	
	public void retirer(double mt) {
		if (mt>0) {
			if (solde - mt * (1 + pourcentage / 100) >= 0) {
				solde -= mt * (1 + pourcentage / 100);
			} else {
				System.out.println("SOLDE INSUFFISANT");
			} 
		}
		else {
			System.out.println("ATTENTION MONTANT NEGATIF");
		}
	}
	@Override
	public String toString() {
		return "ComptePayant [pourcentage=" + pourcentage + ", toString()=" + super.toString() + "]";
	}
}