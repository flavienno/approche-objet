package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte c = new Compte(235,1500.0);
		//c.setSoldeDuCompte(2500.0);
		//System.out.println(c.getNumeroDeCompte()+"  "+c.getSoldeDuCompte());
		//System.out.println(c);
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte(12,230.0);
		comptes[1] = new CompteTaux(13,230.0,1.5f);
		
		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}
	}

}
