package _08_calculator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton addB = new JButton("add");
	static JButton subB = new JButton("subtract");
	static JButton mulB = new JButton("multiply");
	static JButton divB = new JButton("divide");
	static JTextField field1 = new JTextField();
	static JTextField field2 = new JTextField();
public static void main(String[] args) {	
	frame.setSize(500,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(field1);
	panel.add(field2);
	panel.add(addB);
	panel.add(subB);
	panel.add(mulB);
	panel.add(divB);
	frame.add(panel);
	field1.setLocation(200, 50);
	field2.setLocation(400, 50);
	addB.setLocation(100, 200);
	subB.setLocation(200, 0);
	mulB.setLocation(300, 200);
	divB.setLocation(400, 200);
	frame.setVisible(true);
}	

	public void add() {
	
}
public void subtract() {
	
}
public void multiply() {
	
}
public void divide() {
	
}

}
