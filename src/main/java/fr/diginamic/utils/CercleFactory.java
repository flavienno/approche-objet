/**
 * 
 */
package fr.diginamic.utils;

import entites.Cercle;

/**
 * @author flavien cette classe a un m�thode de classe qui prend en param�tre un
 *         double et retourne un Cercle
 */
public class CercleFactory {

	public static Cercle nvcercle(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;
	}

}
