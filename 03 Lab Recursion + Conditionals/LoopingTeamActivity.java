/**
 * Looping Team Activity
 * @author People
 * @version	2016
 */
// import java.util.Scanner; 
 
public class LoopingTeamActivity {
  public static void main(String[] args) {
    int x, y, z, a;
    // Section 1
        x = 1;
        y = 2;	
        y = x; // y = 1
        x = y; // x = 1
        // Value of x = 1   
        // Value of y = 1 
        System.out.println("Section 1 x: " + x);
        System.out.println("Section 1 y: " + y);
     /* Section 2 */
        x = 1;
        y = 2;
        z = y; // z = 2
        y = x; // y = 1
        x = z; // x = 2
        // Value of x = 2   
        // Value of y = 1
        System.out.println("Section 2 x: " + x);
        System.out.println("Section 2 y: " + y);
    /* Section 3 */
        z = 2;
        z = z + 1; // z = 3
        z = z + 1; // z = 4
        // a = a + 1; // a did not have a preset value
        // Value of z = 4
        // Value of a = error
        System.out.println("Section 3 z: " + z);
        // System.out.println("Section 3 a: " + a);
    }
}
  