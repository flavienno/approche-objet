/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * @author fla classe TestOperations qui permet de tester les 4 opérations.
 */
public class TestOperations {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(Operations.calcul(3, 5, '+'));
		System.out.println(Operations.calcul(6, 7, '-'));
		System.out.println(Operations.calcul(8, 6, '*'));
		System.out.println(Operations.calcul(9, 3, '/'));

	}

}
