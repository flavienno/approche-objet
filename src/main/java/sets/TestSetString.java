/**
 * 
 */
package sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fla
 *
 */
public class TestSetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Dans cette classe instanciez un HashSet de String contenant les
		// éléments suivants
		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		// Recherchez le pays dans cette liste qui a le plus grand nombre de
		// lettres
		int max = 0;
		String b = null;
		for (String a : set) {
			if (a.length() > max) {
				max = a.length();
				b = a;
			}
		}
		System.out.println("Voici le pays qui a le plus grand nombre de lettres :" + b);

		// Supprimez ce pays
		set.remove(b);

		// Affichez enfin le contenu de la collection ainsi modifiée
		System.out.println("Voici le contenu modifié :" + set);

	}
}
