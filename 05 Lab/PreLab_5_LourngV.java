// package lab_5;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class PreLab_5_LourngV {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        String s = "Program Design and Abstraction";
        
        /* Print just the substring "Design" */
        System.out.println(s.substring(8,14));
        
        /* Print "Welcome to Program Design and Abstraction!!!" using the original 
           string */
        String welcome = "Welcome to ";
        System.out.println(welcome + s + "!!!");
        
        /* Initialize a random number generator */
        Random rnd = new Random();
        
        /* Ask for an integer input from the user which will be used as the size
           of an integer array */
        System.out.println("What is your favorite number? This will be used to generate the size of an integer array. Integers only!");
        int size = kb.nextInt();
        
        /* Assign each element in the integer array with a random number from 
           0 - 100, inclusive */
        int[] ray = new int[size];
        for (int idx = 0; idx < ray.length; idx++){ 
          ray[idx] = rnd.nextInt(101); // between 0 and 100
        }
        
        /* Print the array elements 
           HINT: Arrays.toString() may be helpful */
        System.out.print("{" + ray[0]);
        for (int idx = 1; idx < ray.length; idx++) {
          System.out.print(", "+ray[idx]);
        }
        System.out.println("}");
    } // end of main

} // end of class
