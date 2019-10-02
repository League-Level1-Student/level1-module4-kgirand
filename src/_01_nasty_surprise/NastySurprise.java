package _01_nasty_surprise;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NastySurprise {
private void showPic(String imageUrl) {
	try {
	URL url = new URL(imageUrl);
	ImageIcon icon = new ImageIcon(url);
	JLabel imageLabel = new JLabel(icon);
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Trick");
	JButton button2 = new JButton("Treat");
	frame.add(imageLabel);
	frame.setVisible(true);
	frame.pack();
	}
	catch(MalformedURLException e) {
		e.printStackTrace();
}
}
public static void main(String[] args) {
showPic("https://www.digitalspy.com/movies/a28866233/it-chapter-2-director-potential-pennywise-movie/");
}
}
