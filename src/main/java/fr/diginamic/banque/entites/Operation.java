package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOpe;
	private int montantOpe;
	
	public Operation(String dateOpe, int montantOpe) {
		super();
		this.dateOpe = dateOpe;
		this.montantOpe = montantOpe;
	}

	public String getDateOpe() {
		return dateOpe;
	}

	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}

	public int getMontantOpe() {
		return montantOpe;
	}

	public void setMontantOpe(int montantOpe) {
		this.montantOpe = montantOpe;
	}
	public String toString(){
		return getMontantOpe()+"  "+  getDateOpe();
		
	}
	public abstract String afficherType();
}
