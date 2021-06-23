package edunova;

public class Zadatak2306_5 {
	// metoda prima broj i vraæa true ili false ako je broj prim ili nije

	private static boolean primBroj(int broj) {

		for (int i = 2; i < broj; i++) {

			if (broj % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		System.out.println(primBroj(5));
	}
}
