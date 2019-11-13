/**
 * 
 */
package entites;

/**
 * @author flavien
 *
 */
public class AdressePostale {
	int numero_de_rue;
	String libelle_de_la_rue;
	int code_postal;
	String ville;
	
	public AdressePostale (int numero_de_rue,String libelle_de_la_rue,int code_postal,String ville) {
		this.numero_de_rue=numero_de_rue;
		this.libelle_de_la_rue=libelle_de_la_rue;
		this.code_postal=code_postal;
		this.ville=ville;
	}
}
