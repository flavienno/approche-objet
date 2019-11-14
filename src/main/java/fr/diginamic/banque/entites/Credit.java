package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOpe, int montantOpe) {
		super(dateOpe, montantOpe);
		// TODO Auto-generated constructor stub
	}
	public String afficherType(){
		return"Crédit";
	}
}
