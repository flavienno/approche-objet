package fr.diginamic.banque.entites;

public class Compte {
	private int numeroDeCompte;
	private double soldeDuCompte;
	
	
	public Compte(int numeroDeCompte,double soldeDuCompte) {
		
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDuCompte= soldeDuCompte;
	}
	
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}
	public void setNumeroDeCompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSoldeDuCompte() {
		return soldeDuCompte;
	}
	public void setSoldeDuCompte(double soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}

	
}
