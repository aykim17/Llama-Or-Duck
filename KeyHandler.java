import javax.swing.*;
import java.awt.event.*;

public class KeyHandler implements KeyListener {

	private Panel panel = MainGUI.panel;

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			panel.setImage();
		}
	}
	
	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {}
}