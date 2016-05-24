import javax.swing.JFrame;

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
		
		while(w.exists()) {
			w.revalidate();
		}
	}

}
