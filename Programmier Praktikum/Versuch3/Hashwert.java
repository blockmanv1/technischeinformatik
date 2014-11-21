package versuch3;
/**
 * PP Arbeitsbaltt 3

 * Aufgabe: 3
 */


import java.io.*;
public class Hashwert {

	public static void main(String[] args) throws IOException {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String s;

do{
System.out.println("Bitte umzuwandelnden String eingeben: ");
s = in.readLine();
System.out.println("Hashwert: " + hash(s));		// Methode aufrufen und String uebergeben
System.out.println("Nochmal ? y/n");
}while(in.readLine().charAt(0) == 'y');		
	}
	
public static int hash (String s){
	int wert = 0;
	char hashwerte[] = new char[s.length()];		// Anlegen eines Char Arrays mit der länge von s
	for(int i = 0; i < s.length(); i++) {
	hashwerte[i] = s.charAt(i);						// Einzelne Chars aufrufen und mit der Variable wert mit sich selber addieren
	wert = wert + hashwerte[i];
	}
	wert = wert % 512;								// Zufälliger Modulo von wert 
	return wert;
}	
}
