package edunova;

public class K05_Operatori {

	public static void main(String[] args) {

		int a = 5, b = 7;
		
		int r = a / b;
		
		System.out.println(r);
		//output 0 
		//rezultat se skraæuje za decimalna mjesta jer je 
		//deklariran kako int
		
		float fr1 = a / b;
		
		System.out.println(fr1);
		//output je 0.0 jer se prvo izvodi operacija sa 
		//desne strane znaka = a tek nakon toga se
		//rezultat dodjeljuje varijabli
		
		float fr2 = (float) a / b; // sa (float) se radi cast
		
		System.out.println(fr2);
		//output 0.71428573 zbog gore napravljenog cast-a
		
		int t = 9 % 2;
		
		System.out.println(t);
		//output je 1 jer je to ostatak cjelobrojnog dijeljenja
	}

}
