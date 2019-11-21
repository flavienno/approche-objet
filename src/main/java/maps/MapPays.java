/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sets.Pays;

/**
 * @author fla
 *
 */
public class MapPays {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// creez une map permettant de stocker les instances de pays (valeur)en
		// fonction de leur nom (cl�)
		Map<String, Pays> mapPays = new HashMap<>();
		mapPays.put("USA", new Pays(331883986, 62641));
		mapPays.put("France", new Pays(66992699, 41464));
		mapPays.put("Allemagne", new Pays(83042235, 48196));
		mapPays.put("UK", new Pays(66465641, 42491));
		mapPays.put("Italie", new Pays(60494785, 34318));
		mapPays.put("Japon", new Pays(126330302, 39287));
		mapPays.put("Chine", new Pays(1394112547, 9771));
		mapPays.put("Russie", new Pays(146716295, 11289));
		mapPays.put("Inde", new Pays(1358408567, 2016));

		// Recherchez et supprimez le pays qui a le moins d’habitant

		long nbrMin = Long.MAX_VALUE;

		Iterator<Pays> iterator = mapPays.values().iterator();
		while (iterator.hasNext()) {
			Pays pays = iterator.next();
			if (pays.getNbHab() < nbrMin) {
				// long l =(new Double(pays.getNbHab()).longValue());
				nbrMin = (new Double(pays.getNbHab()).longValue());
				iterator.remove();
			}
		}
		// Affichez l’ensemble des pays restants.
		System.out.println(mapPays);

	}
}
