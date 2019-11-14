package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpe, int montantOpe) {
		super(dateOpe, montantOpe);
		// TODO Auto-generated constructor stub
	}
	public String afficherType(){
		return "Débit";
	}
}
