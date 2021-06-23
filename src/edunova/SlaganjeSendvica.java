package edunova;

import javax.swing.JOptionPane;

public class SlaganjeSendvica {

	public static void main(String[] args) {
		
		// u nizu 'peciva' su definirane vrijednosti kruh, kifla, somun i kajzerica 
		// u nizu 'namazi' su definirane vrijednosti margarin, mliječni namaz, majoneza, vrhnje i ketchup
		// u nizu 'mesniProizvodi' su definirane vrijednosti parizer, tirolka, pašteta, šunka i kobasica
		// u nizu 'prilozi' su definirane vrijednosti krastavac, rajčica, luk, paprika, salata i kupus
		// korisnik prvo definira maksimalni broj slojeva sendviča
		// korisnik zatim slaže svoj sendvič birajući kategorije proizvoda i same proizvode iz odabrane kategorije
		// korisnik prekida slaganje sendviča unosom vrijednosti 0, 
		// iako nije došao do maksimalnog broja slojeva koji je na početku definirao
		// slaže se 'od dolje prema gore'
		
		String[] peciva = {"kruh", "kifla", "somun","kajzerica"};
		String[] namazi = {"margarin", "mliječni namaz", "majoneza","vrhnje", "ketchup"};
		String[] mesniProizvodi = {"parizer", "tirolka", "pašteta","šunka", "kobasica"};
		String[] prilozi = {"krastavac", "rajčica", "luk","paprika", "salata", "kupus"};
		int porukaOdabiraProizovda, odabraniProizvod, brojOdabranihSlojeva=0, maxBrojSlojeva;
		String listaProizvoda, slozeniSendvic;
		
		JOptionPane.showInternalMessageDialog(null, "Pozdrav!\n"
				+ "Ja sam tvoj asistent za sendviče.\n"
				+ "Za početak slaganja sendviča klikni 'OK'");
		
		for(;;) {
			
			maxBrojSlojeva = Integer.parseInt(
					JOptionPane.showInputDialog("Koji je najveći broj slojeva koji planiraš za svoj idući sendvič?")
					);
			
			if(maxBrojSlojeva>0) {
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Sendvič mora imati više od 0 slojeva");
		}
		
		
		String[] sendvic = new String[maxBrojSlojeva];
		
		JOptionPane.showInternalMessageDialog(null, "Super!\n"
				+ "To bi bio i moj izbor.\n"
				+ "Idemo sada izabrati što će sve biti u tvom sendviču!\n"
				+ "Sendvič slažemo 'od dolje prema gore'\n"
				+ "Slaganje sendviča možeš prekinuti sa 0\n"
				+ "Sa čime želiš početi?\n"
				+ "Za izbor sastojaka klikni 'OK'");
		
		
		petljaIzbora:
		for(int i=0;i<maxBrojSlojeva;i++) {
			
			for(;;) {
				porukaOdabiraProizovda = Integer.parseInt(JOptionPane.showInputDialog(
						"Izaberi kategoriju proizvoda za ovaj sloj sendviča\n\n"
						+ "1 Pecivo\n"
						+ "2 Namazi\n"
						+ "3 Mesni proizvodi\n"
						+ "4 Prilozi\n"
						+ "0 Prekid"));
				
				if(porukaOdabiraProizovda>=0 && porukaOdabiraProizovda<5) {
					break;
				}
				
				JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponuđenih vrijednosti");
			}

			if(porukaOdabiraProizovda==0) {
				
				break petljaIzbora;
				
			}else if(porukaOdabiraProizovda==1) {	
				
				listaProizvoda = "Koje pecivo želiš?\n\n";
				for(int j=0;j<peciva.length;j++) {
					listaProizvoda += (j+1) + " " + peciva[j] + "\n";					
				}
				listaProizvoda += "0 Prekid";
					
				for(;;) {					
					odabraniProizvod = Integer.parseInt(
							JOptionPane.showInputDialog(listaProizvoda)
							);
						
					if(odabraniProizvod>=0 && odabraniProizvod<=peciva.length) {
						if(odabraniProizvod==0) {
							break petljaIzbora;
						}else {
							sendvic[i]=peciva[odabraniProizvod-1];
							break;
						}
						
					}
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponuđenih vrijednosti");					
				}				
					
			}else if(porukaOdabiraProizovda==2) {	
				
				listaProizvoda = "Koji namaz želiš?\n\n";
				for(int j=0;j<namazi.length;j++) {
					listaProizvoda += (j+1) + " " + namazi[j] + "\n";					
				}
				listaProizvoda += "0 Prekid";
					
				for(;;) {					
					odabraniProizvod = Integer.parseInt(
							JOptionPane.showInputDialog(listaProizvoda)
							);
						
					if(odabraniProizvod>=0 && odabraniProizvod<=namazi.length) {
						if(odabraniProizvod==0) {
							break petljaIzbora;
						}else {
							sendvic[i]=namazi[odabraniProizvod-1];
							break;
						}
					}
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponuđenih vrijednosti");					
				}				
					
			}else if(porukaOdabiraProizovda==3) {
				
				listaProizvoda = "Koji mesni proizvod želiš?\n\n";
				for(int j=0;j<mesniProizvodi.length;j++) {
					listaProizvoda += (j+1) + " " + mesniProizvodi[j] + "\n";					
				}
				listaProizvoda += "0 Prekid";
					
				for(;;) {					
					odabraniProizvod = Integer.parseInt(
							JOptionPane.showInputDialog(listaProizvoda)
							);
						
					if(odabraniProizvod>=0 && odabraniProizvod<=mesniProizvodi.length) {
						if(odabraniProizvod==0) {
							break petljaIzbora;
						}else {
							sendvic[i]=mesniProizvodi[odabraniProizvod-1];
							break;
						}
					}
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponuđenih vrijednosti");					
				}				
					
			}else if(porukaOdabiraProizovda==4) {	
				
				listaProizvoda = "Koji prilog želiš?\n\n";
				for(int j=0;j<prilozi.length;j++) {
					listaProizvoda += (j+1) + " " + prilozi[j] + "\n";					
				}
				listaProizvoda += "0 Prekid";
					
				for(;;) {					
					odabraniProizvod = Integer.parseInt(
							JOptionPane.showInputDialog(listaProizvoda)
							);
						
					if(odabraniProizvod>=0 && odabraniProizvod<=prilozi.length) {
						if(odabraniProizvod==0) {
							break petljaIzbora;
						}else {
							sendvic[i]=prilozi[odabraniProizvod-1];
							break;
						}
					}
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponuđenih vrijednosti");					
				}				
					
			}
			
			if(i<maxBrojSlojeva-1) {
				JOptionPane.showInternalMessageDialog(null, "Super!\n\n"
								+ (i+1) + ". sloj od mogućih " + maxBrojSlojeva + " je odabran.\n"
								+ "Idemo dalje!\n"
								+ "Za nastavak klikni 'OK'");
			}
			
			
		}
		
		slozeniSendvic = "Nema sendviča. Nisi odabrao niti jedan sastojak.";
		
		for(int i=0;i<sendvic.length;i++) {
			if(sendvic[i]!=null) {
				brojOdabranihSlojeva++;
				slozeniSendvic = "Tvoj sendvič je gotov i izgleda ovako:\n";				
			}
		}
		
		if(brojOdabranihSlojeva>0) {
			for(int i=sendvic.length-1;i>=0;i--) {
				if(sendvic[i]!=null) {
					slozeniSendvic += (i+1) + ". sloj: " + sendvic[i] + "\n";				
				}
			}		
		}
			
		JOptionPane.showInternalMessageDialog(null, slozeniSendvic);
		
	}
}
