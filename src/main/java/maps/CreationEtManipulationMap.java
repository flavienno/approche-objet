package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while (keysIte.hasNext()) {
		Integer iterator = keysIte.next();
		System.out.println(iterator);
		
		//Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
			// 1 ere méthode		
		
//		Set<Integer> keyset = mapVilles.keySet();
//		for (Integer key: keyset){
//			System.out.println("Clé"+ key);
//			System.out.println("Valeur :"+ mapVilles.get(key));
		}
		
		// 2 eme  méthode
		Iterator<Integer> keySet = mapVilles.keySet().iterator();
		while (keySet.hasNext()) {
		Integer key = keySet.next();
		System.out.println("Clé :"+ key);
		System.out.println("Valeur :"+ mapVilles.get(key));
		
		}
		//Afficher la taille de la map
		System.out.println("Voici la taille de la map :"+ mapVilles.size());

	}

}
