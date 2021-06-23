package edunova;

import javax.swing.JOptionPane;

public class slaganjeSendvica {

	public static void main(String[] args) {
		
		// u nizu 'peciva' su definirane vrijednosti kruh, kifla, somun i kajzerica 
		// u nizu 'namazi' su definirane vrijednosti margarin, mlije�ni namaz, majoneza, vrhnje i ketchup
		// u nizu 'mesniProizvodi' su definirane vrijednosti parizer, tirolka, pa�teta, �unka i kobasica
		// u nizu 'prilozi' su definirane vrijednosti krastavac, raj�ica, luk, paprika, salata i kupus
		// korisnik prvo definira maksimalni broj slojeva sendvi�a
		// korisnik zatim sla�e svoj sendvi� biraju�i kategorije proizvoda i same proizvode iz odabrane kategorije
		// korisnik prekida slaganje sendvi�a unosom vrijednosti 0, 
		// iako nije do�ao do maksimalnog broja slojeva koji je na po�etku definirao
		// sla�e se 'od dolje prema gore'
		
		String[] peciva = {"kruh", "kifla", "somun","kajzerica"};
		String[] namazi = {"margarin", "mlije�ni namaz", "majoneza","vrhnje", "ketchup"};
		String[] mesniProizvodi = {"parizer", "tirolka", "pa�teta","�unka", "kobasica"};
		String[] prilozi = {"krastavac", "raj�ica", "luk","paprika", "salata", "kupus"};
		int porukaOdabiraProizovda, odabraniProizvod, brojOdabranihSlojeva=0, maxBrojSlojeva;
		String listaProizvoda, slozeniSendvic;
		
		JOptionPane.showInternalMessageDialog(null, "Pozdrav!\n"
				+ "Ja sam tvoj asistent za sendvi�e.\n"
				+ "Za po�etak slaganja sendvi�a klikni 'OK'");
		
		for(;;) {
			
			maxBrojSlojeva = Integer.parseInt(
					JOptionPane.showInputDialog("Koji je najve�i broj slojeva koji planira� za svoj idu�i sendvi�?")
					);
			
			if(maxBrojSlojeva>0) {
				break;
			}
			
			JOptionPane.showInternalMessageDialog(null, "Sendvi� mora imati vi�e od 0 slojeva");
		}
		
		
		String[] sendvic = new String[maxBrojSlojeva];
		
		JOptionPane.showInternalMessageDialog(null, "Super!\n"
				+ "To bi bio i moj izbor.\n"
				+ "Idemo sada izabrati �to �e sve biti u tvom sendvi�u!\n"
				+ "Sendvi� sla�emo 'od dolje prema gore'\n"
				+ "Slaganje sendvi�a mo�e� prekinuti sa 0\n"
				+ "Sa �ime �eli� po�eti?\n"
				+ "Za izbor sastojaka klikni 'OK'");
		
		
		petljaIzbora:
		for(int i=0;i<maxBrojSlojeva;i++) {
			
			for(;;) {
				porukaOdabiraProizovda = Integer.parseInt(JOptionPane.showInputDialog(
						"Izaberi kategoriju proizvoda za ovaj sloj sendvi�a\n\n"
						+ "1 Pecivo\n"
						+ "2 Namazi\n"
						+ "3 Mesni proizvodi\n"
						+ "4 Prilozi\n"
						+ "0 Prekid"));
				
				if(porukaOdabiraProizovda>=0 && porukaOdabiraProizovda<5) {
					break;
				}
				
				JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponu�enih vrijednosti");
			}

			if(porukaOdabiraProizovda==0) {
				
				break petljaIzbora;
				
			}else if(porukaOdabiraProizovda==1) {	
				
				listaProizvoda = "Koje pecivo �eli�?\n\n";
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
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponu�enih vrijednosti");					
				}				
					
			}else if(porukaOdabiraProizovda==2) {	
				
				listaProizvoda = "Koji namaz �eli�?\n\n";
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
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponu�enih vrijednosti");					
				}				
					
			}else if(porukaOdabiraProizovda==3) {
				
				listaProizvoda = "Koji mesni proizvod �eli�?\n\n";
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
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponu�enih vrijednosti");					
				}				
					
			}else if(porukaOdabiraProizovda==4) {	
				
				listaProizvoda = "Koji prilog �eli�?\n\n";
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
						
					JOptionPane.showInternalMessageDialog(null, "Molim unesi neku od ponu�enih vrijednosti");					
				}				
					
			}
			
			if(i<maxBrojSlojeva-1) {
				JOptionPane.showInternalMessageDialog(null, "Super!\n\n"
								+ (i+1) + ". sloj od mogu�ih " + maxBrojSlojeva + " je odabran.\n"
								+ "Idemo dalje!\n"
								+ "Za nastavak klikni 'OK'");
			}
			
			
		}
		
		slozeniSendvic = "Nema sendvi�a. Nisi odabrao niti jedan sastojak.";
		
		for(int i=0;i<sendvic.length;i++) {
			if(sendvic[i]!=null) {
				brojOdabranihSlojeva++;
				slozeniSendvic = "Tvoj sendvi� je gotov i izgleda ovako:\n";				
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
