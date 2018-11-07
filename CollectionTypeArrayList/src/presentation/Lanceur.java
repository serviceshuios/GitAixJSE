package presentation;

import java.util.ArrayList;
import java.util.List;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		// D�claration
		List al =new ArrayList();
		List<Integer> al2 = new ArrayList<Integer>();
		List<Personne> personnes = new ArrayList<Personne>();
		
		// ajout
		al.add(12);
		al.add("bonjour");
		al.add(12f);
		al.add(true);
		al.add(12);
		al.add('d');
		al.add('d');
		
		al2.add(15);
		al2.add(25);
		
		personnes.add(new Personne("toto","titi",12));
		personnes.add(new Personne("tata","tutu",15));
		personnes.add(new Personne("zec","zec",20));
		personnes.add(new Personne("pierre","paris",2));
		personnes.add(new Personne("tutu","blabla",12));
		
		//parcours
		for(int i=0;i<al.size();i++)
		{
			System.out.println("donn�e � l'indice "+i+" ="+al.get(i));
		}
		
		// parcours
		for (Personne personne : personnes) {
			System.out.println(personne);
		}

	}

}