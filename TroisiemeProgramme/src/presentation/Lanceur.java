package presentation;

import metier.Holding;
/**
 * Classe contenant la m�thode main
 * @author christian
 */
public class Lanceur {
/**
 * La m�thode main main est le point d'entr�e de mon projet java SE
 * @param args param�tre de la m�thode main
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
