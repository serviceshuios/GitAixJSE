package metier;

public class Fruit {
	protected int poids;

	
	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void affiche()
	{
		System.out.println("C'est un fruit ");
	}
}
