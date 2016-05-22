import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

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
		
		Dimension screenSize = getToolkit().getScreenSize();
		if((double)screenSize.width/(double)screenSize.height >= 8.0d/6.0d) {
			this.setSize(new Dimension(8*screenSize.height/9, 2*screenSize.height/3));
		} else {
			this.setSize(new Dimension(screenSize.width/2, 3*screenSize.width/8));
		}
		this.setLocationRelativeTo(null);
		
		setContentPane(new GameScreen());
		
		this.setVisible(true);
	}
	
	/**
	 * Class to paint Window Content
	 */
	private class GameScreen extends JPanel {
		private static final long serialVersionUID = 6290571875202113600L;

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			Rectangle clipBounds = g.getClipBounds();
			int width = clipBounds.width;
			int height = clipBounds.height;
			
			
		}
	}
}
