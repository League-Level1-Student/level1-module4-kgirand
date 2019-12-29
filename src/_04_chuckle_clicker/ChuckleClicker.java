package _04_chuckle_clicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
JButton button1;
JButton button2;
public static void main(String[] args) {
	ChuckleClicker CC = new ChuckleClicker();
	CC.makeButtons();	
}
public void makeButtons () {
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();
frame.add(panel);
button1 = new JButton("joke");
button2 = new JButton("punchline");
panel.add(button1);
panel.add(button2);

button1.addActionListener(this);
button2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == button1) {
		JOptionPane.showMessageDialog(null, "What did the fish say when he ran into the wall?");
	}
	if(buttonPressed == button2) {
		JOptionPane.showMessageDialog(null, "Dam");
	}
}

}
