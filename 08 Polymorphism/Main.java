/**
 * Main
 * @author Victor Lourng
 * @version	2016
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        
  Instrument A = new Piano("Eric");
  System.out.println(A.toString());
  // Instrument owned by Eric with a family of Keyboard has 88 NoteRange. 
  // It's a Piano! (In this case, NoteRange = # of keys.) LowestHz is 4186.01. HighestHz is 27.5. 
    
  Instrument B = new Guitar("Kyle");
  System.out.println(B.toString());
  // Instrument owned by Kyle with a family of String has 126 NoteRange. 
  // It's a Guitar! (In this case, NoteRange = # of Strings*Frets.) It has 6 Strings and 21 Frets. 

  Instrument C = new Flute("Lily");
  System.out.println(C.toString());
  //Instrument owned by Lily with a family of Woodwind has 6 NoteRange. 
  // It's a Flute! (In this case, NoteRange = # of Holes.) It has 6 Holes. 

  Instrument D = new Flute("Lily",4);
  System.out.println(D.toString());
  // Instrument owned by Lily with a family of Woodwind has 4 NoteRange. 
  // It's a Flute! (In this case, NoteRange = # of Holes.) It has 4 Holes. 

  }
}