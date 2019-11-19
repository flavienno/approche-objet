package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// instanciez une ArrayList de String contenant les éléments
		List<String> list = new ArrayList<>();
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		// Recherchez la ville dans cette liste qui a le plus grand nombre de
		// lettres
		int max = 0;
		String b = null;
		for (String a : list) {

			if (a.length() > max) {
				max = a.length();
				b = a;
			}
		}
		System.out.println("Voici la ville qui a le plus grand nombre de lettres :" + b);

		// Modifiez le contenu de la liste de manière à mettre tous les noms de
		// villes en
		// majuscules
		list.replaceAll(String::toUpperCase);

		// Supprimez de la liste les villes dont le nom commence par la lettre
		// N.
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i)).startsWith("N")) {
				list.remove(i);
			}

		}
		// Affichez la liste résultante
		System.out.println("Voici la nouvelle liste : " + list);
	}
}
