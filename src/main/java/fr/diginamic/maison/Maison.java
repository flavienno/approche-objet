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

		// On doit agrandir le tableau initial de 1 � chaque ajout
		// d'une nouvelle pi�ce

		// On commence donc par cr�er un tableau temporaire appel� newTab
		// qui a une taille �gale � la tableau du tableau pieces+1
		Piece[] newTab = new Piece[pieces.length + 1];

		// On d�verse toutes les pi�ces du tableau pieces dans newTab
		for (int i = 0; i < pieces.length; i++) {
			newTab[i] = pieces[i];
		}

		// On place en derni�re position dans le nouveau tableau la nouvelle
		// pi�ce
		newTab[newTab.length - 1] = nvPiece;

		// Enfin on affecte newTab � pieces
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
	 * Retourne la superficie d'un �tage
	 * 
	 * @param choixEtage
	 *            choix de l'�tage
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
	 * Retourne la superficie total pour un type de pi�ce donn�
	 * 
	 * @param typePiece
	 *            type de pi�ce
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
