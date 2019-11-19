package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		// Dans cette classe instanciez un HashSet de doubles et placez y les
		// éléments suivants :
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);

		// • Affichez tous les éléments de la collection
		for (double a : set) {
			System.out.println("Voici les éléments qui composent cette liste :" + a);
		}

		// Recherchez le plus grand élément de la collection
		Object valMax = Collections.max(set);
		System.out.println("La valeur max est : " + valMax);

		// Supprimez le plus petit élément de la collection
		Object valMin = Collections.min(set);
		set.remove(valMin);

		// • Affichez enfin le contenu de la collection ainsi modifiée
		System.out.println(set);
	}

}
