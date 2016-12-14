import java.util.ArrayList;
import java.util.Random;

public class Photo {
	private static Random random = new Random();
	
	private static String[] photos = {"llama1.jpg", "llama2.jpg", "llama3.jpg",
	"llama4.jpg", "llama5.jpg", "llama6.jpg", "duck1.jpg", "duck2.jpg", "duck3.jpg",
	"duck4.jpg", "duck5.jpg", "duck6.jpg"};

	public static String getLossPhoto() {
		return "Photos/loss.jpg";
	}

	public static String getRandomPhoto() {
		return "Photos/" + photos[random.nextInt(photos.length)];
	}
}