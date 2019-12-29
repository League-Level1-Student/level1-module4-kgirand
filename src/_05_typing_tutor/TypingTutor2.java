package _05_typing_tutor;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor2 {
char currentLetter;
public static void main(String[] args) {
JFrame frame = new JFrame("Type or Die");
frame.setVisible(true);
JLabel label = new JLabel();
JPanel panel = new JPanel();
label.setText("" + generateRandomLetter());
label.setFont(label.getFont().deriveFont(28));
label.setHorizontalAlignment(label.CENTER);
}

static char generateRandomLetter() {
	Random r = new Random();
	return(char)(r.nextInt(26)+ 'a');
}
}
