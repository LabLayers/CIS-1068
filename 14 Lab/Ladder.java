import java.util.*;
// package 14Lab;

/**
 * Ladder.java
 * @author Victor Lourng, Dan Burger, Eric Hart, Jacob Davis
 * @version	2016
 */
 
public class Ladder extends Room {
    
  private boolean key;
  
  public Ladder() {
    super();
  }
  
  public void unlock(boolean hasKey){
    if(hasKey == false) System.out.println("You must find a key before you can unlock this door");
    else System.out.println("You unlock the door and find that this room is the exit. You have finally escaped the dungeon. Congrats. ");
  }
}