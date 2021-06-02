package edunova;

import javax.swing.JOptionPane;

public class K03_Omotaci {
	public static void main(String[] args) {
		
		//parsiranje stringa u int
		int i = Integer.parseInt("89");
		
		System.out.println(i);
		
		//deklariranje varijable u koju se sprema on što korisnik unese
		//sve što korisnik unese dohvaæa se u String tipu
		String unioKorisnik = JOptionPane.showInputDialog("Broj");
		
		//na primitivnim tipovima se ne mogu primjenjivati pomoæne metode
		
		//parsiranje unešenoga stringa u int
		i= Integer.parseInt(unioKorisnik);
		
		//prikaz unešene vrijednosti uveæane za 10
		System.out.println(i+10); 
		
		//dodjeljivanje parsirane vrijednosti koju je korisnik unio
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite broj")
				);
		
		//prikaz minimalne i maksimalne vrijednosti za Integer tip
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		//parisranje stringa u boolean
		boolean aktivan = Boolean.parseBoolean("true");
		
		//parisranje stringa u byte
		byte brojDo127 = Byte.parseByte("25");
		
		//parisranje stringa u short
		short veciBroj = Short.parseShort("12");
		
		//parsiranje stringa u long
		//ne stavlja se L na kraj broja kada se parsira
		long velikiBroj = Long.parseLong("565465651654"); 
		
		//parisranje stringa u float
		//ne stavlja se f na kraj broja
		float decimalniManji = Float.parseFloat("3.14");
		
		//parisranje stringa u doduble
		double velikiDecimalni = Double.parseDouble("3.1215465");
		
	
		char znak = Character.forDigit(9, 12);
		
		System.out.println(znak);
		
		
	}
}
