package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private float tauxDeRemuneration;


	
	public CompteTaux(int numeroDeCompte, double soldeDuCompte, float tauxDeRemuneration) {
		super(numeroDeCompte, soldeDuCompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
	}



	public String toString(){
		super.toString();
		String infosClasseMere=super.toString();
		return infosClasseMere+"  "+getTauxDeRemuneration() ;
		
	}



	public float getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}



	public void setTauxDeRemuneration(float tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}
}


