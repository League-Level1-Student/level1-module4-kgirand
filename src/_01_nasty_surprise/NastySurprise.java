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
	JLabel label= new JLabel();
	JFrame frame = new JFrame();
	public void run() {
	//URL url = new URL("https://www.digitalspy.com/movies/a28866233/it-chapter-2-director-potential-pennywise-movie/");
	//ImageIcon icon = new ImageIcon(url);
	//JLabel imageLabel = new JLabel(icon);
	JPanel panel = new JPanel();
	button1 = new JButton("Trick");
	button2 = new JButton("Treat");
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(label);
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
	        label.setIcon(icon);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
	showPictureFromTheInternet("https://hips.hearstapps.com/digitalspyuk.cdnds.net/17/38/1505731747-pennywise-teeth-it-movie.jpg?crop=0.563xw:1.00xh;0.136xw,0&resize=768:*");
	}
	else if(e.getSource()==button2) {
	showPictureFromTheInternet("https://hips.hearstapps.com/ghk.h-cdn.co/assets/18/03/3200x1600/landscape-1516402924-labrador-retriever-puppies.jpg?resize=980:*");	
	}
}
}
