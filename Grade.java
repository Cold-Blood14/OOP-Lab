package problem1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Grade {

	private JFrame frame;
	private JTextField textName;
	private JTextField textID;
	private JTextField textMarks;
	private JTextField textFieldShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grade window = new Grade();
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
	public Grade() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(22, 11, 79, 14);
		frame.getContentPane().add(lblName);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textName.setBounds(111, 8, 313, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblID.setBounds(22, 39, 79, 14);
		frame.getContentPane().add(lblID);
		
		textID = new JTextField();
		textID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textID.setColumns(10);
		textID.setBounds(111, 36, 313, 20);
		frame.getContentPane().add(textID);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMarks.setBounds(22, 67, 79, 17);
		frame.getContentPane().add(lblMarks);
		
		textMarks = new JTextField();
		textMarks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMarks.setColumns(10);
		textMarks.setBounds(111, 64, 313, 20);
		frame.getContentPane().add(textMarks);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String result="";
			int x=Integer.parseInt(textMarks.getText());
			if(x>=80) result="A+";
			else if(x>=75 && x<=79) result="A";
			else if(x>=70 && x<=74) result="A-";
			else if(x>=65 && x<=69) result="B+";
			else if(x>=60 && x<=64) result="B";
			else if(x>=55 && x<=59) result="B-";
			else if(x>=50 && x<=54) result="C+";
			else if(x>=45 && x<=49) result="C";
			else if(x>=40 && x<=44) result="D";
			else result="F";
			textFieldShow.setText(textName.getText()+" your ID:" + textID.getText() +"; you achieved "+ result); 
		}
		});
		btnShow.setBounds(41, 113, 99, 29);
		frame.getContentPane().add(btnShow);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldShow.setText("");
				textName.setText("");
				textID.setText("");
				textMarks.setText("");
			}
		});
		btnReset.setBounds(262, 114, 97, 28);
		frame.getContentPane().add(btnReset);
		
		textFieldShow = new JTextField();
		textFieldShow.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldShow.setBounds(22, 177, 402, 45);
		frame.getContentPane().add(textFieldShow);
		textFieldShow.setColumns(10);
	}
}
