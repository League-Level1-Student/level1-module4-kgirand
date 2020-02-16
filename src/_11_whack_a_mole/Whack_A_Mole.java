package _11_whack_a_mole;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Whack_A_Mole implements ActionListener {
public void run() {
drawButtons(randy.nextInt(24));	

}
JFrame frame;
JPanel panel;
int tally;
Random randy = new Random();
Date timeAtStart = new Date();
public void drawButtons(int mole) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	for(int i = 0; i<24; i++) {
		JButton button = new JButton();
		if(i == mole) {
			button.setText("mole!");
		}
		button.addActionListener(this);
		panel.add(button);
	}
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "You took "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " seconds per mole.");
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton button = (JButton) e.getSource();
	if(button.getText().equals("mole!")){
	tally ++;
	playSound("creepy-noise.wav");
	if(tally == 10) {
		endGame(timeAtStart, tally);
	}
	}
	else {
		speak("You missed.");
	}
	drawButtons(randy.nextInt(24));
}
}
