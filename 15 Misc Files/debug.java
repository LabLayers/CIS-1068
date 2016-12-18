import java.util.*; 
// import com.google.guava;

public class debug {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    boolean A = false;
    boolean B = false;
    boolean C = false;
    System.out.print( !(A && B && C));


    // int [][] fire = new int[10][10];
    // char [][] tree = new char[10][10];
    // for(int i = 0; i< fire.length; i++){
    //   for (int j = 0; j < fire[i].length; j++){
    //     fire[i][j] = (int)(Math.random() * 94) + 34;
    //     tree[i][j] = (char)fire[i][j];
    //   }
    //   printArray(fire[i]);
    //   printArray(tree[i]);
    // }

  }


  public static void printArray(int[] ray) {
    System.out.print("{" + ray[0]);
    for (int idx = 1; idx < ray.length; idx++) {
      System.out.print(", "+ray[idx]);
    }
    System.out.println("}");
  }


  public static void printArray(char[] ray) {
    System.out.print("{" + ray[0]);
    for (int idx = 1; idx < ray.length; idx++) {
      System.out.print(", "+ray[idx]);
    }
    System.out.println("}");
  }

}