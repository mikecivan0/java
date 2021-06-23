package edunova;

import java.util.Arrays;

public class Zadatak2306_2 {
	// kreirajte metodu slucajniBrojevi tipa niz decimalnih brojeva (double)
	// koja vraæa 10 sluèajnih brojeva metodom new Random.nexFloat

	private static double[] slucajniBrojevi() {
		double[] niz = new double[10];
		for (int i = 0; i < 10; i++) {
			niz[i] = Math.random();
		}
		return niz;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(slucajniBrojevi()));
	}
}
