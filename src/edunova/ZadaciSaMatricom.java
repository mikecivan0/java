package edunova;

public class ZadaciSaMatricom {

	public static void main(String[] args) {

		// Program ispisuje matricu a x b
		
		int a = 9, b = 9;
		
		// zadatak 1
		// tako da je svaki element matrice broj 0
		
		System.out.println("Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n");
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		System.out.println();

		
		
		// ispis tako da su elementi matrice 0
		// osim onih koji dijagonalno idu
		// od gornjeg lijevog kuta prema dolje desno
		// a èija je vrijednost 1
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji dijagonalno idu \n"
				+ "od gornjeg lijevog kuta prema dolje desno\n"
				+ "a èija je vrijednost 1\n"
			);
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				
				if (i == j) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// zadatak 2
		// ispis tako da su elementi matrice 0
		// osim onih koji dijagonalno idu
		// od gornjeg desnog lijevog kuta prema donjem lijevom kutu
		// a èija je vrijednost 1
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji dijagonalno idu \n"
				+ "od donjeg gornjeg desnog kuta prema donjem lijevom kutu\n"	
				+ "a èija je vrijednost 1\n"
			);
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				
				if (i + (j-1) == b) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// zadatak 3
		// ispis tako da su elementi matrice 0
		// osim onih koji su u odreðenom redu
		// a èija je vrijednost 1
		
		int brojReda3 = 1; //za ispis u drugom redu staviti 2, za treæi red 3... do max 9
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji su u " + brojReda3 + ". redu\n"
				+ "a èija je vrijednost 1\n"
			);		
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				
				if (i == a - (a-brojReda3)) { 
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
				
			}
			System.out.println();
		}
		System.out.println();
		
		

		// zadatak 4
		// ispis tako da su elementi matrice 0
		// osim onih koji su u odreðenom stupcu
		// a èija je vrijednost 1
		
		int brojStupca4 = 1; //za ispis u drugom stupcu staviti 2, za treæi stupac 3... do max 9
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji su u " + brojStupca4 + ". stupcu"
				+ "a èija je vrijednost 1\n"
			);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {

				if (j == b - (b-brojStupca4)) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// zadatak 5
		// ispis tako da su elementi matrice 0
		// osim onih koji dijgonalno idu od gornjeg desnog kuta
		//prema donjem lijevom kutu a èija je vrijednosti 1,
		// sa time da je cijela dijagonala
		//pomjerena za odreðeni broj mjesta ulijevo
		
		int offsetUlijevo5 = 1; // što je veæi broj to je veæi offset...
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji idu u dijegonalu od gornjeg desnog kuta\n"
				+ "prema donjem lijevom kutu a èija je vrijednosti 1,\n"
				+ "sa time da je cijela dijagonala\n"
				+ "pomjerena za " + offsetUlijevo5 + " mjesto/a ulijevo\n"
			);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {

				if (j == b - i - (offsetUlijevo5-1)) { 
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// zadatak 6
		// ispis tako da su elementi matrice 0
		// osim onih koji dijgonalno idu od gornjeg desnog kuta
		//prema donjem lijevom kutu a èija je vrijednosti 1,
		// sa time da je cijela dijagonala
		//pomjerena za odreðeni broj mjesto udesno
		
		int offsetUdesno6 = 1; // što je veæi broj to je veæi offset...
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji idu u dijegonalu od gornjeg desnog kuta\n"
				+ "prema donjem lijevom kutu a èija je vrijednosti 1,\n"
				+ "sa time da je cijela dijagonala\n"
				+ "pomjerena za " + offsetUdesno6 + " mjesto/a udesno\n"
			);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {

				if (j == b - (i-(offsetUdesno6+1))) { 
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// zadatak 7
		// ispis tako da su elementi matrice 0
		// osim onih u zadnjem redu a èija je vrijednosti 1
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji su u zadnjem redu a èija je vrijednosti 1\n"
			);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {

				if (i == b) { 
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}		
		System.out.println();
		
		
		
		// zadatak 8
		// ispis tako da su elementi matrice 0
		// osim onih u zadnjem stupcu a èija je vrijednosti 1
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji su u zadnjem stupcu a èija je vrijednosti 1\n"
			);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {

				if (j == b) { 
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}	
		System.out.println();
		
		
		// zadatak 9
		// ispis tako da su elementi matrice 0
		// osim onih okviru matrice a koji su vrijednosti 1
		
		System.out.println(
				"Ispod je matrica 9x9 sa svim elementima vrijednosti 0\n" 
				+ "osim onih koji su u okviru matrice a èija je vrijednost 1\n"
			);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {

				if (j == b || i == b || j == b-(b-1) || i == b-(b-1)) { 
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}	
		System.out.println();
		
		

		// zadatak 10
		// ispis tako da su elementi matrice 0
		// osim onih koji èine križ u sredini matrice
		// a èija je vrijednost 1
		
		int srednjiStupac10 = a-(a/2);
		int srednjiRed10 = b-(b/2);
		
		System.out.println(
				"Ispod je matrica 9x9 sa križem u sredini\n" 
				+ "osim onih koji èine križ u sredini matrice\n"
				+ "a èija je vrijednost 1\n"
			);

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {

				if (j == srednjiStupac10|| i == srednjiRed10) { 
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}

			}
			System.out.println();
		}	
		System.out.println();
		
		
		// zadatak 11
		// ispis zvijezde u sredini matrice
		// elemnti matrice koji ne èine zvijezdu 
		// imaju vrijednost 0
		
		int srednjiStupac11 = a-(a/2);
		int srednjiRed11 = b-(b/2);
		
		System.out.println(
				"Ispod je matrica 9x9 sa zvijezdom u sredini\n"
			);
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (j == srednjiStupac11) { 
					System.out.print("| ");
				} else if(i == srednjiRed11){
					System.out.print("- ");
				} else if(i == j){
					System.out.print("\\ ");
				}else if(i + (j-1) == b) {
					System.out.print("/ ");
				}else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}	
		System.out.println();
		
		
		
		// zadatak 12
		// ispis vrijednosti 1 i 0 naizmjence u matrici
				
		System.out.println(
				"Ispod je matrica 9x9\n"
				+ "sa naizmjence ispisanim jedinicama i nulama\n"
			);
			
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if((i+j)%2==0) {
					System.out.print(1 + " ");
				}else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}	
		System.out.println();		
		
		
		// zadatak 12
		// ispis matrice sa kariranim uzorkom
						
		System.out.println(
				"Ispod je matrica 9x9\n"
				+ "sa kariranim uzorkom\n"
			);
				
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if(i%2!=0 || (i%2==0 && j%2!=0)) {
					System.out.print(1 + " ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		System.out.println();
		

	}

}
