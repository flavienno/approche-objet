package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	int nbJourTravaille;
	int remunerationJournaliere;
	int salaire;

	/**
	 * @param nom
	 * @param prenom
	 * @param nbJourTravaille
	 * @param remunerationJournaliere
	 */
	public Pigiste(String nom, String prenom, int nbJourTravaille, int remunerationJournaliere) {
		super(nom, prenom);
		this.nbJourTravaille = nbJourTravaille;
		this.remunerationJournaliere = remunerationJournaliere;
	}

	@Override
	public int getsalaire() {
		int salaire = nbJourTravaille * remunerationJournaliere;
		return salaire;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nombre de jour travaillé = " + nbJourTravaille + ", remunération journaliere = "
				+ remunerationJournaliere;
	}

	@Override
	public String afficherDonnees() {
		return nom + " " + prenom + " " + salaire + " Pigiste";
	}

}
