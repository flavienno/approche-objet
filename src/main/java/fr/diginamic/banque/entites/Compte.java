package fr.diginamic.banque.entites;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Compte {
	private int numeroDeCompte;
	private double soldeDuCompte;

	public Compte(int numeroDeCompte, double soldeDuCompte) {

		this.numeroDeCompte = numeroDeCompte;
		this.soldeDuCompte = soldeDuCompte;
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

	public String toString() {
		return "Numéro de compte : " + getNumeroDeCompte() + " Solde du compte : " + getSoldeDuCompte();

	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Compte)) {
			return false;
		}
		Compte other = (Compte) obj;
		return new EqualsBuilder().append(numeroDeCompte, other.getNumeroDeCompte()).isEquals();

	}
}
