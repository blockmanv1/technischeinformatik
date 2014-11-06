/**

Aufgabe:2.2 Zusatz
 */
package versuch2;

import java.io.*;
public class MethodenAufrufZusatz {

	public static void main(String[] args)throws IOException {
int n;
byte pos;		// Variabeln deklarieren
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Ganzzahl eingeben: ");
n = Integer.parseInt(in.readLine());		// Integer Wert aus der Konsole auslesen
System.out.println("Position eingeben: ");
pos = Byte.parseByte(in.readLine());		// Byte Wert aus der Konsole auslesen

System.out.printf("An der %d. Stelle des Integer Werts steht das Bit: %d",pos +1,bytepos(n, pos));  
// Printf für übersichtlichere Darstellung der Variabeln
	}

	public static int bytepos(int zahl, byte position) {		// Neue Integer Methode
	int bytepos;
	bytepos = (int) (zahl >> position)%2;						// Rechtsshift mit Modulo 2 und Zuweisung zu bytepos
		return bytepos;											// Gibt die variabel aus Methode zurück
	}
	
}
