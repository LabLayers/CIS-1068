import java.util.*;
// package 14Lab;

/**
 * Game.java
 * @author Victor Lourng, Dan Burger, Eric Hart, Jacob Davis
 * @version	2016
 */
 
public class Game {

   public Game() {
      init();
   }
    
   private void init() {
      // let's name him tom (internallly)
      Player tom = new Player();
      World world = new GenerateWorld();
   }
   
   public void run() {
      boolean running = true;
      while (running) {
         System.out.println("[SYSTEM] Game is running!");
         running = false;
      }
   }
}