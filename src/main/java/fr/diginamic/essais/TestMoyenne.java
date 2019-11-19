/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * @author fla
 *	V�rifiez que votre classe CalculMoyenne correctement en effectuant au moins
	2 tests diff�rents
 */
public class TestMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculMoyenne moyenneTab = new CalculMoyenne();
		
		moyenneTab.ajout(17);
		moyenneTab.ajout(15);
		moyenneTab.ajout(16);

		double result = moyenneTab.calcul();
		System.out.println("La moyenne de ce tableau est "+ result  );

	}

}
 