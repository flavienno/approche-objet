package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation[] operations = new Operation[4];
		operations[0] = new Debit("12/11/2019",230);
		operations[1] = new Debit("13/11/2019",220);
		operations[2] = new Credit("14/11/2019",210);
		operations[3] = new Credit("15/11/2019",200);
		
		double soldeGlobal=0;
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i].afficherType()+" "+operations[i].getMontantOpe()+" "+operations[i].getDateOpe());
			
			if (operations[i].afficherType().equals("Crédit")) {
				soldeGlobal+=operations[i].getMontantOpe();
			} else {
				soldeGlobal-=operations[i].getMontantOpe();
			}
			
		}
		System.out.println("Solde global="+soldeGlobal );
	}

}
