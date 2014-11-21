/**
 * PP Arbeitsbaltt 2

 * Aufgabe: 1
 */
package versuch2;

import java.io.*;
public class Portnummern {

	public static void main(String[] args) throws IOException {
int port;			// Variabeln deklarieren
char wiederholen;

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		

System.out.println("Bitte Port Nummer eingeben: ");
port = Integer.parseInt(in.readLine());				// Port einlesen

while(true) {		// Endlosschleife bis "break" Bedingung erfüllt ist
		
while(port < 0 || port > 65535) {			// Falls der Port ausserhalb des Wertebereichs liegt
	System.out.println("Der angegebene Port ist nicht bekannt, bitte neuen Port eingeben: ");
port = Integer.parseInt(in.readLine());		// Neuen Port einlesen
}

if (port >= 0 && 1023 >= port) {		// Falls der Port zu den well known Ports gehört 
	System.out.println("Der Port "+ port +" gehört zu den well-known Ports");	// Ausgabe des Ports und der Gruppen Beschreibung
	switch(port) {			// Falls ein Dienst der Portnummer zugeordnet werden kann, so wird der Dienst angegeben
	case 21:
		System.out.println("Dienst: FTP");
	break;
	case 23:
		System.out.println("Dienst: Telnet");
		break;
	case 25:
		System.out.println("Dienst: SMTP");
		break;
	case 80:
		System.out.println("Dienst: HTTP");
	break;
	case 143:
		System.out.println("Dienst: IMAP");
	break;
	default:				// Falls kein Dienst gefunden worden ist, wird "Sonstiger Dienst" ausgegeben
		System.out.println("Sonstiger Dienst");
	break;
	}	
}
else if (port >= 1024 && 49151 >= port) 	// Falls der Port zu den registerd Ports gehört
	System.out.println("Der Port "+ port +" gehört zu den registerd Ports");	
else if (port >= 49152 && 65535 >= port)	// Falls der Port zu den dynamic Ports gehört 
	System.out.println("Der Port "+ port +" gehört zu den dynamic Ports");

System.out.println("Neue Eingabe ? j/n: "); 
wiederholen = in.readLine().charAt(0);		// Einlesen von Chars

if(wiederholen == 'j') {	// falls dem cahr wiederholen der Wert 'j' zugewiesen worden ist, neuen Port einlesen
System.out.println("Bitte neuen Port eingeben: ");
port = Integer.parseInt(in.readLine());
}
else break;	// Beendet die While Endlosschleife 

}

	}
}
