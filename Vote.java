package pkg2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vote {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAge;
	private JLabel lblShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vote window = new Vote();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Vote() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblName.setBounds(10, 11, 71, 29);
		frame.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblAge.setBounds(10, 51, 71, 29);
		frame.getContentPane().add(lblAge);
		
		JButton btnVerify = new JButton("Verify");
		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				int age = Integer.parseInt(txtAge.getText());
				if(age>=18) lblShow.setText(name + ", You are eligible");
				else lblShow.setText(name + ", You are not eligible");
		}
		});
		btnVerify.setBackground(UIManager.getColor("Button.background"));
		btnVerify.setFont(new Font("Rockwell", Font.PLAIN, 25));
		btnVerify.setBounds(114, 105, 126, 49);
		frame.getContentPane().add(btnVerify);
		
		lblShow = new JLabel("");
		lblShow.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblShow.setBounds(10, 173, 414, 77);
		frame.getContentPane().add(lblShow);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtName.setBounds(114, 11, 310, 29);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtAge.setBounds(114, 51, 310, 29);
		frame.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
			}
		});
		btnReset.setFont(new Font("Rockwell", Font.PLAIN, 25));
		btnReset.setBackground(UIManager.getColor("Button.background"));
		btnReset.setBounds(256, 105, 126, 49);
		frame.getContentPane().add(btnReset);
	}

}
