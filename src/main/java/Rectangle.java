
public class Rectangle implements ObjetGeometrique {
	public double longueur;
	public double largeur;
	@Override
	public double perimetre() {
		double per = (longueur+largeur)*2;
		return per;
	}

	@Override
	public double surface() {
		double surfa = longueur*largeur;
		return surfa;
	}
	
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public String toString(){
		String stri= "Le périmetre du rectangle est égal à "+String.valueOf(perimetre())+"  et sa surface est égale à "+String.valueOf(surface());
		return stri;
		
	}
}
