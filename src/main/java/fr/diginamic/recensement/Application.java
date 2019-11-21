/**
 * 
 */
package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @author fla
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// On cr�� la liste des villes
		List<Ville> villes = new ArrayList<Ville>();

		List<String> lignes = null;

		try {
			File file = new File("D:/recensement population 2016.csv");
			lignes = FileUtils.readLines(file, "UTF-8");

			// On supprime la ligne d'ent�te avec les noms des colonnes
			lignes.remove(0);

			for (String ligne : lignes) {
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[3];
				String nomCommune = morceaux[5];
				int populationTotale = Integer.parseInt(morceaux[6].replace(" ", "").trim());

				// On cree maintenant la ville avec toutes ses donn�es
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune,
						populationTotale);

				// On ajoute la ville � la liste des villes
				villes.add(ville);
			}
			// System.out.println("Nombre de lignes :" + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		// for (int i = 0; i < villes.size(); i++) {
		// System.out.println(villes.get(i).getNom());
		// }
		// Recherche et affichage de Montpellier
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNom().equals("Montpellier")) {
				System.out.println(villes.get(i));
			}

		}
		// Recherche et affichage de la population de l'H�rault
		int popDept = 0;
		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34")) {
				popDept += v.getPopulation();
			}
		}
		System.out.println("Population de l'H�rault :" + popDept);

		// Recherche et affichage de la plus petite ville de l'H�rault
		int popMin = Integer.MAX_VALUE;
		Ville villeMin = null;
		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34") && v.getPopulation() < popMin) {
				popMin = v.getPopulation();
				villeMin = v;
			}
		}
		System.out.println("Plus petite ville du d�partement :" + villeMin);
		// Alimentation d'une liste ne contenant que les villes du d�partement
		// 34
		List<Ville> villesDept = new ArrayList<>();
		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34")) {
				villesDept.add(v);
			}
		}

		// Afficher les 10 plus grandes villes du d�partement
		System.out.println("---------------------------------------------------");
		System.out.println("Affichage des 10 plus grandes villes du d�partement");
		Collections.sort(villesDept, new PlusGrandeVilleComparator());
		for (int i = 0; i < 10; i++) {
			System.out.println(villesDept.get(i));
		}

		// Afficher les 10 plus petites villes du d�partement
		System.out.println("----------------------------------------------------");
		System.out.println("Affichage des 10 plus grandes petites du d�partement");
		Collections.sort(villesDept, new PlusPetiteVilleComparator());
		for (int i = 0; i < 10; i++) {
			System.out.println(villesDept.get(i));
		}

	}
}
