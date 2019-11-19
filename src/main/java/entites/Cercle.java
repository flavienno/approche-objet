package entites;

public class Cercle {
	private double rayon;

	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	

	// methode servant à calculer le perimetre d'un rayon
	public double perimetre() {
		double peri = rayon * 2 * 3.14159;
		return peri;
	}

	// methode servant à calculer la surface d'un rayon
	public double surface() {
		double surf = rayon * rayon * 3.14159;
		return surf;
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon
	 *            the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public String toString() {
		String str = "Le périmetre du cercle est égal à " + String.valueOf(perimetre()) + "  et sa surface est égale à "
				+ String.valueOf(surface());
		return str;

	}
}
