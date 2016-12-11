import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
	
	ImageIcon image;
	private JLabel label;

	public Panel() {
		image = new ImageIcon(Photo.getRandomPhoto());
		label = new JLabel(image, JLabel.CENTER);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image.getImage(), 0, 0, null);
	}

	public void setImage() {
		image = new ImageIcon(Photo.getRandomPhoto());
		repaint();
	}
}