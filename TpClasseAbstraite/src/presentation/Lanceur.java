package presentation;

import java.util.ArrayList;
import java.util.List;

import metier.Cadre;
import metier.Employe;
import metier.Personnel;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cadre c = new Cadre();
		c.setNom("ZEC");
		c.setPrenom("UNION");
		c.setMatricule(10501);
		
		Employe e = new Employe();
		e.setNom("toto");
		e.setPrenom("titi");
		e.setMatricule(51204);
		
		//Créer un liste de Personnel
		List<Personnel> liste = new ArrayList<Personnel>();
		liste.add(c);
		liste.add(e);
		
		//Parcourir la liste pour afficher toutes les infos
		for (Personnel personnel : liste) {
				System.out.println(personnel);
				System.out.println("\tSalaire Brut="+personnel.salaireBrut());
				System.out.println("\tMois Travaillés="+personnel.nbMoisTravailles());
				System.out.println("\tindemnités congés ="+personnel.indemnitesConges());
		}
		
	}

}
