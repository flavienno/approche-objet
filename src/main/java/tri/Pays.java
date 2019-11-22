package tri;

public class Pays implements Comparable<Pays> {

	private String nom;
	private double nbHab;
	private int pibHab;

	/**
	 * @param nom
	 * @param nbHab
	 * @param pibHab
	 */

	public Pays(String nom, double nbHab, int pibHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}

	/**
	 * @param nbHab
	 * @param pibHab
	 */
	public Pays(double nbHab, int pibHab) {
		super();
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHab
	 */
	public double getNbHab() {
		return nbHab;
	}

	/**
	 * @param nbHab
	 *            the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	/**
	 * @return the pibHab
	 */
	public int getPibHab() {
		return pibHab;
	}

	/**
	 * @param pibHab
	 *            the pibHab to set
	 */
	public void setPibHab(int pibHab) {
		this.pibHab = pibHab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pays : nom = " + nom + "\n population = " + nbHab + "\n PIB par habitant = " + pibHab;
	}

	// Implémentez la méthode compareTo de manière à ce que le tri se fasse sur
	// le nom du pays (par ordre alphabétique)
	@Override
	public int compareTo(Pays pays2) {
		int result = this.nom.compareTo(pays2.getNom());
		return result;
	}

}
