package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
char currentLetter;
JFrame frame = new JFrame();
JLabel label= new JLabel();
Date timeAtStart;
int i = 0;
TypingTutor(){
timeAtStart = new Date(0);
label.setText(Character.toString(generateRandomLetter()));
frame.add(label);
frame.setSize(100,100);
label.setFont(label.getFont().deriveFont(28));
label.setHorizontalAlignment(label.CENTER);
frame.addKeyListener(this);
label.setVisible(true);
label.setOpaque(true);
frame.setVisible(true);
}



char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26 + 'a'));
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	if(e.getKeyChar()==label.getText().charAt(0)) {
	System.out.println("correct");
	label.setBackground(Color.GREEN);
	i++;
	}
	
	else {
	System.out.println("wrong");
	label.setBackground(Color.RED);
	}
	if(i>15) {
		showTypingSpeed(i);
	}
	
}

private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
    Date timeAtEnd = new Date();
    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
    long gameInSeconds = (gameDuration / 1000) % 60;
    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
    int charactersPerMinute = (int) (charactersPerSecond * 60);
    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
} 


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub

}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	label.setText(Character.toString(generateRandomLetter()));
	
}
}
