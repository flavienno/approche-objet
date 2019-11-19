package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	int montantSalairemensuel;

	/**
	 * @param nom
	 * @param prenom
	 * @param montantSalairemensuel
	 */
	public Salarie(String nom, String prenom, int montantSalairemensuel) {
		super(nom, prenom);
		this.montantSalairemensuel = montantSalairemensuel;
	}

	@Override
	public int getsalaire() {
		return montantSalairemensuel;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Montant du salaire mensuel = " + montantSalairemensuel;
	}

	@Override
	public String afficherDonnees() {
		return nom + " " + prenom + " " + montantSalairemensuel + " Salarié";
	}
}
