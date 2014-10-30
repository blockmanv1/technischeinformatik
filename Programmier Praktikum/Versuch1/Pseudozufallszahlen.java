package versuch1;
/*

Aufgabe: 1

*/
import java.io.*;

public class Pseudozufallszahlen {
	 public static void main(String[] args) throws IOException {
		    int a= 27, b= 45, m= 100, z = 356;  // Zufälle Zahlen ausgewählt und in Integer(32 Bit Ganzzahl) Variabeln gespeichert
		    // m bestimmt das Ergebniss der zufälligen Zahl: Das Ergebnis liegt zwischen 0 und m-1
		  
		      z= (a*z+b)%m;						  // Multipliziert erst a und z und addiert dann b, danach wird aus dem Ergebniss Modulo m genommen und in z gepsiechert	
		      System.out.println(z);			  // Ausgabe von z
		    } 
		  }

