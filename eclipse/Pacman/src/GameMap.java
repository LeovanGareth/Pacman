import java.awt.Graphics;

/**
 * 
 */

/**
 * @author Jonathan
 *
 */
public class GameMap {
	final boolean[][] mapData = new boolean[16][12];
	
	public GameMap() {
		
	}
	
	public void addWall(int x, int y) {
		mapData[x][y] = true;
	}
	
	public void removeWall(int x, int y) {
		mapData[x][y] = false;
	}
	
	public boolean isWall(int x, int y) {
		return mapData[x][y];
	}
	
	public void draw(Graphics g, int wallSize) {
		for(int x = 0; x < 16; x++) {
			for(int y = 0; y < 12; y++) {
				if(mapData[x][y]) {
					g.fillRect(x*wallSize, y*wallSize, wallSize, wallSize);
					//System.out.println(g.getClipBounds().getX());
				}
			}
		}
	}
}
