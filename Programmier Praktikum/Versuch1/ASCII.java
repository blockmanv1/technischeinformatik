package versuch1;
/*

Aufgabe: 3
*/

import java.io.*;

public class ASCII {
	public static void main(String[] args) throws IOException {
		
	char c = 'Z';       // speichert den Buchstaben Z in einer Char Variablen
	c += 2;				// addiert zwei zum Char Wert c
	
	if(c>'Z') {			// Überprüft mit einer If Abfrage ob der Wert c größer als der Wert Z(90) ist
		c -= 26;		// Wenn c > 90(Z), dann subtrahiere 26 von c. (26 Alphabet Länge)
	}
System.out.println(c);  // Ausgabe von c in der Konsole
	}

}
