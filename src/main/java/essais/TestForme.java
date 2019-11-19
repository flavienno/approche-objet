package essais;

import fr.diginamic.forme.Carre;
import fr.diginamic.forme.Cercle;
import fr.diginamic.forme.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(54,67);
		Cercle cercle = new Cercle(30);
		Carre carre = new Carre(24);
		AffichageForme aff = new AffichageForme();
		aff.afficher(rectangle);
		aff.afficher(cercle);
		aff.afficher(carre);
		
//		System.out.println("Le périmetre du rectangle est :"+calculerPerimetre(rectangle));
//		System.out.println("La surface du rectangle est :"+calculerSurface(rectangle));
//		System.out.println("Le périmetre du cercle est :"+calculerPerimetre(cercle));
//		System.out.println("La surface du cercle est :"+calculerSurface(cercle));
//		System.out.println("Le périmetre du carré est :"+calculerPerimetre(carre));
		

	}

}
