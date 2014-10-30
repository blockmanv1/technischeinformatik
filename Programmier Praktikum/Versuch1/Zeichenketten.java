package versuch1;
/*

Aufgabe: 5
*/

import java.io.*;

public class Zeichenketten {
	public static void main(String[] args) throws IOException {
	String s1 = "Hallo",s2 ="Welt",s3;    // Erstellt drei Strings und weist s1 den Refernzwert "Hallo" und s2 den Referenzwert "Welt" zu.
	s3 = s1 + " " + s2; 				  // s3 verweist auf s1, ein Leerzeichen und s2
	System.out.println(s3);				  // Ausgabe von s3
	}
}
