import javax.swing.*;
import java.awt.event.*;

public class KeyHandler implements KeyListener {

	private Panel panel = LlamaOrDuck.panel;


	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_L && panel.getImage().contains("llama")) {
			panel.setImage();
			panel.updateScore();
		} else if (e.getKeyCode() == KeyEvent.VK_D && panel.getImage().contains("duck")) {
			panel.setImage();
			panel.updateScore();
		} else if (e.getKeyCode() == KeyEvent.VK_R && panel.getImage().contains("loss")) {
			panel.reset();
		} else {
			panel.setLost();
		}
	}
	
	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {}
}