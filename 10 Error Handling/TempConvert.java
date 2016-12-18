public class TempConvert  {

public String normalizeScale​(String s) throws Exception {

if (null == s) {

throw new Exception("inScale is null.");

}

s = s.toLowerCase();

if ( s.equals("c") || s.startsWith("cels") ) { return "C"; }

if ( s.equals("f") || s.startsWith("fahr") ) { return "F"; }

return "?";

}

public double convertTemp(double temp, String inUnit, String outUnit) {

try {

double otemp = tc.convertTemp(itemp,iunit,ounit);

System.out.println("The answer is " + otemp);

} catch (Exception e1) {

System.out.println(e1);

}

return 0.0; // INCOMPLETE

}

} // end class