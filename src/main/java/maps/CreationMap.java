package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		// Créez une map nommée mapSalaires et qui permet de stocker les informations
		//de salaire (valeur) en fonction du prénom de la personne (clé).
		
		Map<String, Integer> mapSalaires = new HashMap<>();
	
		mapSalaires.put("Paul",1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
		//Une fois la map créée, affichez sa taille
		System.out.println("La taille de cette map est : "+mapSalaires.size());
		
	}

}
