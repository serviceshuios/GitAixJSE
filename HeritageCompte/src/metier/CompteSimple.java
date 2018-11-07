package metier;

public class CompteSimple extends Compte {
	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public void retirer(double mt) {
		if (mt>0) {
			if (solde + decouvert >= mt) {
				solde -= mt;
			} else {
				System.out.println("PROVISION INSUFFISANTE");
			} 
		}
		else {
			System.out.println("ATTENTION MONTANT NEGATIF");
		}
	}
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}
}
