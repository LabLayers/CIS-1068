import java.util.Scanner; 

class TempConvert {
  
  public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

TempConvert tc = new TempConvert();

System.out.println("I am the temp converter.");

System.out.print("Input temp?");

double itemp = scanner.nextDouble();

System.out.print("Input units?");

String iu = scanner.nextLine();

System.out.print("Output units?");

String ou = scanner.nextLine();

double otemp = tc.convertTemp(itemp,iu,ou);

System.out.println("The answer is " + otemp);
// System.out.println(convertTemp(-273.15,"C","Fahrenheit"));

  }
  

public static double convertTemp(double temp,

String iScale, String oScale) {

iScale = normalizeScale(iScale);

oScale = normalizeScale(oScale);

if (iScale.equals(oScale)) { return temp;

} else if (iScale.equals( "C" )) { return cToF(temp);

} else { return fToC(temp);

}

}

public static double cToF(double c) { return 32 + c * 9/5; }

public  static double fToC(double f) { return (f - 32) * 5/9; }

public static String normalizeScale(String s) {

if (s.equals("c") || s.equals("celsius")

|| s.equals("C") || s.equals("Celsius")) {

return "C";

}

if (s.equals("f") || s.equals("fahrenheit")

|| s.equals("F") || s.equals("Fahrenheit") ) {

return "F";

}

return "?";

}

} // end class