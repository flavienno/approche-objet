/**
 * 
 */
package fr.diginamic.chaine;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

/**
 * @author FLA
 *
 */
public class ManipulationChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		// Utilisez la méthode charAt(int index) pour afficher le premier
		// caractère de la chaine de caractère
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		// 2) Utilisez la méthode length() pour afficher la taille de la chaine
		// de caractères
		int taille = chaine.length();
		System.out.println("Taille de la chaine de caractères: " + taille);
		// Utilisez la méthode indexOf(char c) pour afficher l’index du premier
		// « ; » contenu dans la chaine de caractères
		int ind = chaine.indexOf(';');
		System.out.println("Voici l'index recherché: " + ind);
		// La méthode substring(int start, int end) permet d’extraire une
		// portion de chaine de caractères comprise entre
		// un index de début et un index de fin (exclu).
		// Combinez la méthode substring et indexOf pour extraire le nom de
		// famille de la personne
		int inde = chaine.indexOf('d');
		// System.out.println(inde);
		String nomFamille = chaine.substring(0, inde + 1);
		System.out.println("Voici le nom de famille recherché: " + nomFamille);
		// Utilisez la méthode toUpperCase() pour afficher le nom de famille en
		// majuscules
		System.out.println("Voici le nom de famille recherché: " + nomFamille.toUpperCase());
		// Utilisez la méthode toLowerCase() pour afficher le nom de famille en
		// minuscule.
		System.out.println("Voici le nom de famille recherché: " + nomFamille.toLowerCase());
		// Utilisez la méthode split pour découper la chaine de caractères en
		// morceaux. Le
		// séparateur est le caractère « ; ». Cette méthode retourne un tableau.
		// Affichez le tableau ainsi obtenu.
		String tab[] = chaine.split(";");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		// Creez une instance et Client et de Compte à partir des éléments issus
		// du découpage de la chaine de caractères
		Personne pers = new Personne(tab[0], tab[1]);
		
		// instanciation du compte 
		int numCompte = Integer.parseInt(tab[2]);
		System.out.println(numCompte);
		
		//String nvStrC = new String(tab[3]);
		String nvNvStrc=tab[3].replace(" ","");
		double solde = Double.parseDouble(nvNvStrc);
		//System.out.println(nvNvStrc);
		
		Compte nvCompte = new Compte(numCompte, solde);
		System.out.println(pers);
		System.out.println(nvCompte);

	}

}
