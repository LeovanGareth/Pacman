import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * 
 */

/**
 * @author Jonathan Räsch
 *
 */
public class Main {
  
  /**
  * @param args
  */
  public static void main(String[] args) {
    
    JFrame.setDefaultLookAndFeelDecorated(true);
    
    GameWindow w = new GameWindow();
    GameMap map = new GameMap();
    Player p = new Player();
    KeyListener keys = new KeyListener();
    w.addKeyListener(keys);
    
    w.update(map,p);
    p.update(map);
    
    p.moveRight();
    while(w.exists()) {
        
      if(keys.isPressed(KeyEvent.VK_UP)) {
        p.moveUp();
      }
      
      if(keys.isPressed(KeyEvent.VK_DOWN)) {
        p.moveDown();
      }
      
      if(keys.isPressed(KeyEvent.VK_RIGHT)) {
        p.moveRight();
      }
      
      if(keys.isPressed(KeyEvent.VK_LEFT)) {
        p.moveLeft();
      }
      w.update(map,p);
      w.repaint();
      p.update(map);
    }
  }
  
}
