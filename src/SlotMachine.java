import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SlotMachine {
JFrame frame;
JPanel panel;
JButton button;
public void run() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin");
	frame.add(panel);
	panel.add(button);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	button.setLocation(250,150);
	frame.setSize(500,300);
}
}
