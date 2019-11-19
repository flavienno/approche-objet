package essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie = new Salarie("toto", "flavien", 3000);
		Pigiste pigiste = new Pigiste("titi", "audrey", 4, 50);
		System.out
				.println("Voici le détail du salarié : " + salarie + " et voici son salaire :" + salarie.getsalaire());
		System.out
				.println("Voici le détail du pigiste : " + pigiste + " et voici son salaire :" + pigiste.getsalaire());
		System.out.println(salarie.afficherDonnees());
		System.out.println(pigiste.afficherDonnees());
	}

}
