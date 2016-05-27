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
		
		map.addWall(0, 0);
		
		while(w.exists()) {
			w.update(map);
			w.repaint();
			p.update(map);
		}
	}

}
