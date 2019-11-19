/**
 * 
 */
package fr.diginamic.forme;

/**
 * @author Fla
 *
 */
public class Cercle extends Forme {
		/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

		/**
	 * 
	 */


		private double rayon;
	/* (non-Javadoc)
	 * @see fr.diginamic.forme.Forme#calculerSurface()
	 */
		
	@Override
	public
	double calculerSurface() {
		double surfaceCercle = Math.PI * Math.pow(this.rayon, 2);
		return surfaceCercle;
	}

	/* (non-Javadoc)
	 * @see fr.diginamic.forme.Forme#calculerPerimetre()
	 */
	@Override
	public
	double calculerPerimetre() {
		double perimetreCercle = (2 * Math.PI * rayon);
		return perimetreCercle;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cercle de rayon = " + rayon ;
	}
	
}
