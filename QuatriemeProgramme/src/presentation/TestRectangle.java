package presentation;

import java.util.Scanner;
import metier.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		//0-pr�paration de la r�cup�ration des infos du clavier
		 Scanner clavier = new Scanner(System.in);
		//1-r�cuperer les valeurs saisies par l'utilisateur
		System.out.println("veuillez saisir la longueur:");
		Double longueur = clavier.nextDouble();
		System.out.println("veuillez saisir la largeur:");
		Double largeur = clavier.nextDouble();
		
		//2- construire l'objet
		Rectangle r=new Rectangle(longueur, largeur);
		//3- faire l'operation
		r.affiche();
		System.out.println(r);
	}

}