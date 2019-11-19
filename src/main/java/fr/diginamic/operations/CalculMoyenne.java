/**
 * 
 */
package fr.diginamic.operations;

/**
 * @author fla o Cette classe a un attribut d�instance de type tableau de
 *         double. o Le constructeur de la classe CalculMoyenne n�a pas de
 *         param�tre o Cette classe a �galement une m�thode ajout qui permet
 *         d�ajouter un double au tableau. Vous aurez besoin de g�rer
 *         l�agrandissement du tableau. o Cr�ez une m�thode calcul qui calcule
 *         et retourne la moyenne des �l�ments du tableau
 */
public class CalculMoyenne {
	private double tab[] = new double[0];

	public CalculMoyenne() {

	}

	public void ajout(double valeur) {
		double[] tab2 = new double[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tab2[i] = tab[i];
		}
		tab2[tab2.length - 1] = valeur;
		tab = tab2;

	}

	public double calcul() {
		double somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i];
		}
		return (somme / tab.length);
	}
}
