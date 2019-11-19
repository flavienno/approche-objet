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
		// Utilisez la m�thode charAt(int index) pour afficher le premier
		// caract�re de la chaine de caract�re
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caract�re: " + premierCaractere);
		// 2) Utilisez la m�thode length() pour afficher la taille de la chaine
		// de caract�res
		int taille = chaine.length();
		System.out.println("Taille de la chaine de caract�res: " + taille);
		// Utilisez la m�thode indexOf(char c) pour afficher l�index du premier
		// � ; � contenu dans la chaine de caract�res
		int ind = chaine.indexOf(';');
		System.out.println("Voici l'index recherch�: " + ind);
		// La m�thode substring(int start, int end) permet d�extraire une
		// portion de chaine de caract�res comprise entre
		// un index de d�but et un index de fin (exclu).
		// Combinez la m�thode substring et indexOf pour extraire le nom de
		// famille de la personne
		int inde = chaine.indexOf('d');
		// System.out.println(inde);
		String nomFamille = chaine.substring(0, inde + 1);
		System.out.println("Voici le nom de famille recherch�: " + nomFamille);
		// Utilisez la m�thode toUpperCase() pour afficher le nom de famille en
		// majuscules
		System.out.println("Voici le nom de famille recherch�: " + nomFamille.toUpperCase());
		// Utilisez la m�thode toLowerCase() pour afficher le nom de famille en
		// minuscule.
		System.out.println("Voici le nom de famille recherch�: " + nomFamille.toLowerCase());
		// Utilisez la m�thode split pour d�couper la chaine de caract�res en
		// morceaux. Le
		// s�parateur est le caract�re � ; �. Cette m�thode retourne un tableau.
		// Affichez le tableau ainsi obtenu.
		String tab[] = chaine.split(";");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		// Creez une instance et Client et de Compte � partir des �l�ments issus
		// du d�coupage de la chaine de caract�res
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
