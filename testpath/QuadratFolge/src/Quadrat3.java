
public class Quadrat3 {
	public static double quadrat(double z) {
		return z*z;
	}
	public static String[] eingabe(){
		String inputNum[]; //Deklaration ohne feste Laenge
		inputNum = new String[2];//Erzeugung mit Laenge 2
		java.util.Scanner scan1 = new java.util.Scanner(System.in); //legt ein neues scanner Objekt an
		System.out.println("Bitte die untere Grenze eingeben!(Ganzzahl)"); //schreibt was der Anwender eingeben soll
		inputNum[0] = scan1.next(); //Den eingegebenen Wert als String (!) einlesen
		System.out.println("Bitte die obere Grenze eingeben!(Ganzzahl)"); //schreibt was der Anwender eingeben soll
		inputNum[1] = scan1.next(); //Den eingegebenen Wert als String (!) einlesen
		scan1.close(); // Das Eingabe objekt abschließen
		return inputNum;
		
	}

	public static void main(String[] args) {
		int integerNumber[]; //Deklaration ohne feste Laenge
		integerNumber = new int[2]; //Erzeugung mit Laenge 2
		integerNumber[0] =  1;// Zuweisung
		integerNumber[1] = integerNumber[0] + 1;// Zuweisung
		
		// Beginn Eingabe();
		String[] inputNumber = new String[2];// Auf dieser Ebene wird nur eine neue eigenen Variable angelegt
		inputNumber = eingabe();// Diese lädt dann HIER die beiden Werte (Strings!) aus der Eingabemethode 
		
		
		if (inputNumber[0]!= "") {
			integerNumber[0] = Integer.parseInt(inputNumber[0]);// Die Stringeingabe als Integer interpretieren casten.
		}
		if (inputNumber[1] != ""){
			integerNumber[1] = Integer.parseInt(inputNumber[1]);//Die Stringeingabe als Integer interpretieren / casten.
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
