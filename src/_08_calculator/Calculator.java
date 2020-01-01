package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addB = new JButton("add");
	JButton subB = new JButton("subtract");
	JButton mulB = new JButton("multiply");
	JButton divB = new JButton("divide");
	JLabel ans = new JLabel();
	JTextField field1 = new JTextField(5);
	JTextField field2 = new JTextField(5);
	double input1;
	double input2;
public void run() {	
	frame.setSize(90,250);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(field1);
	panel.add(field2);
	panel.add(addB);
	panel.add(subB);
	panel.add(mulB);
	panel.add(divB);
	panel.add(ans);
	frame.add(panel);	
	addB.addActionListener(this);
	subB.addActionListener(this);
	mulB.addActionListener(this);
	divB.addActionListener(this);
	
//	field1.setLocation(200, 50);
//	field2.setLocation(400, 50);
//	addB.setLocation(100, 200);
//	subB.setLocation(200, 0);
//	mulB.setLocation(300, 200);
//	divB.setLocation(400, 200);
	frame.setVisible(true);
}

//public void add(input1, input2) {
//	System.out.println(input1 + input2);	
//}
//public void subtract(input1, input2 ) {
//	System.out.println(input1 - input2);	
//}
//public void multiply(input1, input2) {
//	System.out.println(input1 * input2);
//}
//public void divide(input1, input2) {
//	System.out.println(input1 / input2);
//}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	input1 = Double.parseDouble(field1.getText());
	input2 = Double.parseDouble(field2.getText());
	
	if(e.getSource() == addB) {
		ans.setText(String.valueOf(input1 + input2));
	}
	if(e.getSource()== subB) {
		ans.setText(String.valueOf(input1 - input2));
	}
	if(e.getSource()== mulB) {
		ans.setText(String.valueOf(input1*input2));
	}
	if(e.getSource()== divB) {
		ans.setText(String.valueOf(input1/input2));
	}
}}
