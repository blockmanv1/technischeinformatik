package versuch1;
/*

Aufgabe: 3
*/

import java.io.*;

public class Flags {
	public static void main(String[] args) throws IOException {
short flags = 25245, b;     // 0110001010011101   zuf�llige Zahl in Bin�r Darstellung
byte k = 13;				// 14. Stelle der Bin�r Zahl ausw�hlen

b = (short) (flags >> k);    // Shift Operator

System.out.println(b%2);		
// Ausgeben der 16 Bit Short Variablen durch modulo 2. Gibt entweder 0 oder 1 aus jenachdem welche 
// Stelle im byte k ausgew�hlt wurde.
	}
	}

