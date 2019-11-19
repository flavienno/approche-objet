/**
 * 
 */
package fr.diginamic.maison;

/**
 * @author fla
 *
 */
public class Maison {

	private Piece[] pieces;

	public Maison() {
		pieces = new Piece[0];
	}

	public void ajouterPiece(Piece nvPiece) {

		// On doit agrandir le tableau initial de 1 à chaque ajout
		// d'une nouvelle pièce

		// On commence donc par créer un tableau temporaire appelé newTab
		// qui a une taille égale à la tableau du tableau pieces+1
		Piece[] newTab = new Piece[pieces.length + 1];

		// On déverse toutes les pièces du tableau pieces dans newTab
		for (int i = 0; i < pieces.length; i++) {
			newTab[i] = pieces[i];
		}

		// On place en dernière position dans le nouveau tableau la nouvelle
		// pièce
		newTab[newTab.length - 1] = nvPiece;

		// Enfin on affecte newTab à pieces
		this.pieces = newTab;
	}

	public double superficieTotale() {
		double superficiTot = 0;

		for (int i = 0; i < pieces.length; i++) {
			superficiTot = superficiTot + this.pieces[i].getSuperficie();
		}
		return superficiTot;
	}

	/**
	 * Retourne la superficie d'un étage
	 * 
	 * @param choixEtage
	 *            choix de l'étage
	 * @return double
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == this.pieces[i].getNumeroEtg()) {
				superficieEtage = superficieEtage + this.pieces[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	/**
	 * Retourne la superficie total pour un type de pièce donné
	 * 
	 * @param typePiece
	 *            type de pièce
	 * @return double
	 */
	public double superficieTypePiece(String typePiece) {
		double superficie = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (typePiece != null && typePiece.equals(this.pieces[i].getType())) {
				superficie = superficie + this.pieces[i].getSuperficie();
			}
		}

		return superficie;
	}
}
