import java.util.*;
// package 14Lab;

/**
 * GenerateWorld.java
 * @author Victor Lourng, Dan Burger, Eric Hart, Jacob Davis
 * @version	2016
 */
 
public class GenerateWorld {
  
  public GenerateWorld() {
    // Not random enough?
    Room[] map = new Room[3][3];
    map[0] = {hall, hall, fight};
    map[1] = {hall, ladder, key};
    map[2] = {fight, hall, hall};
    
    shuffle();
  }

  private void shuffle() {
    for (int i = map-1; i > 0; i--) {
        int rand = (int)(Math.random()*(i+1));
        Room temp = map[i];
        map[i] = map[rand];
        map[rand] = temp;
    }
  }

}