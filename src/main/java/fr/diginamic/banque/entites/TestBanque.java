package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte1 = new Compte(45, 1500.0);
		Compte compte2 = new Compte(45, 1500.0);
		Compte compte3 = compte2;

		boolean result = compte1.equals(compte2);
		System.out.println(result);
		boolean result1 = compte2.equals(compte3);
		System.out.println(result1);

	}

}
