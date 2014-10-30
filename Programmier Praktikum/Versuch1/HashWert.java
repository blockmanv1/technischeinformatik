package versuch1;
/*

Aufgabe: 2
*/

import java.io.*;

public class HashWert {
	public static void main(String[] args) throws IOException {
	 
	char c1 = 'K',c2 = 'ö',c3 = 'l',c4 = 'n'; // 4 Buchstaben als Char deklariert. Entspricht den Werten : // K = 75, ö = 246, l = 108, n = 110
	int m = 512;  // modulo 512
	
	System.out.println((c1+c2+c3+c4)%m);  // Addiert die Dezimal Werte der einzelnen Char Variablen und nimmt den modulo aus der Summe.
	}

}
