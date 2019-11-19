package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		// Affichez tous les éléments de la liste
		for (Integer a : list) {
			System.out.println("Voici les éléments qui composent cette liste :" + a);
		}

		// Affichez la taille de la liste
		System.out.println("Taille de cette liste :" + list.size());

		// • Recherchez et affichez le plus grand élément de la liste
		Object valMax = Collections.max(list);
		System.out.println("La valeur max est : " + valMax);

		// Supprimez le plus petit élément de la liste et affichez le résultat
		Object valMin = Collections.min(list);
		list.remove(valMin);
		System.out.println(list);

		// Recherchez tous les éléments négatifs et modifiez les de manière à ce
		// qu’ils deviennent
		// positifs
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				list.set(i, -1 * (list.get(i)));
			}
			System.out.println("Voici la nouvelle liste :" + list);
		}
	}

}
