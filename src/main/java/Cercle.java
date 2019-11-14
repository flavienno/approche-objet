
public class Cercle implements ObjetGeometrique {
	
	public double rayon;
	
	@Override
	public double perimetre() {
		double perim=2*rayon*3.14159;
		return perim;
	}

	@Override
	public double surface() {
		double surf= rayon*rayon*3.14159;
		return surf;
	}
	
	
	
	public Cercle(double rayon) {
		
		this.rayon = rayon;
	}

	public String toString(){
		String str= "Le périmetre du cercle est égal à "+String.valueOf(perimetre())+"  et sa surface est égale à "+String.valueOf(surface());
		return str;
		
	}
	
}
