/*
	Responsible for maintaining gameplay
	Displays photos or loss message if appropriate
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel implements ActionListener {
	
	private ImageIcon image;
	private boolean gameLost;
	private int score;
	private ImageIcon buffered;
	private Font normal, lost;
	private Timer timer;

	public Panel() {
		score = 0;
		image = new ImageIcon(getClass().getResource(Photo.getRandomPhoto()));
		normal = new Font("Serif", Font.PLAIN, 1);
		lost = new Font("Serif", Font.BOLD, 48);
		buffered = new ImageIcon(getClass().getResource(Photo.getLossPhoto()));
		timer = new Timer(1000, this);  // 1 second per image
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
		timer.start();
	}

	public void updateScore() {
		score++;
	}

	// Changes to next image
	public void setImage() {
		image = new ImageIcon(getClass().getResource(Photo.getRandomPhoto()));
		timer.restart();
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
		timer.stop();
		repaint();
	}

	public String getImage() {
		return image.toString();
	}

	public void actionPerformed(ActionEvent e) {
		setLost();  // Displays loss message when too much time passes on image
	}
}