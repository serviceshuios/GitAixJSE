package presentation;

import java.util.Scanner;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) {
		
		int choixNiveau1=100;
		int choixNiveau2=100;
		System.out.println("------------------------MENU-------------------------");
		System.out.println("TAPER 0 pour quitter");
		System.out.println("TAPER 1 pour afficher les cr�ations de compte");
		System.out.println("-------------------------------------------------");
		Scanner clavier = new Scanner(System.in);
		choixNiveau1=clavier.nextInt();
		
		while(choixNiveau1!=0) {
			if(choixNiveau1==1) {
				System.out.println("-----------------CREATION DES TYPES DE COMPTES-------------------");
				System.out.println("TAPER 1 POUR CREER UN COMPTE");
				System.out.println("TAPER 2 POUR CREER UN COMPTE SIMPLE");
				System.out.println("TAPER 3 POUR CREER UN COMPTE EPARGNE");
				System.out.println("TAPER 4 POUR CREER UN COMPTE PAYANT");
				System.out.println("TAPER 0 POUR QUITTER");
				System.out.println("------------------------------------------");
				choixNiveau2=clavier.nextInt();
				while(choixNiveau2!=0)
				{
					switch (choixNiveau2) {
					case 1:
						System.out.println("-------------------------------------------");
						System.out.println("CREATION COMPTE");
						System.out.println("veuillez taper le code");
						int code = clavier.nextInt();
						System.out.println("veuillez taper le solde initial");
						double solde = clavier.nextDouble();
						Compte c = new Compte(code, solde);
						System.out.println(c);
						System.out.println("-----------------CREATION DES TYPES DE COMPTES-------------------");
						System.out.println("TAPER 1 POUR CREER UN COMPTE");
						System.out.println("TAPER 2 POUR CREER UN COMPTE SIMPLE");
						System.out.println("TAPER 3 POUR CREER UN COMPTE EPARGNE");
						System.out.println("TAPER 4 POUR CREER UN COMPTE PAYANT");
						System.out.println("TAPER 0 POUR QUITTER");
						System.out.println("------------------------------------------------------------------");
						choixNiveau2=clavier.nextInt();
						
						break;

					default:
						System.out.println("TAPER 1 POUR CREER UN COMPTE");
						System.out.println("TAPER 2 POUR CREER UN COMPTE SIMPLE");
						System.out.println("TAPER 3 POUR CREER UN COMPTE EPARGNE");
						System.out.println("TAPER 4 POUR CREER UN COMPTE PAYANT");
						System.out.println("TAPER 0 POUR QUITTER");
						choixNiveau2=clavier.nextInt();
						break;
					}
				}
			}
			
			else {
				System.out.println("MENU");
				System.out.println("TAPER 0 pour quitter");
				System.out.println("TAPER 1 pour afficher les cr�ations de compte");
				choixNiveau1=clavier.nextInt();
			}

		}
		System.out.println("AU REVOIR");
		clavier.close();
	}

}
