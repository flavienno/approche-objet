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
	 * Instanciez 2 cercles diff�rents et affichez les r�sultats des m�thodes de
	 * calcul de p�rim�tre et de calcul de surface
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

		//dans la classe TestCercle, faites appel � la m�thode static de CercleFactory pour cr�er
		//vos cercles.
		Cercle cercle3=CercleFactory.nvcercle(8);
		System.out.println("Le p�rimetre du cercle est �gal � " + cercle3.perimetre() + "  et sa surface est �gale � "+cercle3.surface() );
		
	}

}
