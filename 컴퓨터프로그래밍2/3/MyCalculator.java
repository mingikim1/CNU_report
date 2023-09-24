package report;

import java.awt.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class MyCalculator extends JFrame {
	
	JPanel panel1, panel2, panel3;
	JButton[] buttons;
	String[] labels = {"7", "8", "9", "/",
						"4", "5", "6", "*",
						"1", "2", "3", "-",
						"0", "back", "=", "+"};
	
	
	public MyCalculator() {
		setTitle("My Calculator");
		setSize(280,250);
		setLayout(new FlowLayout());
		
		// panel1
		panel1 = new JPanel();
		panel1.add(new JTextField(20));
		
		// panel2
		panel2 = new JPanel(new GridLayout(1, 4, 3, 3));
		panel2.add(new JButton("C"));
		for (int i = 0 ; i < 3 ; i++) {
			panel2.add(new JLabel("                 "));
		}
		panel2.setBorder(BorderFactory.createEmptyBorder(3, 3, 0, 3));
		
		// panel3
		panel3 = new JPanel(new GridLayout(4, 4, 3, 3));
		
		buttons = new JButton[16];
		int index = 0;
		for (int rows = 0 ; rows < 4 ; rows++) {
			for (int cols = 0 ; cols < 4 ; cols++) {
				buttons[index] = new JButton(labels[index]);
				panel3.add(buttons[index]);
				index++;
			}
		}

		add(panel1);
		add(panel2);
		add(panel3);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
	}

}
