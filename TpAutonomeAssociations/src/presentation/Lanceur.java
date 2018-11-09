package presentation;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Pays;
import metier.Personne;
import metier.SARL;
import metier.SCI;
import metier.Societe;

public class Lanceur {

	public static void main(String[] args) {
		SCI soc = new SCI();
		soc.setNbMaxApparts(50);
		soc.setNom("KRC");
		soc.setNumero(123456);
		
		SARL srl = new SARL();
		srl.setCAmax(200000);
		srl.setNom("IB");
		srl.setNumero(963);
		
		Personne p1 = new Personne();
		p1.setId(15);
		p1.setNom("neffaa");
		p1.setPrenom("Salah");
		
		Personne p2 = new Personne();
		p2.setId(159);
		p2.setNom("affen");
		p2.setPrenom("halas");
		
		Personne p3 = new Personne();
		p2.setId(123);
		p2.setNom("ZEC");
		p2.setPrenom("union");
		
		Pays pays= new Pays();
		pays.setNomPays("France");
		
		Adresse ad1 = new Adresse();
		ad1.setNumero(115);
		ad1.setRue("rue des lilas");
		ad1.setCP("13090");
		ad1.setVille("Aix en provence");
		ad1.setPays(pays);
		
		Adresse ad2 = new Adresse();
		ad2.setNumero(11);
		ad2.setRue("rue des sablons");
		ad2.setCP("75000");
		ad2.setVille("Paris");
		ad2.setPays(pays);
		
		
		List<Personne> listePersonnes = new ArrayList<Personne>();
		listePersonnes.add(p1);
		listePersonnes.add(p2);
		
		List<Personne> listePersonnes2 = new ArrayList<Personne>();
		listePersonnes2.add(p1);
		listePersonnes2.add(p3);
		
		srl.setPersonnes(listePersonnes);
		srl.setAdresse(ad1);
		
		soc.setPersonnes(listePersonnes2);
		soc.setAdresse(ad2);
		
		// Mettre les societes dans une liste
		List<Societe> societes = new ArrayList<Societe>();
		societes.add(srl);
		societes.add(soc);
		
		//Affichage des sociétés
		for (Societe societe : societes) {
			System.out.println(societe);
			System.out.println("\t"+societe.getAdresse());
			System.out.println("\t---propriétaires de la societe---");
			for (Personne personne : societe.getPersonnes()) {
				System.out.println("\t"+personne);
			}
		}
		
	}

}