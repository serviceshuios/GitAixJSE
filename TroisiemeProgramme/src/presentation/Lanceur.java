package presentation;

import metier.Holding;
/**
 * Classe contenant la méthode main
 * @author christian
 */
public class Lanceur {
/**
 * La méthode main main est le point d'entrée de mon projet java SE
 * @param args paramètre de la méthode main
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Holding h1 = new Holding();
		 h1.setNom("Holding 1");
		 Holding h2 = new Holding("Holding h2", 2000000, "SASERTD");
		 
		 System.out.println(h1);
		 System.out.println(h2);
		
	}

}
