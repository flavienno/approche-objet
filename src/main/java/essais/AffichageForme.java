/**
 * 
 */
package essais;

import fr.diginamic.forme.Forme;

/**
 * @author fla
 *
 */
public class AffichageForme {
		
		public void afficher(Forme form) {
			System.out.println("Le périmetre de ce "+form+ "est :"+form.calculerPerimetre());
			System.out.println("La surface de ce "+form+ "est :"+form.calculerSurface());
		}
}
