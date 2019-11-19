package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int numeroEtg;

	/**
	 * @param superficie
	 * @param numeroEtg
	 */
	public Piece(double superficie, int numeroEtg) {
		super();
		this.superficie = superficie;
		this.numeroEtg = numeroEtg;
	}

	/** TYPE_CHAMBRE : String*/
	public static final String TYPE_CHAMBRE = "Chambre";

	/** TYPE_SALON : String*/
	public static final String TYPE_SALON = "Salon";
	
	/** TYPE_CUISINE : String*/
	public static final String TYPE_CUISINE = "Cuisine";
	
	/** TYPE_CUISINE : String*/
	public static final String TYPE_WC = "WC";
	
	/** TYPE_CUISINE : String*/
	public static final String TYPE_SDB = "Salle de bain";
	
	/** Retourne le type de la pièce
	 * @return String
	 */
	public abstract String getType();
	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie
	 *            the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the numeroEtg
	 */
	public int getNumeroEtg() {
		return numeroEtg;
	}

	/**
	 * @param numeroEtg
	 *            the numeroEtg to set
	 */
	public void setNumeroEtg(int numeroEtg) {
		this.numeroEtg = numeroEtg;
	}

}
