package deskHub;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.Timer;


public class StopWatchFrame {

    public static JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	StopWatchFrame window = new StopWatchFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public StopWatchFrame() {
        initialize();
    }
    
  
    int	input = 0;
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setBounds(70, 280, 900, 370);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
     
        JLabel LabelOutPut = new JLabel("");
        LabelOutPut.setFont(new Font("Tahoma", Font.BOLD, 30));


        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(30, 30, 30));
        panel_1.setBounds(35, 10, 839, 71);
        frame.getContentPane().add(panel_1);

        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setLayout(null);
        panel_2_1_1.setBackground(new Color(30, 30, 30));
        panel_2_1_1.setBounds(319, 133, 268, 153);
        frame.getContentPane().add(panel_2_1_1);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 0));
        panel.setBounds(10, 10, 248, 133);
        panel_2_1_1.add(panel);
        panel.setLayout(null);
        
       
        LabelOutPut.setBounds(10, 10, 228, 113);
        panel.add(LabelOutPut);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(30, 30, 30));
        panel_2.setBounds(40, 296, 833, 64);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JButton btnNewButton = new JButton("Start");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 Timer timer;////////////////////////////////////////
        		  
        		//input = timeleft
        		
        		
              	  
            		
            	    timer = new Timer(1000, a -> {
            	        LabelOutPut.setText("" + ++input);
            	                   	    });
            	    timer.start();
            	}
            	
            });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBackground(new Color(255, 128, 0));
        btnNewButton.setBounds(366, 10, 85, 21);
        panel_2.add(btnNewButton);
        
        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBackground(new Color(30, 30, 30));
        panel_1_1_1.setBounds(148, 84, 618, 39);
        frame.getContentPane().add(panel_1_1_1);
    }
}
