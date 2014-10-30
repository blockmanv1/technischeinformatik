package versuch1;
/*

Aufgabe: 1.2
*/

import java.io.*;

public class EinfachesProgramm2 {

	public static void main(String[] args) throws IOException {
		int x, y, resultat;
	    
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Bitte Operand x eingeben: ");
	    x = Integer.parseInt(in.readLine());
	    System.out.println("Bitte Operand y eingeben: ");
	    y = Integer.parseInt(in.readLine());
	    
	    resultat = (x+y) / 2;
	    
	    System.out.println("Resultat: " +resultat);

	}

}
