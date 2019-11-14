package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte c = new Compte(235, 1500.0);
		c.setSoldeDuCompte(2500.0);
		System.out.println(c.getNumeroDeCompte()+"  "+c.getSoldeDuCompte());
	}

}
