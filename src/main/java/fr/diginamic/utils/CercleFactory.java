/**
 * 
 */
package fr.diginamic.utils;

import entites.Cercle;

/**
 * @author flavien cette classe a un méthode de classe qui prend en paramètre un
 *         double et retourne un Cercle
 */
public class CercleFactory {

	public static Cercle nvcercle(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;
	}

}
