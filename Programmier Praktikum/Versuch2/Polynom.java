/**
 * PP Arbeitsbaltt 2

 * Aufgabe: 3
 */
package versuch2;

import java.io.*;
public class Polynom {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double a,b,c,x_links,x_rechts,x_linkssave;
		int k;
		
		System.out.println("Bitte Wert für a eingeben: ");
		a = Double.parseDouble(in.readLine());
		System.out.println("Bitte Wert für b eingeben: ");
		b = Double.parseDouble(in.readLine());
		System.out.println("Bitte Wert für c eingeben: ");
		c = Double.parseDouble(in.readLine());
		System.out.println("Bitte linke Intervall Grenze eingeben: ");
		x_links = Double.parseDouble(in.readLine());
		System.out.println("Bitte rechte Intervall Grenze eingeben: ");
		x_rechts = Double.parseDouble(in.readLine());
		System.out.println("Anzahl der Stützstellen eingeben: ");
		k = Integer.parseInt(in.readLine());

		if(x_links > x_rechts){
			x_linkssave = x_links;
		x_links = x_rechts;			// Tauschen der Grenzen falls x_links > x_rechts
		x_rechts = x_linkssave;
		}
		
		for (double i = x_links; i <= x_rechts; i += (x_rechts-x_links) / (k+1)){
			double temp = (a*Math.pow(i, 2))+(b*i)+c;				// Berechnung nach der Formel 
			System.out.println("f("+i+") "+" = "+ temp);			
				}
		
		

	}

}
