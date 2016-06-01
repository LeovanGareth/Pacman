/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 27.05.2016
  * @author 
  */
import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameChar{
  long lastMove = System.currentTimeMillis();
  
  void moveUp() {
    if (y>0&&!map.isWall(x, y-1) && (System.currentTimeMillis()-lastMove) >= 200) {
      y--;
      lastMove = System.currentTimeMillis();
    } // end of if
  }
  
  void moveDown(){
    if (y<11&&!map.isWall(x, y+1)&& (System.currentTimeMillis()-lastMove) >= 200) {
      y++;
      lastMove = System.currentTimeMillis();
    } // end of if
  }
  
  void moveRight(){
    if (x<15&&!map.isWall(x+1, y)&& (System.currentTimeMillis()-lastMove) >= 200) {
      x++;
      lastMove = System.currentTimeMillis();
    } // end of if
  }
  
  void moveLeft(){
    if (x>0&&!map.isWall(x-1, y)&& (System.currentTimeMillis()-lastMove) >= 200) {
      x--;
      lastMove = System.currentTimeMillis();
    } // end of if
  }
  
  public void draw(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(x*32,y*32,32,32);
  }
} // end of Player
