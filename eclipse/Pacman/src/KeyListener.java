import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class KeyListener extends KeyAdapter{
	Map<Integer, Boolean> keyTable = new HashMap<Integer, Boolean>();
	
	@Override
	public void keyPressed(KeyEvent e) {
        keyTable.put(e.getKeyCode(), true);
    }

	@Override
    public void keyReleased(KeyEvent e) {
		keyTable.put(e.getKeyCode(), false);
    }
	
	public boolean isPressed(int keyCode) {
		if(!keyTable.containsKey(keyCode)) {
			keyTable.put(keyCode, false);
		}
		
		return keyTable.get(keyCode);
	}
}
