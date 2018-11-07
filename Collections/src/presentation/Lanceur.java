package presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		// Déclaration, ArrayList
		List al =new ArrayList();
		List<Integer> al2 = new ArrayList<Integer>();
		List<Personne> personnes = new ArrayList<Personne>();
		
		//Déclaration Set
		Set<Personne> mesPersonnes = new HashSet<Personne>();
		
		// Déclaration MAP
		Map<String,Personne> monRepertoire = new HashMap<String,Personne>();
		
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
		Personne p1 = new Personne("toto","titi",12);
		Personne p2 = new Personne("tata","tutu",15);
		Personne p3 = new Personne("zec","zec",20);
		Personne p4 = new Personne("pierre","paris",2);
		Personne p5 = new Personne("tutu","blabla",12);
		
		personnes.add(p1);
		personnes.add(p2);
		personnes.add(p3);
		personnes.add(p4);
		personnes.add(p5);
		personnes.add(p1);
		
		mesPersonnes.add(p1);
		mesPersonnes.add(p2);
		mesPersonnes.add(p3);
		mesPersonnes.add(p4);
		mesPersonnes.add(p5);
		mesPersonnes.add(p1);
		
		monRepertoire.put("PERS1", p1);
		monRepertoire.put("PERS2", p2);
		monRepertoire.put("PERS3", p3);
		monRepertoire.put("PERS4", p4);
		monRepertoire.put("PERS5", p5);
		//monRepertoire.put("PERS1", p4);
		
		//parcours
		for(int i=0;i<al.size();i++)
		{
			System.out.println("donnée à l'indice "+i+" ="+al.get(i));
		}
		
		System.out.println("------------PARCOURS LIST --------------------");
		// parcours
		for (Personne personne : personnes) {
			System.out.println(personne);
		}
		
		System.out.println("------------PARCOURS SET --------------------");
		
		for (Personne personne : mesPersonnes) {
			System.out.println(personne);
		}
		
		System.out.println("------------PARCOURS MAP --------------------");
		
		for (Map.Entry<String, Personne> p : monRepertoire.entrySet()) {
            System.out.println(p.getKey()+" "+p.getValue());
        }
		
	}

}
