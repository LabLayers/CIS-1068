import java.util.*;
// package 14Lab;

/**
 * Player.java
 * @author Victor Lourng, Dan Burger, Eric Hart, Jacob Davis
 * @version	2016
 */
 
public class Player {

  private int health = 15;
  private boolean hasSword = false;
  private boolean hasPotion = false;
  private boolean hasKey = false;

  public Player() {
    // privat variables above
  }
  
  public static void setHealth(h) {
    this.health = h;
  }
  
  public static int getHealth() {
    return this.health;
  }
  
  public static void setHasSword(hS){
    this.hasSword = hS;
  }
  
  public static boolean getHasSword(){
    return this.hasSword;
  }
  
  public static void setHasPotion(hP){
    this.hasPotion = hP;
  }
  
  public static boolean getHasPotion(){
    return this.hasPotion;
  }
  
  public static void setHasKey(hK){
    this.hasKey = hK;
  }
  
  public static boolean getHasKey(){
    return this.hasKey;
  }
  
}