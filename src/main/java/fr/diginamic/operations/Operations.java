/**
 * 
 */
package fr.diginamic.operations;

/**
 * @author fla o cette classe a une m�thode static calcul qui prend en param�tre
 *         2 double a et b et un op�rateur qui est de type char. o Si
 *         l�op�rateur vaut �+� alors la m�thode calcul retourne a+b o Si
 *         l�op�rateur vaut �-� alors la m�thode calcul retourne a-b o Faites la
 *         m�me chose pour les op�rateurs *et /
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
