/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author fla
 *
 */
public abstract class Intervenant {

	String nom;
	String prenom;

	/**
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract int getsalaire();

	public abstract String afficherDonnees();

}
