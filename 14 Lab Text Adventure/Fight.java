import java.util.*;
// package 14Lab;

/**
 * Hall.java
 * @author Victor Lourng, Dan Burger, Eric Hart, Jacob Davis
 * @version	2016
 */
 
public class Fight extends Room {
  
  private static final String[] MONSTER = {"RAT", "GORILLA", "DRAGON", "UNICORN"};
  private int roomMonster; // for random selection of monster array cell
  
  public Fight(){
    super();
    roomMonster = (int)(Math.random() * 3);
  }
  
  // *******************************
  // this method selects the correct
  // monster method for the fight
  // *******************************
  public void selectFight(int h){
     if (roomMonster == 0){
       rat(h);
     }
     else if (roomMonster == 1){
       gorilla(h);
     }
     else if (roomMonster == 2){
       dragon(h);
     }
     else { // if (roomMonster == 3){
       unicorn(h);
     }
  }
  
  public void fight(int h, int m, boolean hasSword){
    Random rnd = new Random();
    Scanner k = new Scanner(System.in);
    int pDmg = 3;
    int mDmg = 2;
    if(hasSword) pDmg = 6;
    int mHealth = 0;
    int act;
    if(m==0) mHealth = 3;
    else if(m==1) mHealth = 7;
    else if(m==2) mHealth = 10;
    else mHealth = 12;
    
    while(mHealth > 0 || h > 0){
      System.out.println("Your HP: "+h+"\tEnemy's HP: "+mHealth);
      System.out.println("Choose an action:\n\t1) Attack\n\t2) Health Potion\n\t3) Run");
      act = k.nextInt();
      if(act>3||a<1) act = errorCheck(act);
      
      if(act == 1){
        int damageDealt, damageTaken;
        damageDealt = rnd.nextInt(3);
        damageTaken = rnd.nextInt(2);
        h -= damageTaken;
        mHealth -= damageDealt;
        
        System.out.println("You strike the monster for "+damageDealt+" damage");
        System.out.println("You receive "+damageTaken+" ")
        

      }
      }
  }  
  
  public int errorCheck(int a){
    Scanner k = new Scanner(System.in);
    while(a > 3 || a < 1){
      System.out.println("Please enter a valid action:");
      a = k.nextInt();
    }
    return a;
  }
}