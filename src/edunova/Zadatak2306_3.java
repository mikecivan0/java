package edunova;

public class Zadatak2306_3 {
	// kreirati metodu razlika tipa int koja
	// prima dva parametra tipa String
	// Metoda vraæa razliku prvog i drugog primljenog broja

	private static int razlika(String a, String b) {
		int rezultat = Integer.parseInt(a) - Integer.parseInt(b);
		return rezultat;
	}

	public static void main(String[] args) {
		System.out.println(razlika("5", "3"));
	}
}
