/**
 * 
 */
package fr.diginamic.operations;

/**
 * @author fla o cette classe a une méthode static calcul qui prend en paramètre
 *         2 double a et b et un opérateur qui est de type char. o Si
 *         l’opérateur vaut ‘+’ alors la méthode calcul retourne a+b o Si
 *         l’opérateur vaut ‘-‘ alors la méthode calcul retourne a-b o Faites la
 *         même chose pour les opérateurs *et /
 *
 */
public class Operations {

	public static double calcul(double a, double b, char c) {
		double result = 0;
		if (c == '+') {

			result = a + b;

		}
		if (c == '-') {

			result = a - b;
		}
		if (c == '*') {

			result = a * b;

		}
		if (c == '/') {

			result = a / b;

		}
		return result;
	}
}
