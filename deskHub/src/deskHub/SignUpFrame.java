package deskHub;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.io.FileWriter;//ditooooooooooooooooo
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;//


public class SignUpFrame {

	private JFrame frame;
	private JTextField TF2;
	private JPasswordField PF2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpFrame window = new SignUpFrame();
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
	public SignUpFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 794, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		TF2 = new JTextField();
		TF2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TF2.setBackground(new Color(255, 128, 0));
		TF2.setBounds(210, 164, 222, 34);
		frame.getContentPane().add(TF2);
		TF2.setColumns(10);
		
		PF2 = new JPasswordField();
		PF2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		PF2.setBackground(new Color(255, 128, 0));
		PF2.setBounds(210, 208, 222, 34);
		frame.getContentPane().add(PF2);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(70, 164, 186, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password  :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(70, 208, 186, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(30, 30, 30));
		panel_3.setBounds(10, 271, 116, 57);
		frame.getContentPane().add(panel_3);
		
		JButton SignIn = new JButton("Sign Up");
		SignIn.setForeground(new Color(0, 0, 0));
		SignIn.setBackground(new Color(255, 128, 0));
		SignIn.setBounds(10, 10, 96, 37);
		panel_3.add(SignIn);
		SignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				 
				String username = TF2.getText();
			    String password = String.valueOf(PF2.getPassword());
			    
			    try (FileWriter fw = new FileWriter("AccountDatas.txt", true)) { // true = append mode
			        fw.write(username + "," + password + "\n"); // comma separates username/password
			       
			    } catch (IOException ex) {
			        ex.printStackTrace();
			    }
			        LogInFrame.accounts.put(username, password);

			        JOptionPane.showMessageDialog(null,"Account created");
			        frame.dispose();
			    }	       
		});
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(30, 30, 30));
		panel_3_1.setBounds(129, 271, 116, 57);
		frame.getContentPane().add(panel_3_1);
		
		JButton clearbtn2 = new JButton("Clear");
		clearbtn2.setForeground(new Color(0, 0, 0));
		clearbtn2.setBackground(new Color(255, 128, 0));
		clearbtn2.setBounds(10, 10, 96, 37);
		panel_3_1.add(clearbtn2);
		clearbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF2.setText("");
				PF2.setText("");	
			}
		});
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(new Color(30, 30, 30));
		panel_3_1_1.setBounds(249, 271, 116, 57);
		frame.getContentPane().add(panel_3_1_1);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBackground(new Color(30, 30, 30));
		panel_3_1_2.setBounds(369, 271, 116, 57);
		frame.getContentPane().add(panel_3_1_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(30, 30, 30));
		panel_4.setBounds(10, 10, 596, 66);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setForeground(Color.WHITE);
		panel_3_2_1.setBackground(new Color(255, 128, 0));
		panel_3_2_1.setBounds(128, 10, 107, 45);
		panel_4.add(panel_3_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hub");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_2_1.setBounds(10, 0, 89, 45);
		panel_3_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Desk");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_2.setBounds(23, 10, 115, 45);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setLayout(null);
		panel_3_1_3.setBackground(new Color(30, 30, 30));
		panel_3_1_3.setBounds(616, 10, 114, 66);
		frame.getContentPane().add(panel_3_1_3);
		
		JButton BackBTN1 = new JButton("Back");
		BackBTN1.setForeground(new Color(0, 0, 0));
		BackBTN1.setBackground(new Color(255, 128, 0));
		BackBTN1.setBounds(10, 35, 94, 21);
		panel_3_1_3.add(BackBTN1);
		
		JButton exitbtn2_1 = new JButton("Exit");
		exitbtn2_1.setForeground(new Color(0, 0, 0));
		exitbtn2_1.setBackground(new Color(255, 128, 0));
		exitbtn2_1.setBounds(10, 10, 94, 21);
		panel_3_1_3.add(exitbtn2_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(30, 30, 30));
		panel_3_2.setBounds(54, 86, 512, 45);
		frame.getContentPane().add(panel_3_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Sign");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(21, 4, 69, 35);
		panel_3_2.add(lblNewLabel_2_2);
		
		JPanel panel_3_2_1_1 = new JPanel();
		panel_3_2_1_1.setLayout(null);
		panel_3_2_1_1.setForeground(Color.WHITE);
		panel_3_2_1_1.setBackground(new Color(255, 128, 0));
		panel_3_2_1_1.setBounds(78, 4, 55, 35);
		panel_3_2.add(panel_3_2_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Up");
		lblNewLabel_2_1_1.setBounds(10, 0, 49, 33);
		panel_3_2_1_1.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(30, 30, 30));
		panel_4_1.setBounds(10, 338, 760, 66);
		frame.getContentPane().add(panel_4_1);
		exitbtn2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		BackBTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	}
}