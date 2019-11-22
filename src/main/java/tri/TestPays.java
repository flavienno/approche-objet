package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestPays {

	public static void main(String[] args) {
		List<Pays> pays = new ArrayList<>();
		pays.add(new Pays("USA", 331883986, 62641));
		pays.add(new Pays("France", 66992699, 41464));
		pays.add(new Pays("Allemagne", 83042235, 48196));
		pays.add(new Pays("UK", 66465641, 42491));
		pays.add(new Pays("Italie", 60494785, 34318));
		pays.add(new Pays("Japon", 126330302, 39287));
		pays.add(new Pays("Chine", 1394112547, 9771));
		pays.add(new Pays("Russie", 146716295, 11289));
		pays.add(new Pays("Inde", 1358408567, 2016));

		// Implémentez la méthode compareTo de manière à ce que le tri se fasse
		// sur le nom du
		// pays (par ordre alphabétique)
		Collections.sort(pays);
		System.out.println("Voici un tri effectué sur le nom du pays : ");
		for (Pays p : pays) {
			System.out.println(p);
		}

		// Implémentez la méthode compareTo pour faire un tri sur le nombre
		// d’habitants
		Collections.sort(pays, new ComparatorHabitant());
		System.out.println("Voici un tri effectué sur le nombre d'habitants : ");
		for (Pays p : pays) {
			System.out.println(p);
		}
		// Implémentez la méthode compareTo pour faire un tri sur le pib par hab
		Collections.sort(pays, new ComparatorPibHabitant());
		System.out.println("Voici un tri effectué sur le PIB par habitant : ");
		for (Pays p : pays) {
			System.out.println(p);
		}
	}
}
