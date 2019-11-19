package fr.diginamic.recensement;


public class Ville {

	/** codeRegion : code de la région */
	private String codeRegion;
	/** nomRegion : nom de la région */
	private String nomRegion;
	/** codeDepartement : code du département */
	private String codeDepartement;
	/** code INSEE de la ville */
	private String codeCommune;
	/** nom de la ville */
	private String nomCommune;
	/** population totale */
	private int populationTotale;

	/**
	 * Constructeur
	 * 
	 * @param codeRegion
	 *            code de la région
	 * @param nomRegion
	 *            nom de la région
	 * @param codeDepartement
	 *            code du département
	 * @param codeCommune
	 *            code INSEE de la ville
	 * @param nom
	 *            nom de la ville
	 * @param populationTotale
	 *            population totale
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}

	/**
	 * Getter
	 * 
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Setter
	 * 
	 * @param codeRegion
	 *            the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Setter
	 * 
	 * @param nomRegion
	 *            the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * Setter
	 * 
	 * @param codeDepartement
	 *            the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * Getter
	 * 
	 * @return the codeVille
	 */
	public String getCodeVille() {
		return codeCommune;
	}

	/**
	 * Setter
	 * 
	 * @param codeVille
	 *            the codeVille to set
	 */
	public void setCodeVille(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nomCommune;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the population
	 */
	public int getPopulation() {
		return populationTotale;
	}

	/**
	 * Setter
	 * 
	 * @param population
	 *            the population to set
	 */
	public void setPopulation(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ville  [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", populationTotale="
				+ populationTotale + "]";
	}
}
