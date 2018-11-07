package presentation;

import metier.Fruit;
import metier.Orange;
import metier.Pomme;

public class Lanceur {

	public static void main(String[] args) {
		// déclaration d'un tableau
				Fruit[] lesFruits;
		// initialisation d'un tableau
				lesFruits = new Fruit[3];
		//ajout d'elements dans un tableau
				Fruit fruit = new Fruit();
				fruit.setPoids(12);
				
				Pomme pomme = new Pomme(15);
				
				Orange orange = new Orange(13);
				
			lesFruits[0]=fruit;
			lesFruits[1]=pomme;
			lesFruits[2]=orange;	
		// parcours d'un tableau

			for(int i=0;i<lesFruits.length;i++)
			{
				lesFruits[i].affiche();
				if(lesFruits[i] instanceof Pomme)
					{
					   // Casting explicite
						((Pomme)lesFruits[i]).affichePoids();
					}
				if(lesFruits[i] instanceof Orange)
				{
				   // Casting explicite
					((Orange)lesFruits[i]).affichePoids();
				}
			}
	}

}
