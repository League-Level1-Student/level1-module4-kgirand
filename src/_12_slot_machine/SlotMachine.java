package _12_slot_machine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame;
JPanel panel;
JButton button;
Icon orange;
Icon seven;
Icon cherry;
JLabel reel1 = new JLabel();
JLabel reel2 = new JLabel();
JLabel reel3 = new JLabel();
Random randy = new Random();
int one;
int two;
int three;
SlotMachine(){
	orange = createLabelImage("orange.jpg");
	seven = createLabelImage("seven.jpg");
	cherry = createLabelImage("cherry.jpg");
}
public void run() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	panel.add(reel1);
	reel1.setLocation(200, 150);
	panel.add(reel2);
	reel2.setLocation(400, 150);
	panel.add(reel3);
	reel3.setLocation(600, 150);
	JButton button = new JButton("Spin");
	button.addActionListener(this);
	frame.add(panel);
	panel.add(button);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	button.setLocation(250,150);
	frame.setSize(800,300);

}
public void spin() {
	int one = randy.nextInt(3);
	if(one == 0) {
		reel1.setIcon(orange);
	}
	else if(one == 1) {
		reel1.setIcon(cherry);
	}
	else if(one == 2) {
		reel1.setIcon(seven);
	}
	int two = randy.nextInt(3);
	if(two == 0) {
		reel2.setIcon(orange);
	}
	else if(two == 1) {
		reel2.setIcon(cherry);
	}
	else if(two == 2) {
		reel2.setIcon(seven);
	}
	int three = randy.nextInt(3);
	if(three == 0) {
		reel3.setIcon(orange);
	}
	else if(three == 1) {
		reel3.setIcon(cherry);
	}
	else if(three == 2) {
		reel3.setIcon(seven);
	}
}
@Override
public void actionPerformed(ActionEvent e) {
spin();
	
}
private Icon createLabelImage(String fileName){
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return (Icon) new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return icon;
}
}
