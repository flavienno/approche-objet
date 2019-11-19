package essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison = new Maison();

		maison.ajouterPiece(new Chambre(1, 12));
		maison.ajouterPiece(new Cuisine(1, 15));
		maison.ajouterPiece(new WC(0, 2));
		maison.ajouterPiece(new Salon(0, 35));

		System.out.println("La superficie totale est :" + maison.superficieTotale());
		System.out.println("La superficie de l'étage 0: " + maison.superficieEtage(0));
		System.out.println("La superficie de l'étage 1: " + maison.superficieEtage(1));

	}

}
