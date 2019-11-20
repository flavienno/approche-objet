package fr.diginamic.testexceptions;

public class TestRuntimeException {

	public static void main(String[] args) {
		try {
			System.out.println(Operation.diviserRuntime(5, 0));

		} catch (DivRunException ee) {

			System.out.println(ee.getMessage());

		}

		System.out.println(Operation.diviserRuntime(5, 2));

	}

}
