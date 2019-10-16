package _01_nasty_surprise;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton button1;
	JButton button2;
	public void run() {
	//URL url = new URL("https://www.digitalspy.com/movies/a28866233/it-chapter-2-director-potential-pennywise-movie/");
	//ImageIcon icon = new ImageIcon(url);
	//JLabel imageLabel = new JLabel(icon);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	button1 = new JButton("Trick");
	button2 = new JButton("Treat");
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
	//frame.add(imageLabel);
	frame.setVisible(true);
	frame.pack();
	
}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
	showPictureFromTheInternet("https://www.digitalspy.com/tv/ustv/a838049/it-movie-bill-skarsgard-james-corden-pennywise/");
	}
	else if(e.getSource()==button2) {
	showPictureFromTheInternet("https://www.goodhousekeeping.com/life/pets/g5053/unique-dog-names/");	
	}
}
}
