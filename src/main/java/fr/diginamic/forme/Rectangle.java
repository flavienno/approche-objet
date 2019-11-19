/**
 * 
 */
package fr.diginamic.forme;

/**
 * @author fla
 *
 */
public class Rectangle extends Forme {
		/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

		private double longueur;
		private double largeur;
	/* (non-Javadoc)
	 * @see fr.diginamic.forme.Forme#calculerSurface()
	 */
		
	@Override
	public
	double calculerSurface() {
		double surfaceRect = (this.longueur + this.largeur) * 2;
		return surfaceRect;
	}

	/**
	 * 
	 */
	

	/* (non-Javadoc)
	 * @see fr.diginamic.forme.Forme#calculerPerimetre()
	 */
	@Override
	public
	double calculerPerimetre() {
		double perimetreRect = this.longueur * this.largeur;
		return perimetreRect;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle de longueur = " + longueur + ",et de largeur = " + largeur;
	}
	
}
