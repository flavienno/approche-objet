package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte1 = new Compte(45, 1500.0);
		Compte compte2 = new Compte(45, 1500.0);
		
		System.out.println(compte1.equals(compte2));

	}

}
