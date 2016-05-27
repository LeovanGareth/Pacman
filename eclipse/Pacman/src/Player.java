/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 27.05.2016
  * @author 
  */

public class Player extends GameChar{
  void moveUp() {
    if (!map.isWall(x, y-1)) {
      y--;
    } // end of if
  }
  
  void moveDown(){
    if (!map.isWall(x, y+1)) {
      y++;
    } // end of if
  }
  
  void moveRight(){
    if (!map.isWall(x+1, y)) {
      x++;
    } // end of if
  }
  
  void moveLeft(){
    if (!map.isWall(x-1, y)) {
      x--;
    } // end of if
  }
} // end of Player
