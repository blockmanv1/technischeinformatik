/**
 * PP Arbeitsbaltt 2

 * Aufgabe: 2
 */
package versuch2;

import java.io.*;
public class Caesarchiffre {

	public static void main(String[] args) throws IOException {
int n;
StringBuffer zeichentxt, speichertxt;		// Variabeln und StringBuffer deklarieren 
char crypt;

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

do { 	// Do...While Schleife 
	System.out.println("Bitte Schluessel zwischen 1 und 25 eingeben: ");	
n = Integer.parseInt(in.readLine());		// Integer Ganzzahl zwischen 1 und 25 einlesen

} while(n < 1 || n > 25);	// Solange wiederhole bis die eingegebene Zahl zwischen 1 und 25 liegt
	
System.out.println("Bitte zu verschluesselnde oder entschluesselnde Zeichenkette eingeben: ");
	zeichentxt = new StringBuffer(in.readLine());    	// StringBuffer einlesen
	
	System.out.println("Zeichenkette verschluesseln oder entschluesseln ? v/e");
	crypt = in.readLine().charAt(0);		// Char einlesenen  -- v = verschlüsseln / e = entschlüsseln
	
	if(crypt == 'v') {					// verschlüsseln
		speichertxt = verschluesseln(zeichentxt, n);		// Methode aufrufen und in einem neuen StringBuffer speichern 
	}
	else {								// entschlüsseln
		speichertxt = entschluesseln(zeichentxt, n);		// Methode aufrufen und in einem neuen StringBuffer speichern
		
	}

	System.out.println(speichertxt.toString());  	// Gibt die verschlüsselte oder entschlüsselte zeichenkette aus

	}

public static StringBuffer verschluesseln(StringBuffer zeichenkette, int schluessel) {		// Methode zum verschlüsseln nach der Cäsarchiffre
	for(int i=0; i < zeichenkette.length();i++){	// Schleife geht im StringBuffer jede Stelle einzeln durch  
		
		if(zeichenkette.charAt(i) >= 65 && zeichenkette.charAt(i) <= 90) {				// Erst Große Buchstaben umwandeln
				zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i)+schluessel));   // An jeder Stelle im StringBuffer zum Integer Wert des Chars den Schlüssel addieren 
				
				if(zeichenkette.charAt(i) > 90)											// Falls der entsprechende Char Wert größer als 'Z' ist 
					zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i) - 26));		// Länge des Alphabetes abziehen
		}
		
		else if(zeichenkette.charAt(i) >= 97 && zeichenkette.charAt(i) <= 122){			// Abfrage für kleine Buchstaben 
			zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i)+schluessel));		// Ab hier selbe vorgehensweise wie bei den Großbuchstaben 
				
			if(zeichenkette.charAt(i) > 122)
				zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i) - 26));
				}
	}
	return zeichenkette;	// Rückgabewert der Methode 
}

public static StringBuffer entschluesseln(StringBuffer zeichenkette, int schluessel) {		// Methode zum entschlüsseln nach der Cäsarchiffre
	for(int i=0; i < zeichenkette.length();i++){							
																						// Das selbe System wie bei der Methode zum verschlüsseln, mit umgekehrten Werten
		if(zeichenkette.charAt(i) >= 65 && zeichenkette.charAt(i) <= 90) {				// Subtrahieren des Schluessels und addieren von 26 falls der entsprechende Char Wert
			zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i) - schluessel));	    // kleiner als 'a' ist  	
		
				if(zeichenkette.charAt(i) < 65)
					zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i) + 26));		
		}
		
		else if(zeichenkette.charAt(i) >= 97 && zeichenkette.charAt(i) <= 122){
			zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i) - schluessel));
				
			if(zeichenkette.charAt(i) < 97)
				zeichenkette.setCharAt(i, (char)(zeichenkette.charAt(i) + 26));
				}
	}
	return zeichenkette;
}
	
} 	// Ende der Klasse
