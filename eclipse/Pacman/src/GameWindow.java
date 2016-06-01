import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Jonathan Räsch
 *
 */
public class GameWindow extends JFrame {
  private static final long serialVersionUID = -5710795868465552255L;
  boolean disposed = false;
  GameMap map = new GameMap();
  GameState state = GameState.GAME;
  
  /**
  * @throws HeadlessException
  */
  public GameWindow() {
    this("Game Window");
  }
  
  /**
  * @param title
  * @throws HeadlessException
  */
  public GameWindow(String title){
    super(title);
    
    
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosed(WindowEvent we) {
        disposed = true;
      }
    });
    
    
    Dimension screenSize = getToolkit().getScreenSize();
    int width = screenSize.width;
    int height = screenSize.height;
    if((double)width/(double)height >= 8.0d/6.0d) {
      width = 8*screenSize.height/9;
      height = 2*screenSize.height/3;
    } else {
      height = 3*screenSize.width/8;
      width = screenSize.width/2;
    }
    
    int heightDif = -(height % 12);
    int widthDif = (height + heightDif)*16/12 - width;
    this.getContentPane().setPreferredSize(new Dimension(width+widthDif, height+heightDif));
    this.pack();
    
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    
    
    setContentPane(new GameScreen());
    
    
    this.setVisible(true);
  }
  
  /**
  * Update Member Variablen für Spiel(GameMap, Player, ...)
  * @param map neue Map
  */
  public void update(GameMap map, GameState state) {
    this.map = map;
    this.state = state;
  }
  
  /**
  * Class to paint Window Content
  */
  private class GameScreen extends JPanel {
    private static final long serialVersionUID = 6290571875202113600L;
    
    @Override
    public void paint(Graphics g) {
      super.paint(g);
      
      switch (state) {
        case GAME: 
        map.draw(g, g.getClipBounds().width/16);
        break;
        case CHARACTER_SELECT: 
        
        break;
        case GAME_OVER:
        
        break;
        case GAME_MENU:
        
        break;
        default: 
        
      } // end of switch
    }
  }
  
  public boolean exists() {
    return !disposed;
  }
}
