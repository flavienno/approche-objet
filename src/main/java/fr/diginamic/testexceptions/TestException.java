package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {

		try {
			System.out.println(Operation.diviser(4, 0));

		} catch (DivException e) {

			System.out.println(e.getMessage());

		}
		try {
			System.out.println(Operation.diviser(4, 5));

		} catch (DivException e) {

			System.out.println(e.getMessage());

		}
	}
}
