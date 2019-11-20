package fr.diginamic.testexceptions;

public class Operation {

	public static double diviser(double a, double b) throws DivException {
		if (b == 0) {
			throw new DivException("Division impossible ");
		}
		return a / b;
	}

	public static double diviserRuntime(double a, double b) {
		if (b == 0) {
			throw new DivRunException("IMPOSSIBLE VOYONS");
		}
		return a / b;
	}
}
