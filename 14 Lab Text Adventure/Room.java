import java.util.*;
// package 14Lab;

/**
 * Room.java
 * @author Victor Lourng, Dan Burger, Eric Hart, Jacob Davis
 * @version	2016
 */
 
public class Room {

  public Room() {
  }
  
  //*****************************************************
  // passes current coordinates and the desired direction
  // of travel to check if there is a door to enter
  //*****************************************************
  public boolean hasDoor(int x, int y, String dir){
    if(dir.equals("left")){
      if(y==0){
        return false; // there are no lefthand doors in column 0
      }
      else{
        return true;
      }
    }
    else if(dir.equals("right")){
      if(y==2){
        return false;
      }
      else{
        return true;
      }
    }
    else if(dir.equals("up")){
      if(x==0){
        return false;
      }
      else{
        return true;
      }
    }
    else { // if(dir.equals("down")){
      if(x==2){
        return false;
      }
      else{
        return true;
      }
    }
  }
}