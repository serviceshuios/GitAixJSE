package metier;

public class Voiture implements IPersonne {

	@Override
	public void bonjour() {
		System.out.println("BONJOUR INTERFACE JE SUIS LA CLASSE VOITURE");

	}

	@Override
	public String identite() {
		// TODO Auto-generated method stub
		return "identite dans voiture";
	}

}
