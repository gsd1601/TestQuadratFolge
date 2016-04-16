
public class Quadrat {
	public static double quadrat(double z) {
		return z*z;
	}
//	int integerMaxNumber = 1;
//	public static int eingabe(){
//		int integerMaxNumber = 1;
//		java.util.Scanner scan1 = new java.util.Scanner(System.in);
//		System.out.println("Bitte  die Stütztstellen pro Periode eingeben! (Ganzzahl)");
//		String inputMaxNumber = scan1.next();
//		scan1.close();
//      if (inputMaxNumber != ""){
//		integerMaxNumber = Integer.parseInt(inputMaxNumber);
//      }
//		return integerMaxNumber;
//	}

	public static void main(String[] args) {
		// Beginn Eingabe();
		int integerMinNumber = 1; //Variablendeklaration und Vorbelegung 
		int integerMaxNumber = integerMinNumber + 1;
		java.util.Scanner scan1 = new java.util.Scanner(System.in); //legt ein neues scanner Objekt an
		System.out.println("Bitte die untere Grenze eingeben!(Ganzzahl)"); //schreibt was der Anwender eingeben soll
		String inputMinNumber = scan1.next(); //Den eingegebenen Wert als String (!) einlesen
		System.out.println("Bitte die obere Grenze eingeben!(Ganzzahl)"); //schreibt was der Anwender eingeben soll
		String inputMaxNumber = scan1.next(); //Den eingegebenen Wert als String (!) einlesen
		scan1.close(); // Das Eingabe objekt abschließen
		if (inputMinNumber != "") {
			integerMinNumber = Integer.parseInt(inputMinNumber);// Die Stringeingabe als Integer interpretieren casten.
		}
		if (inputMaxNumber != ""){
		integerMaxNumber = Integer.parseInt(inputMaxNumber);//Die Stringeingabe als Integer interpretieren / casten.
        }
		
		
		System.out.println("Die obere Grenze ist "+ integerMaxNumber);
		for (int i=integerMinNumber;i<=integerMaxNumber; i=i+10){
			System.out.println(i + " " + quadrat(i));
		}
	}
}
