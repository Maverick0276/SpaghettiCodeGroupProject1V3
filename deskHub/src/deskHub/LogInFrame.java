package deskHub;

import java.awt.EventQueue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;//file reader stuff



import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;

public class LogInFrame {
	
	
	
	


	private JFrame frame;
	private JTextField TF1;
	private JPasswordField PF1;
	
	public static Map<String,String> accounts = new HashMap<>();
	public static void loadAccounts() {
	    try (BufferedReader br = new BufferedReader(new FileReader("AccountDatas.txt"))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] parts = line.split(","); // pang split para mabasa ng map
	            if (parts.length == 2) {//protection kase pag isa lang yung part mag cracrash
	                accounts.put(parts[0], parts[1]);
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("Account file not found yet.");
	    }
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		loadAccounts();

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInFrame window = new LogInFrame();
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
	public LogInFrame() {
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
		
		TF1 = new JTextField();
		TF1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TF1.setBackground(new Color(255, 128, 0));
		TF1.setBounds(210, 164, 222, 34);
		frame.getContentPane().add(TF1);
		TF1.setColumns(10);
		
		PF1 = new JPasswordField();
		PF1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		PF1.setBackground(new Color(255, 128, 0));
		PF1.setBounds(210, 208, 222, 34);
		frame.getContentPane().add(PF1);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(70, 164, 186, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password  :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(70, 208, 186, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 30, 30));
		panel.setBounds(10, 271, 116, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton loginbtn = new JButton("Log In");
		loginbtn.setBounds(10, 10, 96, 34);
		panel.add(loginbtn);
		loginbtn.setForeground(new Color(0, 0, 0));
		loginbtn.setBackground(new Color(255, 128, 0));
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
			
				String username = TF1.getText();
				String password = String.valueOf(PF1.getPassword());
				
				if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
				    JOptionPane.showMessageDialog(null,"Log In Successful");
				    new HomeFrame();
				    frame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Log In Failed Invalid Username or Password");
				}

				
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 30, 30));
		panel_1.setLayout(null);
		panel_1.setBounds(616, 10, 116, 66);
		frame.getContentPane().add(panel_1);
		
		JButton SignUpBTN = new JButton("Sign Up");
		SignUpBTN.setForeground(new Color(0, 0, 0));
		SignUpBTN.setBackground(new Color(255, 128, 0));
		SignUpBTN.setBounds(10, 10, 96, 21);
		panel_1.add(SignUpBTN);
		
		JButton ExitBTN1 = new JButton("Exit");
		ExitBTN1.setBounds(10, 36, 96, 21);
		panel_1.add(ExitBTN1);
		ExitBTN1.setForeground(new Color(0, 0, 0));
		ExitBTN1.setBackground(new Color(255, 128, 0));
		ExitBTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		SignUpBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(30, 30, 30));
		panel_2.setLayout(null);
		panel_2.setBounds(129, 271, 116, 57);
		frame.getContentPane().add(panel_2);
		
		JButton clearbtn = new JButton("Clear");
		clearbtn.setForeground(new Color(0, 0, 0));
		clearbtn.setBackground(new Color(255, 128, 0));
		clearbtn.setBounds(10, 10, 96, 37);
		panel_2.add(clearbtn);
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF1.setText("");
				PF1.setText("");	
			}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(30, 30, 30));
		panel_4.setBounds(10, 10, 596, 66);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setForeground(new Color(255, 255, 255));
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBackground(new Color(255, 128, 0));
		panel_3_2_1.setBounds(128, 10, 107, 45);
		panel_4.add(panel_3_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Hub");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_2_1.setBounds(10, 0, 89, 45);
		panel_3_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Desk");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_2.setBounds(23, 10, 115, 45);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(30, 30, 30));
		panel_4_1.setBounds(10, 338, 760, 66);
		frame.getContentPane().add(panel_4_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(30, 30, 30));
		panel_3.setBounds(247, 271, 114, 57);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(30, 30, 30));
		panel_3_1.setBounds(363, 271, 114, 57);
		frame.getContentPane().add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(30, 30, 30));
		panel_3_2.setBounds(57, 86, 512, 45);
		frame.getContentPane().add(panel_3_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Log");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(21, 4, 69, 35);
		panel_3_2.add(lblNewLabel_2_2);
		
		JPanel panel_3_2_1_1 = new JPanel();
		panel_3_2_1_1.setLayout(null);
		panel_3_2_1_1.setForeground(Color.WHITE);
		panel_3_2_1_1.setBackground(new Color(255, 128, 0));
		panel_3_2_1_1.setBounds(68, 4, 55, 35);
		panel_3_2.add(panel_3_2_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("In");
		lblNewLabel_2_1_1.setBounds(10, 0, 68, 35);
		panel_3_2_1_1.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBackground(new Color(30, 30, 30));
		panel_4_1_1.setBounds(783, 338, 726, 66);
		frame.getContentPane().add(panel_4_1_1);
		
		JPanel panel_4_1_1_1 = new JPanel();
		panel_4_1_1_1.setLayout(null);
		panel_4_1_1_1.setBackground(new Color(30, 30, 30));
		panel_4_1_1_1.setBounds(783, 10, 726, 66);
		frame.getContentPane().add(panel_4_1_1_1);
		
		JPanel panel_4_1_2 = new JPanel();
		panel_4_1_2.setLayout(null);
		panel_4_1_2.setBackground(new Color(30, 30, 30));
		panel_4_1_2.setBounds(10, 664, 1499, 119);
		frame.getContentPane().add(panel_4_1_2);
		
		JPanel panel_4_1_3 = new JPanel();
		panel_4_1_3.setLayout(null);
		panel_4_1_3.setBackground(new Color(30, 30, 30));
		panel_4_1_3.setBounds(10, 573, 1398, 66);
		frame.getContentPane().add(panel_4_1_3);
	}
}