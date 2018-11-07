package presentation;

public class Lanceur {

	public static void main(String[] args) {
		// déclaration d'un tableau
		int[] liste;
		// initialisation d'un tableau
		liste = new int[11];
		//ajout d'elements dans un tableau
		liste[0]=5;
		liste[5]=12;
		liste[7]=23;
		// parcours d'un tableau
		for(int i=0;i<liste.length;i++)
		{
			System.out.println(liste[i]);
		}
	}

}
