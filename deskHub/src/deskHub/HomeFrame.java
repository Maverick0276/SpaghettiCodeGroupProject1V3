package deskHub;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.SwingConstants;//for image ilagay sa loob nang label

public class HomeFrame {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomeFrame window = new HomeFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public HomeFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setBounds(0, 0, 1920, 830);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(30, 30, 30));
        panel_1.setBounds(346, 22, 1076, 92);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JComboBox comboBox = new JComboBox();
       
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Light", "Dark"}));
        comboBox.setBackground(new Color(255, 128, 0));
        comboBox.setBounds(1037, 10, 29, 21);
        panel_1.add(comboBox);
        
        comboBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String selected = (String) comboBox.getSelectedItem();
        		 if ("Light".equals(selected)) {
        	            frame.getContentPane().setBackground(Color.WHITE);
        	        } else if ("Dark".equals(selected)) {
        	            frame.getContentPane().setBackground(Color.BLACK);
        	        }
          	}
        });
        

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 0));
        panel.setBounds(511, 10, 254, 74);
        panel_1.add(panel);
        panel.setLayout(null);
        
        JLabel lblPage = new JLabel("Page");
        lblPage.setForeground(new Color(0, 0, 0));
        lblPage.setFont(new Font("Tahoma", Font.BOLD, 50));
        lblPage.setBounds(44, 0, 158, 74);
        panel.add(lblPage);
        
        JLabel lblHome = new JLabel("Home");
        lblHome.setForeground(Color.WHITE);
        lblHome.setFont(new Font("Tahoma", Font.BOLD, 50));
        lblHome.setBounds(360, 10, 158, 74);
        panel_1.add(lblHome);

        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBackground(new Color(30, 30, 30));
        panel_3_1.setBounds(1432, 22, 98, 92);
        frame.getContentPane().add(panel_3_1);
        panel_3_1.setLayout(null);

        JButton btnLogOut = new JButton("LogOut");
        btnLogOut.setBounds(10, 42, 78, 21);
        panel_3_1.add(btnLogOut);

        JButton btnNewButton = new JButton("Sign In");
        btnNewButton.setBounds(10, 11, 78, 21);
        panel_3_1.add(btnNewButton);

        JPanel panel_3_1_1_2 = new JPanel();
        panel_3_1_1_2.setBackground(new Color(30, 30, 30));
        panel_3_1_1_2.setBounds(10, 22, 335, 92);
        frame.getContentPane().add(panel_3_1_1_2);
        panel_3_1_1_2.setLayout(null);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(148, 26, 77, 37);
        panel_3_1_1_2.add(panel_2);
        panel_2.setForeground(new Color(255, 128, 0));
        panel_2.setBackground(new Color(255, 128, 0));
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Hub");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(10, 0, 62, 37);
        panel_2.add(lblNewLabel_1);
        
        JLabel lblNewLabel = new JLabel("Desk");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel.setBounds(77, 26, 61, 37);
        panel_3_1_1_2.add(lblNewLabel);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBackground(new Color(30, 30, 30));
        panel_1_1.setBounds(32, 119, 1349, 63);
        frame.getContentPane().add(panel_1_1);

        JButton btnNewButton_1 = new JButton("Home");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	UnitCalculator.frame.dispose();
        	ArithmeticCalculator.frame.dispose();
        	}
        });
        btnNewButton_1.setBounds(22, 10, 130, 43);
        panel_1_1.add(btnNewButton_1);
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(30, 30, 30));

        JButton btnNewButton_1_1 = new JButton("Unit Calculator");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new UnitCalculator();
        		ArithmeticCalculator.frame.dispose();
        	}
        });
        btnNewButton_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1.setBackground(new Color(30, 30, 30));
        btnNewButton_1_1.setBounds(173, 10, 130, 43);
        panel_1_1.add(btnNewButton_1_1);

        JButton btnNewButton_1_2 = new JButton("Arithmetic Calculator");
        btnNewButton_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new ArithmeticCalculator();
        		UnitCalculator.frame.dispose();
        		TimerFrame.frame.dispose();
        		StopWatchFrame.frame.dispose();
        		
        	}
        });
        btnNewButton_1_2.setForeground(Color.WHITE);
        btnNewButton_1_2.setBackground(new Color(30, 30, 30));
        btnNewButton_1_2.setBounds(326, 10, 130, 43);
        panel_1_1.add(btnNewButton_1_2);

        JButton btnNewButton_1_3 = new JButton("TicTactoe");
        btnNewButton_1_3.setForeground(Color.WHITE);
        btnNewButton_1_3.setBackground(new Color(30, 30, 30));
        btnNewButton_1_3.setBounds(638, 10, 130, 43);
        panel_1_1.add(btnNewButton_1_3);

        JButton btnNewButton_1_4 = new JButton("Calendar");
        btnNewButton_1_4.setForeground(Color.WHITE);
        btnNewButton_1_4.setBackground(new Color(30, 30, 30));
        btnNewButton_1_4.setBounds(796, 10, 130, 43);
        panel_1_1.add(btnNewButton_1_4);

        JButton btnNewButton_1_5 = new JButton("Stop Watch");
        btnNewButton_1_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new StopWatchFrame();
        	}
        });
        btnNewButton_1_5.setForeground(Color.WHITE);
        btnNewButton_1_5.setBackground(new Color(30, 30, 30));
        btnNewButton_1_5.setBounds(955, 10, 130, 43);
        panel_1_1.add(btnNewButton_1_5);

        JButton btnNewButton_1_6 = new JButton("Timer");
        btnNewButton_1_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new TimerFrame();
        		UnitCalculator.frame.dispose();
        		ArithmeticCalculator.frame.dispose();
        		StopWatchFrame.frame.dispose();
        	}
        });
        btnNewButton_1_6.setForeground(Color.WHITE);
        btnNewButton_1_6.setBackground(new Color(30, 30, 30));
        btnNewButton_1_6.setBounds(1115, 10, 130, 43);
        panel_1_1.add(btnNewButton_1_6);
        
        JButton btnNewButton_1_3_1 = new JButton("BMI calculator");
        btnNewButton_1_3_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new BmiCalculator();
        		
        	}
        });
        btnNewButton_1_3_1.setForeground(Color.WHITE);
        btnNewButton_1_3_1.setBackground(new Color(30, 30, 30));
        btnNewButton_1_3_1.setBounds(480, 10, 130, 43);
        panel_1_1.add(btnNewButton_1_3_1);

        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBackground(new Color(30, 30, 30));
        panel_1_1_1.setBounds(42, 184, 942, 46);
        frame.getContentPane().add(panel_1_1_1);

        JPanel panel_1_1_2 = new JPanel();
        panel_1_1_2.setLayout(null);
        panel_1_1_2.setBackground(new Color(30, 30, 30));
        panel_1_1_2.setBounds(20, 685, 1497, 85);
        frame.getContentPane().add(panel_1_1_2);
        
        JLabel EpsteinLabel = new JLabel("");
        EpsteinLabel.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel.setBounds(920, 22, 153, 63);
        panel_1_1_2.add(EpsteinLabel);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBounds(920, 0, 567, 22);
        panel_1_1_2.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("are you below 18? \r\n  Click here for free robux!! In Epstien's island unlimited robux free!!!");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2.setBounds(10, 0, 547, 23);
        panel_3.add(lblNewLabel_2);
        
        JLabel EpsteinLabel_1 = new JLabel("");
        EpsteinLabel_1.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel_1.setBounds(1027, 22, 153, 63);
        panel_1_1_2.add(EpsteinLabel_1);
        
        JLabel EpsteinLabel_2 = new JLabel("");
        EpsteinLabel_2.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel_2.setBounds(1130, 22, 153, 63);
        panel_1_1_2.add(EpsteinLabel_2);
        
        JLabel EpsteinLabel_3 = new JLabel("");
        EpsteinLabel_3.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel_3.setBounds(1353, 22, 153, 63);
        panel_1_1_2.add(EpsteinLabel_3);
        
        JLabel EpsteinLabel_4 = new JLabel("");
        EpsteinLabel_4.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel_4.setBounds(1307, 22, 153, 63);
        panel_1_1_2.add(EpsteinLabel_4);
        
        JLabel EpsteinLabel_5 = new JLabel("");
        EpsteinLabel_5.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel_5.setBounds(1317, 34, 129, 63);
        panel_1_1_2.add(EpsteinLabel_5);
        
        JLabel EpsteinLabel_6 = new JLabel("");
        EpsteinLabel_6.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel_6.setBounds(1190, 22, 153, 63);
        panel_1_1_2.add(EpsteinLabel_6);
        
        JLabel EpsteinLabel_7 = new JLabel("");
        EpsteinLabel_7.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\_123863952_little2.jpg"));
        EpsteinLabel_7.setBounds(1353, 22, 153, 63);
        panel_1_1_2.add(EpsteinLabel_7);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBounds(398, 0, 512, 85);
        panel_1_1_2.add(panel_4);
        panel_4.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("want a break from the ads? click here to learn more.....");
        lblNewLabel_3.setBounds(10, 10, 332, 13);
        panel_4.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Daga.jpg"));
        lblNewLabel_4.setBounds(10, 22, 52, 63);
        panel_1_1_2.add(lblNewLabel_4);
        
        JLabel lblNewLabel_4_1 = new JLabel("");
        lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Daga.jpg"));
        lblNewLabel_4_1.setBounds(63, 22, 52, 63);
        panel_1_1_2.add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_4_2 = new JLabel("");
        lblNewLabel_4_2.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Daga.jpg"));
        lblNewLabel_4_2.setBounds(113, 22, 52, 63);
        panel_1_1_2.add(lblNewLabel_4_2);
        
        JLabel lblNewLabel_4_3 = new JLabel("");
        lblNewLabel_4_3.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Daga.jpg"));
        lblNewLabel_4_3.setBounds(164, 22, 52, 63);
        panel_1_1_2.add(lblNewLabel_4_3);
        
        JLabel lblNewLabel_4_4 = new JLabel("");
        lblNewLabel_4_4.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Daga.jpg"));
        lblNewLabel_4_4.setBounds(214, 22, 52, 63);
        panel_1_1_2.add(lblNewLabel_4_4);
        
        JLabel lblNewLabel_4_5 = new JLabel("");
        lblNewLabel_4_5.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Daga.jpg"));
        lblNewLabel_4_5.setBounds(262, 22, 52, 63);
        panel_1_1_2.add(lblNewLabel_4_5);
        
        JLabel lblNewLabel_4_6 = new JLabel("");
        lblNewLabel_4_6.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Daga.jpg"));
        lblNewLabel_4_6.setBounds(311, 22, 52, 63);
        panel_1_1_2.add(lblNewLabel_4_6);
        
        JPanel panel_3_2 = new JPanel();
        panel_3_2.setLayout(null);
        panel_3_2.setBounds(10, 0, 354, 22);
        panel_1_1_2.add(panel_3_2);
        
        JLabel lblNewLabel_2_1 = new JLabel("Valentines is near click here to date cute lonely twinks!!!!");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_1.setBounds(10, 0, 334, 23);
        panel_3_2.add(lblNewLabel_2_1);

        JPanel panel_1_1_3 = new JPanel();
        panel_1_1_3.setLayout(null);
        panel_1_1_3.setBackground(new Color(30, 30, 30));
        panel_1_1_3.setBounds(20, 629, 964, 46);
        frame.getContentPane().add(panel_1_1_3);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(1523, 0, 17, 793);
        frame.getContentPane().add(scrollBar);
        
        JLabel GestopaLabel = new JLabel("New label");
        GestopaLabel.setIcon(new ImageIcon("C:\\Users\\pyfher\\Pictures\\Screenshots\\Screenshot 2026-02-08 170214.png"));
        GestopaLabel.setBounds(10, 240, 1491, 476);
        frame.getContentPane().add(GestopaLabel);
        
        


        frame.setVisible(true);
    }
}