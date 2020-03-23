import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum, secondnum, result;
	String add, subtract, multiply, divide, equals, percentage, decimal, answers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 387, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 27));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(14, 6, 356, 75);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		Color blue = Color.decode("#4287f5");
		Color orange = Color.decode("#ffac40");
		btn1.setBackground(blue);
		btn1.setOpaque(true);
		btn1.setBorderPainted(false);
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn1.setBounds(14, 104, 80, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBackground(blue);
		btn2.setOpaque(true);
		btn2.setBorderPainted(false);
		btn2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn2.setBounds(106, 104, 80, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBackground(blue);
		btn3.setOpaque(true);
		btn3.setBorderPainted(false);
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn3.setBounds(198, 104, 80, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnPls = new JButton("+");
		btnPls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				add = "+";
			}
		});
		btnPls.setBackground(orange);
		btnPls.setOpaque(true);
		btnPls.setBorderPainted(false);
		btnPls.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnPls.setBounds(290, 104, 80, 50);
		frame.getContentPane().add(btnPls);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBackground(blue);
		btn4.setOpaque(true);
		btn4.setBorderPainted(false);
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn4.setBounds(14, 166, 80, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBackground(blue);
		btn7.setOpaque(true);
		btn7.setBorderPainted(false);
		btn7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn7.setBounds(14, 228, 80, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBackground(blue);
		btn0.setOpaque(true);
		btn0.setBorderPainted(false);
		btn0.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn0.setBounds(14, 290, 80, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setOpaque(true);
		btnClear.setBorderPainted(false);
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnClear.setBounds(14, 370, 172, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				
				if(add == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(subtract == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(multiply == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(divide == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(percentage == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setBackground(blue);
		btnEqual.setOpaque(true);
		btnEqual.setBorderPainted(false);
		btnEqual.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnEqual.setBounds(198, 370, 172, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBackground(blue);
		btn5.setOpaque(true);
		btn5.setBorderPainted(false);
		btn5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn5.setBounds(106, 166, 80, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBackground(blue);
		btn8.setOpaque(true);
		btn8.setBorderPainted(false);
		btn8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn8.setBounds(106, 228, 80, 50);
		frame.getContentPane().add(btn8);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				percentage = "%";
			}
		});
		btnPercent.setBackground(orange);
		btnPercent.setOpaque(true);
		btnPercent.setBorderPainted(false);
		btnPercent.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnPercent.setBounds(106, 290, 80, 50);
		frame.getContentPane().add(btnPercent);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBackground(blue);
		btn6.setOpaque(true);
		btn6.setBorderPainted(false);
		btn6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn6.setBounds(198, 166, 80, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBackground(blue);
		btn9.setOpaque(true);
		btn9.setBorderPainted(false);
		btn9.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btn9.setBounds(198, 228, 80, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				decimal = ".";
			}
		});
		btnDot.setBackground(orange);
		btnDot.setOpaque(true);
		btnDot.setBorderPainted(false);
		btnDot.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnDot.setBounds(198, 290, 80, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				subtract = "-";
			}
		});
		btnSub.setBackground(orange);
		btnSub.setOpaque(true);
		btnSub.setBorderPainted(false);
		btnSub.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnSub.setBounds(290, 166, 80, 50);
		frame.getContentPane().add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				multiply = "*";
			}
		});
		btnMult.setBackground(orange);
		btnMult.setOpaque(true);
		btnMult.setBorderPainted(false);
		btnMult.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnMult.setBounds(290, 228, 80, 50);
		frame.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				divide = "/";
			}
		});
		btnDiv.setBackground(orange);
		btnDiv.setOpaque(true);
		btnDiv.setBorderPainted(false);
		btnDiv.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnDiv.setBounds(290, 290, 80, 50);
		frame.getContentPane().add(btnDiv);
	}
}
