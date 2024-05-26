package pkg2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Hello2 {


	private JFrame frame;
	private JTextField txtName;
	private JLabel lblShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hello2 window = new Hello2();
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
	public Hello2() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblName.setBounds(22, 34, 65, 34);
		frame.getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtName.setBounds(89, 34, 266, 29);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=txtName.getText();
				lblShow.setText(name + ",Welcome to BUP");
			}
		});
		btnShow.setBackground(UIManager.getColor("Button.background"));
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnShow.setBounds(159, 85, 100, 44);
		frame.getContentPane().add(btnShow);
		
		lblShow = new JLabel("");
		lblShow.setFont(new Font("Segoe UI", Font.BOLD, 23));
		lblShow.setBounds(10, 140, 414, 110);
		frame.getContentPane().add(lblShow);
	}
}