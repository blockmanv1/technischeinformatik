package versuch3;
/**
 * PP Arbeitsbaltt 3

 * Aufgabe: 5
 */

import java.io.*;
public class MethodeSuche {

	public static void main(String[] args) throws IOException {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int woerteranzahl;
String gesuchteswort;


do{
	System.out.print("Anzahl der Wörter eingeben: ");
woerteranzahl = Integer.parseInt(in.readLine());
} while(woerteranzahl < 6);

String woerter[] = new String [woerteranzahl];			// String Array anlegen

for(int i = 0; i < woerteranzahl; i++){
System.out.printf("Bitte das %d.Wort eingeben: ",i+1);	
woerter[i] = in.readLine();				// Zuweisung zu den eizelnen String Variabeln
}
do {
System.out.println("Nach welchem Wort soll gesucht werden? ");
gesuchteswort = in.readLine(); 

if(suche(woerter,gesuchteswort) > 0){	// Methode aufrufen mit 2 Parametern und ueberpruefen ob Rueckgabewert groesser 0 
	System.out.printf("Das Wort \"%s\" wurde an der Position %d gefunden.%n %n",gesuchteswort,suche(woerter,gesuchteswort));	 
}else {
	System.out.printf("Das Wort \"%s\" wurde nicht gefunden.%n %n",gesuchteswort);	// Falls Rueckgabewert kleiner 1 
}

System.out.println("Soll eine neue Suche gestartet werden? y/n");
} while(in.readLine().charAt(0) == 'y' );

	}
	
	public static int suche(String[] woerter, String gesuchteswort) {		// Methode mit einem erwarteten Array String und einem String
		int position = 0;
		boolean gefunden = false;
		for(int i = 0; i < woerter.length; i++) {
			if(woerter[i].equals(gesuchteswort)) {
				position = i +1;						// +1 da von 1 anstatt 0 hochgezaehlt werden soll 
				gefunden = true;
				break;
			} else
				gefunden = false;
		}
		if(gefunden == false)
position = -1;										   // -1 == nicht gefunden
		return position;
	}
	

}
