/**
 * 
 */
package essais;

import entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**
 * @author flavien
 *
 */
public class TestCercle {

	/**
	 * Instanciez 2 cercles différents et affichez les résultats des méthodes de
	 * calcul de périmètre et de calcul de surface
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Cercle[] Cercle = new Cercle[2];
		Cercle[0] = new Cercle(25);
		Cercle[1] = new Cercle(4);

		for (int i = 0; i < Cercle.length; i++) {
			System.out.println(Cercle[i]);
		}

		//dans la classe TestCercle, faites appel à la méthode static de CercleFactory pour créer
		//vos cercles.
		Cercle cercle3=CercleFactory.nvcercle(8);
		System.out.println("Le périmetre du cercle est égal à " + cercle3.perimetre() + "  et sa surface est égale à "+cercle3.surface() );
		
	}

}
