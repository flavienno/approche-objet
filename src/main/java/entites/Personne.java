package entites;

public class Personne {
	String nom;
	String prenom;
	String adresse_postale;
	
	public Personne(String nom,String prenom){
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public Personne(String nom,String prenom,String adresse_postale){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse_postale=adresse_postale;
	}
}
