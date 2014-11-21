package versuch3;
/**
 * PP Arbeitsbaltt 3

 * Aufgabe: 4
 */

import java.io.*;
public class BinäreSuche {

	public static void main(String[] args) throws IOException {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int woerteranzahl;
String gesuchteswort;
boolean gefunden = false;

do{
	System.out.print("Anzahl der Wörter eingeben: ");
woerteranzahl = Integer.parseInt(in.readLine());
} while(woerteranzahl < 6);

String woerter[] = new String [woerteranzahl]; 	// neuen String Array mit der Länge der Woerterzahl

for(int i = 0; i < woerteranzahl; i++){					// Schleife zum einlesen der verschiedenen Array Zuweisungen
System.out.printf("Bitte das %d.Wort eingeben: ",i+1);	
woerter[i] = in.readLine();
}
do {
System.out.println("Nach welchem Wort soll gesucht werden? ");
gesuchteswort = in.readLine(); 
for(int i = 0; i < woerteranzahl; i++) {					// Jeden Array Index aufrufen und vergleichen
	if(woerter[i].equals(gesuchteswort)) {					// Bei Arrays ueberpruefung mit der .equals() Methode 
		System.out.printf("Das Wort \"%s\" wurde an der Position %d gefunden.%n %n",gesuchteswort,i+1);
		gefunden = true;
		break;
	} else				
		gefunden = false;
}
if(gefunden == false)	
System.out.printf("Das Wort \"%s\" wurde nicht gefunden.%n %n",gesuchteswort);

System.out.println("Soll eine neue Suche gestartet werden? y/n");
} while(in.readLine().charAt(0) == 'y' );	// wiederholen, falls der Char 'y' einglesen wird 

	}

}
