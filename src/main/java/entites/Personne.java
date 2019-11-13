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
	//Dans la classe Personne, ajoutez une méthode qui permet d’afficher le nom et le
	//prénom avec le nom de famille en majuscules. 
	public void affichePrenomEnMinusculeEtNomEnMajuscule(){
		System.out.println(this.nom.toUpperCase() );
		System.out.println(prenom);
	}
	//Dans la classe Personne, ajoutez une méthode qui prend un argument en paramètre et
	//permet de modifier la variable d’instance nom de Personne
	public void modifierNom (String autreNom){
		this.nom=autreNom;
	}
	//Dans la classe Personne, ajoutez une méthode similaire pour modifier le prénom
	public void modifierPrenom (String autrePrenom){
		this.prenom=autrePrenom;
	}
	//Dans la classe Personne, ajoutez une méthode similaire pour modifier l’adresse
	public void modifierAdresse (String autreAdresse_postale){
		this.adresse_postale=autreAdresse_postale;
	}
	//Dans la classe Personne, ajoutez une méthode qui retourne le nom.
	public String retourneNom (){
		return nom;
	}
	//Dans la classe Personne, ajoutez une méthode qui retourne le prénom.
	public String retournePrenom (){
		return prenom;
	}
	//Dans la classe Personne, ajoutez une méthode qui retourne l’adresse.
	public String retourneAdresse (){
		return adresse_postale;
	}
}
