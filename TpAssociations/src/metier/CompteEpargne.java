package metier;

public class CompteEpargne extends Compte {
	//taux 0.05 = 5%
	private double taux;

	
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CompteEpargne(int code, double solde) {
		super(code, solde);
		// TODO Auto-generated constructor stub
	}


	public CompteEpargne(double solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}


	public CompteEpargne(int code, double solde, double taux) {
		super(code, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public double calculInterets() {
		double interet = solde*taux;
		solde+=interet;
		return interet;
	}
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + ", toString()=" + super.toString() + "]";
	}
}
