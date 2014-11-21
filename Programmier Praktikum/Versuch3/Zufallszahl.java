package versuch3;
/**
 * PP Arbeitsbaltt 3
 
 * Aufgabe: 1
 */

import java.io.*;
public class Zufallszahl {

	public static void main(String[] args) throws IOException {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

int a, b, m;  
System.out.println("Bitte 1. Zufallszahl eingeben: ");
a = Integer.parseInt(in.readLine());
System.out.println("Bitte 2. Zufallszahl eingeben: ");
b = Integer.parseInt(in.readLine());
System.out.println("Bitte Bereich der Zufallszahlen angeben: ");
m = Integer.parseInt(in.readLine()) + 1;  // +1 da der Zufallszahlen Bereich immer zwischen 0 und m-1 liegt 

System.out.println("Zufallszahl: " + zufall(a,b,m));	// Aufrufen von der Methode zufall und uebergeben der Parameter		
	}

public static int zufall (int a, int b, int m){		// Methode mit 3 Parametern
int z = 300;										// festgelegter Start Wert von z
	z = (a*z+b)%m;
	return z;
}

}
