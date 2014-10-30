package versuch1;
/*

Aufgabe: 1.1
*/

import java.io.*;

public class EinfachesProgramm {

	public static void main(String[] args) throws IOException {
		 double x, y, resultat;
		    
		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Bitte Operand x eingeben: ");
		    x = Double.parseDouble(in.readLine());
		    System.out.println("Bitte Operand y eingeben: ");
		    y = Double.parseDouble(in.readLine());
		    
		    resultat = (x+y) / 2;
		    
		    System.out.println("Resultat: " +resultat);

	}

}
