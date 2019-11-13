package essais;

import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne a= new Personne();
		a.nom="naudin";
		a.prenom="flavien";
		a.adresse_postale="rue_du_moulin_de_semalen";
		
		Personne b= new Personne();
		b.nom="queyrel";
		b.prenom="audrey";
		b.adresse_postale="aussi_rue_du_moulin_de_semalen";
	}

}
