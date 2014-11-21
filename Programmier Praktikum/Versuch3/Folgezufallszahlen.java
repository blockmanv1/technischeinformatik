package versuch3;
/**
 * PP Arbeitsbaltt 3

 * Aufgabe: 2
 */

import java.io.*;
public class Folgezufallszahlen {

	public static void main(String[] args) throws IOException {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int a, b, m, z = 300;  					  
System.out.println("Bitte 1. Zufallszahl eingeben: ");
a = Integer.parseInt(in.readLine());
System.out.println("Bitte 2. Zufallszahl eingeben: ");
b = Integer.parseInt(in.readLine());
System.out.println("Bitte Bereich der Zufallszahlen angeben: ");
m = Integer.parseInt(in.readLine()) + 1;  // +1 da der Zufallszahlen Bereich immer zwischen 0 und m-1 liegt 

for(int i = 1; i <= 20; i++) {	// For Schleife um 20 Werte auszugeben
	z = zufall(a,b,m,z);		// "Zufahllszahl" berechnen  
	System.out.println(i + ".Zufallszahl: " + z);
}
}

public static int zufall (int a, int b, int m, int z){ 	// Methode mit 4 erwarteten Parametern
	z = (a*z+b)%m;										// Berechnung des neuen z
	return z;
}


	}


