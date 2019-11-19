package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ville implements Comparable<Ville> {

	// Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
	private String nom;
	private int nbHabitant;

	/**
	 * @param nom
	 * @param nbHabitant
	 */
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	//public static Comparator<Ville> ComparatorHabitant = new Comparator<Ville>() {
	     
//        public int compare(Ville t, Ville t1) {
//            return t.getNbHabitant() - t1.getNbHabitant();
//        }
//        public int compare(Ville ville1, Ville ville2) {
//            return (int) (ville1.getNbHabitant() - ville2.getNbHabitant());
//        }
    

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant
	 *            the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public static void main(String[] args) {

		// Créez une ArrayList de ville
		List<Ville> list = new ArrayList<>();
		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Carcassonne", 47800);
		Ville ville3 = new Ville("Narbonne", 53400);
		Ville ville4 = new Ville("Lyon", 484000);
		Ville ville5 = new Ville("Foix", 9700);
		Ville ville6 = new Ville("Pau", 77200);
		Ville ville7 = new Ville("Marseille", 850700);
		Ville ville8 = new Ville("Tarbes", 40600);

		// Recherchez et affichez la ville la plus peuplée
//		Collections.sort(list, Ville.ComparatorHabitant);
//		  
//		  System.out.println("La ville la plus peuplée est :");
//		  for(Ville ville:list)
//		   System.out.println(ville);
		
		
		
//		double max = 0;
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getNbHabitant()>max){
//				max=list.get(i).getNbHabitant();
//				System.out.println(max);
//			}
//			//System.out.println("La ville la plus peuplée est : "+);
//		}
		
		
//		double b = 0;
//		for (double a : list) {
//
//			if (a > max) {
//				max = a;
//				b = a;
//			}
//		}
		//System.out.println("Voici la ville la plus peuplée :" + b);

	}

	@Override
	public int compareTo(Ville arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
