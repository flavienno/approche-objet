
public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] ObjetGeometrique = new ObjetGeometrique[2];
		ObjetGeometrique[0]= new Cercle(25);
		ObjetGeometrique[1]= new Rectangle(2,4);
		
		for (int i = 0; i < ObjetGeometrique.length; i++) {
			System.out.println(ObjetGeometrique[i]);
		}

	}

} 
