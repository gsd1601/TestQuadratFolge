
public class Quadrat4 {
	public static double quadrat(double z) {
		// return z*z;
		return  Math.pow(z,0.5);
		
	}
	public static String[] eingabe(){
		String inputNum[]; //Deklaration ohne feste Laenge
		inputNum = new String[2];//Erzeugung mit Laenge 2
		java.util.Scanner scan1 = new java.util.Scanner(System.in); //legt ein neues Eingabe- ("scanner-") Objekt an
		System.out.println("Bitte die untere Grenze eingeben!(Ganzzahl)"); //schreibt was der Anwender eingeben soll
		inputNum[0] = scan1.next(); //Den eingegebenen Wert als String (!) einlesen
		// jetzt mit inputCheck 
		inputCheck(inputNum[0]);
		
		System.out.println("Bitte die obere Grenze eingeben!(Ganzzahl)"); //schreibt was der Anwender eingeben soll
		inputNum[1] = scan1.next(); //Den eingegebenen Wert als String (!) einlesen
		inputCheck(inputNum[1]);
		scan1.close(); // Das Eingabe objekt abschließen
		return inputNum;
	}

	public static int inputCheck(String s_sollInteger) {
		int i_sollInteger = 0;
		double d_castableInteger; // Zwischenformat um Double Eingabe als Integer verwenden zu können (z.B 30.0)
		Boolean isInteger = true;
		if (s_sollInteger != "") {
			try {
				i_sollInteger = Integer.parseInt(s_sollInteger);// Die String-Eingabe als Integer interpretieren
			} catch (Exception e) {
				System.out.println(e.getMessage() + " -- Not an integer. " + e.getCause());
				e.printStackTrace();
				isInteger = false;
				System.out.println("Is integer? " + isInteger);
			}
/**Zurück zum Einlesen mit dem BufferedReader. Man liest die Eingabe des Benutzers als String ein. Was, wenn er 
 * eine Zahl eingeben soll? Dann muss der String hinterher in eine Zahl, meistens int, manchmal double, umgewandelt
 *  werden. Das geht mit Integer.parseInt(stringVariable) bzw. Double.parseDouble(stringVariable). Integer und
 *  Double sind Klassen im Package java.lang und müssen deshalb nicht importiert werden. Für die anderen primitiven 
 *  Zahlentypen gibt es dort auch diese sogenannten Wrapperklassen und die entsprechenden Parse-Methoden 
 *  (z.B. Short.parseShort etc.) http://www.javaschubla.de/2007/javaerst0100.html */
			try { // Kopie von oben, als Basis für das Einlesen einer Double-Zahl und casting als integer
				d_castableInteger = Double.parseDouble(s_sollInteger);// Die String-Eingabe als Integer interpretieren
			} catch (Exception e) {
				System.out.println(e.getMessage() + " -- Not an integer, not even a double " + e.getCause());
				e.printStackTrace();
				isInteger = false;
				System.out.println("Is integer? " + isInteger);
			}

		}
		// return isInteger;
		return i_sollInteger;

	}

	public static void main(String[] args) {
		int integerNumber[]; //Deklaration ohne feste Laenge
		integerNumber = new int[2]; //Erzeugung mit Laenge 2
		integerNumber[0] =  1;// Zuweisung  
		integerNumber[1] = integerNumber[0] + 1;// Zuweisung
		int r = 1;// Reiner Dummy Eintrag um eine Änderung für Git zu emulieren
		
		// Beginn Eingabe();
		String[] s_inputNumber = new String[2];// Auf dieser Ebene wird nur eine neue eigenen Variable angelegt
		s_inputNumber = eingabe();// Diese lädt dann HIER die beiden Werte (Strings!) aus der Eingabemethode 
		
		
		if (s_inputNumber[0]!= "") {
			integerNumber[0] = Integer.parseInt(s_inputNumber[0]);// Die Stringeingabe als Integer interpretieren casten.
		}
		
		if (s_inputNumber[1] != ""){
			try {
				integerNumber[1] = Integer.parseInt(s_inputNumber[1]);//Die Stringeingabe als Integer interpretieren / casten.	
			} catch (Exception e){
				// e.printStackTrace();
				System.out.println(e.getMessage() + " -- Das war keine Ganzzahl");
			}
		
			
        }
		// Ende Eingabe
		// Beginn Ausgabe
		System.out.println("Im Intervall von "+ integerNumber[0]+ " bis " + integerNumber[1]);
//  Ausrechnen und Ausgabe    
		for (int i=integerNumber[0];i<=integerNumber[1]; i=i+5){
			System.out.println(i + " " + quadrat(i));
		}
	}
}
