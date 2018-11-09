package metier;

public class SARL extends Societe {
	private double CAmax;

	public double getCAmax() {
		return CAmax;
	}

	public void setCAmax(double cAmax) {
		CAmax = cAmax;
	}

	@Override
	public String toString() {
		return "SARL [CAmax=" + CAmax + ", toString()=" + super.toString() + "]";
	}
}
