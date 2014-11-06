/**

Aufgabe: 2.2
 */
package versuch2;

import java.io.*;
public class MethodenAufruf {
	
	public static void main(String[] args) throws IOException {

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
double z1,z2,z3;

System.out.printf("Bitte die %d. Zahl eingeben: ", 1);
z1 = Double.parseDouble(in.readLine());						
System.out.printf("Bitte die %d. Zahl eingeben: ", 2);		//Abfragen der 3 Double Werte
z2 = Double.parseDouble(in.readLine());
System.out.printf("Bitte die %d. Zahl eingeben: ", 3);
z3 = Double.parseDouble(in.readLine());

System.out.printf("Kleinste Zahl: " + minimal(z1,z2,z3));	// Ausgabe der Methode mit den Variabeln z1,z2,z3 
		
	}

public static double minimal(double dz1, double dz2,double dz3){	// Methode um das Minimal von 3 Variabeln zu berechnen 
double minimal = dz1;				// Einfache Wert Zuweisung
if (dz2 < minimal) minimal = dz2;	// Erste Überprüfung 
if (dz3 < minimal) minimal = dz3;	// ZWeite Überprüfung
return minimal;						// Rückgabewert der Methode 
	}
	
}
