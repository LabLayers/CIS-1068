/**
 * Test
 * @author Victor Lourng
 * @version	2016
 */
// import com.google.guava;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    // # Execise 1 (see getType method below)
    
    // 1. I created a getType method to determine the type of the result.

    getType("hello world" + '!'); // concat String
    getType("hello world" + 2); // concat String
    getType("hello world" + 2.96); // concat String
    getType("hello world" + 'a'); // concat String
    getType("hello world" + 0202 + "hi"); // concat String
    getType("hello world" + 2 + 6 + 8.01 + "hello" + 5); // concat String
    getType("hello world" + (2 + 6) + 8.01 + "hello" + 5); // concat and add String
    getType(1 + 1.0); // add double

    // 2.
    // |         | boolean       | char          | int           | double        | String        |
    // |---------|---------------|---------------|---------------|---------------|---------------|
    // | boolean | illegal       | illegal       | illegal       | illegal       | concat String |
    // | char    | illegal       | add int       | add int       | add double    | concat String |
    // | int     | illegal       | add int       | add int       | add double    | concat String |
    // | double  | illegal       | add double    | add double    | add double    | concat String |
    // | String  | concat String | concat String | concat String | concat String | concat String |
    
    // getType(true + true);
    // getType(true + 'c');
    // getType(true + 1);
    // getType(true + 3.5);
    getType(true + "hello");
    
    // getType('c' + true);
    getType('c' + 'c');
    getType('c' + 1);
    getType('c' + 3.5);
    getType('c' + "hello");
    
    // getType(1 + true);
    getType(1 + 'c');
    getType(1 + 1);
    getType(1 + 3.5);
    getType(1 + "hello");
    
    // getType(3.5 + true);
    getType(3.5 + 'c');
    getType(3.5 + 1);
    getType(3.5 + 3.5);
    getType(3.5 + "hello");
    
    getType("hello" + true);
    getType("hello" + 'c');
    getType("hello" + 1);
    getType("hello" + 3.5);
    getType("hello" + "hello");
    
    // 3. As a programmer, all of these make sense to me.
    //
    //    The choice to not make booleans addable (except for strings) seems pretty unavoidable.
    //    I also felt like the choice to allow any type of data to be added to (and converted
    //    into) Strings seems intentional, to make programming much easier because there are
    //    any common use cases for this.
    //
    //    What may be confusing for beginners is how understanding char works - it
    //    stores an ASCII integer value that corresponds to a specific character. Therefore
    //    that is why it can be added into ints or doubles. It can also be said that the way
    //    data is stored char is stored is to prevent redundancy with String.

    // 4. x++ is valid because you are incrementing the ascii integer value stored inside the char.
    //    When you add and int to a char, however, the result is an int and by default it cannot be
    //    stored back into a char.

    char x = 'x';
    x++;
    getType(x); // returns y as a char
    
    x = x+1;    // error: incompatible types: possible lossy conversion from int to char
    getType(x);
    
    int y = x+1;
    getType(y); // 'y' char -> ascii int value is 121 -> + 1 int = 122 int

    // 5. It casts entire object into a string and concatnates an empty string
    //    in front of it, exhibiting the expected behavior to table above.
    // |         | empty String  |
    // |---------|---------------|
    // | boolean | concat String |
    // | char    | concat String |
    // | int     | concat String |
    // | double  | concat String |
    // | String  | concat String |
    
    getType("" + true);
    getType("" + 'c');
    getType("" + 1);
    getType("" + 3.5);
    getType("" + "hello");
    
    // 6. 
    // Across: original data type; Down: type of value assigned
    // |         | boolean | char | int | double | string |
    // |---------|---------|------|-----|--------|--------|
    // | boolean | yes     | no   | no  | no     | no     |
    // | char    | no      | yes  | yes | no     | no     |
    // | int     | no      | yes  | yes | no     | no     |
    // | double  | no      | yes  | yes | yes    | no     |
    // | String  | no      | no   | no  | no     | yes    |  

    boolean a1 = true;
    boolean a2 = 'c';
    boolean a3 = 1;
    boolean a4 = 3.5;
    boolean a5 = "hello";

    char b1 = true;
    char b2 = 'c';
    char b3 = 1;
    char b4 = 3.5;
    char b5 = "hello";

    int c1 = true;
    int c2 = 'c';
    int c3 = 1;
    int c4 = 3.5;
    int c5 = "hello";

    double d1 = true;
    double d2 = 'c';
    double d3 = 1;
    double d4 = 3.5;
    double d5 = "hello";

    String e1 = true;
    String e2 = 'c';
    String e3 = 1;
    String e4 = 3.5;
    String e5 = "hello";
    
    // # I also did execise 6 as a quick challenge (see doubloon method below)
    
    System.out.println("abba: "+doubloon("abba"));
    System.out.println("coco: "+doubloon("coco"));
    System.out.println("isis: "+doubloon("isis"));
    System.out.println("mama: "+doubloon("mama"));
    System.out.println("murmur: "+doubloon("murmur"));
    System.out.println("apple: "+doubloon("apple"));
    System.out.println("Wawa: "+doubloon("Wawa"));
    System.out.println("temple: "+doubloon("temple"));

  }

  public static void getType(Object x) {
    System.out.println(x);
    System.out.println(x.getClass().getName());
  }
  public static void getType(int line, Object x) {
    System.out.println("[Line " + line + "]: " + x);
    System.out.println(x.getClass().getName());
  }
  
  public static boolean doubloon(String word) {
    word = word.toLowercase();
    System.out.println(word);
    int occurances = 0;
    for (int i = 0; i < word.length(); i++) {
      occurances = 0;
      for (int j = 0; j < word.length(); j++) {
        if (word.charAt(j) == word.charAt(i)) {
          occurances++;
          // System.out.println(word.charAt(j) + " occurance " + occurances);
        }
      }
      if (occurances != 2) {
        return false;
      }
    }
    return true;
  }
}