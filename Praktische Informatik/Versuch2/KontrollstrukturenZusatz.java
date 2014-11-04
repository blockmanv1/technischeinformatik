package versuch2;
/*
Name: Patrick Heﬂe
Gruppennummer: 41
Aufgabe: 2.1Z
*/
import java.io.*;

public class KontrollstrukturenZusatz {

	public static void main(String[] args) throws IOException {
		String s;
		char c,ew;		// Variabeln deklarieren
		int p;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
		
		do {		// Fuﬂ gesteuerte Do...While Scheife

System.out.println("String eingeben:");			
s = in.readLine();						// String eingabe
System.out.println("Char eingeben:");
c = (char) in.readLine().charAt(0);		// char eingabe
p=-1;

for(int i= 0; i<= (s.length()-1); i++)	// For Schleife, die sich nach der L‰nge des Strings s richtet
	
	if(s.charAt(i)==c){		// Sobald der Char im String vorkommt, auslesen der Position mit Hilfe der For Schleife
		p = i;
		break;
	}

if(p==-1){					// Falls p keinen neuen Wert bekommt
	System.out.println("Nicht gefunden");
}
else {						// Ausgabe der Position des char c
System.out.println("Position: " + p);	
}

System.out.println("Eingabe wiederholen? j/n");
ew = (char) in.readLine().charAt(0); // Einlesen eines neuen Chars
		}while(ew == 'j');			 // Schleife solange wiederholen wie der Benutzer den char 'j' angibt
	
	}

}
