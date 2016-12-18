/**
 * Lab 4 Part 1
 * @author Victor Lourng and Dennis Uritsky
 * @version	2016
 */

import java.util.Scanner;

public class PartOne {
    
  /**
  * Gets divisor from user, gets multiple of divisor from user, then prints the corresponding multiples until it reaches zero.
  */
  public static void main(String[] args){
      
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter your divisor(must be greater than 0):");
    int divisor = keyboard.nextInt();
    int multiple = divisor;
    int attempts = 0;
    while(multiple!=0&&divisor>0){
      System.out.println("Please enter a multiple of " + divisor + ".");
      multiple = keyboard.nextInt();
      attempts++;
      if(attempts>3){
        System.out.println("You have failed 1068.");
        break;
      }
      else if(multiple%divisor!=0&&attempts>=3){
        System.out.println();
      }
      else{
        while(multiple%divisor==0&&multiple>0){
          System.out.println(multiple-divisor);
          multiple -=divisor;
        }
      }
    }
     
  }
}