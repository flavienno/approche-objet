/**
 * 
 */
package sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fla
 *
 */
public class Pays  {

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

	public static void main(String[] args) {
		// Cr�ez une classe Pays poss�dant 3 attributs : nom, nb d�habitants,
		// PIB/habitant.

		// � Cr�ez un HashSet de pays contenant les pays suivants avec les
		// informations correctes
		// de nombre d�habitants et de PIB/Hab:
		Set<Pays> set = new HashSet<>();
		Pays p1 = new Pays("USA", 331883986, 62641);
		set.add(p1);
		Pays p2 = new Pays("France", 66992699, 41464);
		set.add(p2);
		Pays p3 = new Pays("Allemagne", 83042235, 48196);
		set.add(p3);
		Pays p4 = new Pays("UK", 66465641, 42491);
		set.add(p4);
		Pays p5 = new Pays("Italie", 60494785, 34318);
		set.add(p5);
		Pays p6 = new Pays("Japon", 126330302, 39287);
		set.add(p6);
		Pays p7 = new Pays("Chine", 1394112547, 9771);
		set.add(p7);
		Pays p8 = new Pays("Russie", 146716295, 11289);
		set.add(p8);
		Pays p9 = new Pays("Inde", 1358408567, 2016);
		set.add(p9);
		// System.out.println(set);

		// Recherchez le pays avec le PIB/habitant le plus important
		Pays max = new Pays("", 0, 0);
		for (Pays a : set) {
			if (max.getPibHab() < a.getPibHab()) {
				max = a;
			}
		}
		System.out.println("Le pays avec le PIB/habitant le plus important est :" + max.getNom());
		// Recherchez le pays avec le PIB total le plus important
		Pays max1 = new Pays("", 0, 0);
		for (Pays a : set) {
			if ((max1.getPibHab() * max1.getNbHab()) < (a.getPibHab() * a.getNbHab())) {
				max1 = a;
			}
		}
		System.out.println("Le pays avec le PIB total le plus important est :" + max.getNom());

		// Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a
		// le PIB total le plus petit
		Pays min = new Pays("", 0, 0);
		for (Pays a : set) {
			if ((max1.getPibHab() * max1.getNbHab()) > (a.getPibHab() * a.getNbHab())) {
				min = a;
			}
		}
		System.out.println("Le pays avec le PIB total le moins important est :" + min.getNom().toLowerCase());
		// Supprimez le pays dont le PIB total est le plus petit
		set.remove(min);

		// Affichez l�ensemble des pays ainsi modifi�s avec leur nom, nombre
		// d�habitants et PIB tota
		System.out.println(set);
		
		
	}
 
	public int compareTo(Pays pays2) {
		int result = this.nom.compareTo(pays2.getNom());
		return result;
	}
}
