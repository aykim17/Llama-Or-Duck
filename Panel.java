import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
	
	private ImageIcon image;
	private boolean gameLost;
	private int score;
	private ImageIcon buffered;
	private Font normal, lost;

	public Panel() {
		score = 0;
		image = new ImageIcon(getClass().getResource(Photo.getRandomPhoto()));
		normal = new Font("Serif", Font.PLAIN, 1);
		lost = new Font("Serif", Font.BOLD, 48);
		buffered = new ImageIcon(getClass().getResource(Photo.getLossPhoto()));
		gameLost = false;
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image.getImage(), 0, 0, null);
		g.setFont(normal);

		if (gameLost) {
			g.setColor(Color.RED);
			g.setFont(lost);  // Make font bigger
		}
		g.drawString("You Lose. Score: " + score, 10, getHeight()/ 2);
	}

	public void updateScore() {
		score++;
	}

	// Changes to next image
	public void setImage() {
		image = new ImageIcon(getClass().getResource(Photo.getRandomPhoto()));
		repaint();
	}

	public void reset() {
		score = 0;
		gameLost = false;
		setImage();
	}

	// Show lost message
	public void setLost() {
		image = buffered;
		gameLost = true;
		repaint();
	}

	public String getImage() {
		return image.toString();
	}
}