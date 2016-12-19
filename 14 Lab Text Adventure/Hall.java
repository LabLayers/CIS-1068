import java.util.*;
// package 14Lab;

/**
 * Hall.java
 * @author Victor Lourng, Dan Burger, Eric Hart, Jacob Davis
 * @version	2016
 */
 
public class Hall extends Room {
  
  private boolean sword;
  private boolean potion;
  
  public Hall{
    // super();
    sword = hasSword;
    potion = Math.random(); // FIX THIS
  }
  
  public boolean hasSword(boolean s){
    if(s == true) return false;
    else return true; // default
  }
}