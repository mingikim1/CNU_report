package report;

import java.awt.*;
import javax.swing.*;

public class Register extends JFrame {
	
	// panel 4개, button 2개
	JPanel panel1, panel2, panel3, panel4;
	JLabel label1;
	JButton button1, button2;
	
	public Register() {
		setSize(300, 250);
		
		//setLayout
		setLayout(new FlowLayout());
		
		//panel1
		panel1 = new JPanel();
		label1 = new JLabel("회원 등록하기");
		Font labelFont = label1.getFont();
		label1.setFont(new Font(labelFont.getName(), Font.PLAIN, 18));
		panel1.add(label1);
		
		// panel2
		panel2 = new JPanel(new GridLayout(2, 2));
		panel2.add(new JLabel("이름"));
		panel2.add(new JTextField(10));
		panel2.add(new JLabel("패스워드"));
		panel2.add(new JPasswordField(10));
		
		// panel3
		panel3 = new JPanel(new GridLayout(2, 2));
		panel3.add(new JLabel("이메일 주소"));
		panel3.add(new JTextField(10));
		panel3.add(new JLabel("전화번호"));
		panel3.add(new JTextField(10));
		
		//button & panel4
		button1 = new JButton("등록하기");
		button2 = new JButton("취소");
		
		panel4 = new JPanel();
		panel4.add(button1);
		panel4.add(button2);
		
		// add(panel)
		add(panel1);
		add(panel2);	
		add(panel3);
		add(panel4);
		
		//setting
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		Register r = new Register();
	}

}
