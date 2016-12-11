import javax.swing.*;
import java.awt.Image;

public class MainGUI extends JFrame {

	static Panel panel;

	public MainGUI() {  // Basic GUI display
		setTitle("Llama or Duck");
		setSize(500, 500);
		setResizable(false);
		panel = new Panel();
		add(panel);
		addKeyListener(new KeyHandler());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainGUI();
	}
}