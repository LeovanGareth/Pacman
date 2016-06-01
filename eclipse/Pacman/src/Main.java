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
		
		map.addWall(0, 0);
		
		while(w.exists()) {
			if(keys.isPressed(KeyEvent.VK_ESCAPE)) {
				map.addWall(5, 5);
			} else {
				map.removeWall(5, 5);
			}
			
			w.update(map);
			w.repaint();
			p.update(map);
		}
	}

}
