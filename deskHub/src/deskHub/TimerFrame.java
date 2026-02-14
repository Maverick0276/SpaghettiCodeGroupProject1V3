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


public class TimerFrame {

    public static JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	TimerFrame window = new TimerFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TimerFrame() {
        initialize();
    }
    
    Timer timer;////////////////////////////////////////
    int input;
//input = timeleft

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
        
        JFormattedTextField T1 = new JFormattedTextField();
        T1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		input = Integer.parseInt(T1.getText());
        	  
        		if (timer != null) timer.stop();//if the Timer timer is not null yet 
        	                                   //it stops the Timer timer para maistop yung timer pag nag set ulit nang bagong timer
        	    timer = new Timer(1000, a -> {
        	        LabelOutPut.setText("" + --input);
        	        if (input <= 0) {
        	            timer.stop();
        	            LabelOutPut.setText("Time's Up!");
        	        }
        	    });
        	    timer.start();
        	}
        	
        });
        T1.setBackground(new Color(255, 128, 0));
        T1.setBounds(319, 133, 268, 19);
        frame.getContentPane().add(T1);


        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(30, 30, 30));
        panel_1.setBounds(35, 10, 839, 71);
        frame.getContentPane().add(panel_1);

        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setLayout(null);
        panel_2_1_1.setBackground(new Color(30, 30, 30));
        panel_2_1_1.setBounds(319, 153, 268, 133);
        frame.getContentPane().add(panel_2_1_1);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 0));
        panel.setBounds(10, 10, 248, 113);
        panel_2_1_1.add(panel);
        panel.setLayout(null);
        
       
        LabelOutPut.setBounds(10, 10, 228, 93);
        panel.add(LabelOutPut);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(30, 30, 30));
        panel_2.setBounds(40, 296, 833, 64);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBackground(new Color(30, 30, 30));
        panel_1_1_1.setBounds(148, 84, 618, 39);
        frame.getContentPane().add(panel_1_1_1);
        
        JLabel lblNewLabel = new JLabel("Intput Time");
        lblNewLabel.setBounds(172, 127, 137, 23);
        frame.getContentPane().add(lblNewLabel);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
    }
}
