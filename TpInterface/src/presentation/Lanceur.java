package presentation;

import metier.IPersonne;
import metier.Personne;
import metier.Voiture;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPersonne p = new Personne();
		p.bonjour();
		System.out.println(p.identite());
		
		IPersonne p2 = new Voiture();
		p2.bonjour();
		System.out.println(p2.identite());
	}

}
