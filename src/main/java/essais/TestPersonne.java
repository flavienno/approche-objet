package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		//Personne a= new Personne("naudin","flavien");
		
		//Personne b= new Personne("queyrel","audrey");
	
		Personne c= new Personne("naudin","flavien","125 rue du moulin de semalen");
		
		//Personne d= new Personne("queyrel","audrey","3 rue de la croix du capitaine");
		
		//a.affichePrenomEnMinusculeEtNomEnMajuscule();
		//System.out.println(a.retourneNom());
		//System.out.println(a.retournePrenom());
		
		//utiliser la méthode qui permet de modifier l’adresse pour valoriser l’adresse
		c.modifierAdresse("rue de la paix");
	
	}

	
	
}
