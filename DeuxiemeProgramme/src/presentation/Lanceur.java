package presentation;
import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		// instanciation de l'objet personne
		Personne p = new Personne();
		p.setNom("TOTO");
		
		Personne p2 = new Personne("TITI", "TATA", 12);
		
		//appel de la m�thode d'affichage
		p.affiche();
		System.out.println(p);
		
		p2.affiche();
		System.out.println(p2);
	}
}
