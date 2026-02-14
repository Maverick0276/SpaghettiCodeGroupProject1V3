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


public class BmiCalculator {

    public static JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	BmiCalculator window = new BmiCalculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BmiCalculator() {
        initialize();
    }
    
  
   
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
        
        JLabel LabelOutPut2 = new JLabel("");
        JLabel LabelOutPut = new JLabel("");
        LabelOutPut.setFont(new Font("Tahoma", Font.BOLD, 20));


        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(30, 30, 30));
        panel_1.setBounds(35, 10, 839, 71);
        frame.getContentPane().add(panel_1);

        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setLayout(null);
        panel_2_1_1.setBackground(new Color(30, 30, 30));
        panel_2_1_1.setBounds(171, 166, 287, 120);
        frame.getContentPane().add(panel_2_1_1);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 128, 0));
        panel.setBounds(10, 10, 267, 100);
        panel_2_1_1.add(panel);
        panel.setLayout(null);
        
       
        LabelOutPut.setBounds(10, 10, 247, 80);
        panel.add(LabelOutPut);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(30, 30, 30));
        panel_2.setBounds(40, 296, 833, 64);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        JFormattedTextField THeight = new JFormattedTextField();
        JFormattedTextField TWeight = new JFormattedTextField();
        
        JButton btnNewButton = new JButton("Start");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		double height = Double.parseDouble(THeight.getText()) / 100;
        		
        		double weight = Double.parseDouble(TWeight.getText());
        		Double BMI = weight / (height * height);
        		String Category;
        		
        		
	               if (BMI < 18.5) {
         			 Category = "Underweight";
        		 } else if (BMI < 25) {
        			 Category = "Normal";
        		 } else if (BMI < 30) {
        			 Category = "Overweight";
        		 } else {
        			 Category = "Obese";
        		 }
        		
        		 LabelOutPut.setText(String.valueOf(BMI));
        		 LabelOutPut2.setText(String.valueOf(Category));
        	
        		 
            	}
            	
            });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBackground(new Color(255, 128, 0));
        btnNewButton.setBounds(366, 10, 85, 21);
        panel_2.add(btnNewButton);
        
        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBackground(new Color(30, 30, 30));
        panel_1_1_1.setBounds(136, 84, 639, 39);
        frame.getContentPane().add(panel_1_1_1);
        
        
        TWeight.setBackground(new Color(255, 128, 0));
        TWeight.setBounds(194, 137, 138, 19);
        frame.getContentPane().add(TWeight);
        
       
        THeight.setBackground(new Color(255, 128, 0));
        THeight.setBounds(595, 137, 138, 19);
        frame.getContentPane().add(THeight);
        
        JPanel panel_2_1_1_1 = new JPanel();
        panel_2_1_1_1.setLayout(null);
        panel_2_1_1_1.setBackground(new Color(30, 30, 30));
        panel_2_1_1_1.setBounds(462, 166, 287, 120);
        frame.getContentPane().add(panel_2_1_1_1);
        
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBackground(new Color(255, 128, 0));
        panel_3.setBounds(10, 10, 267, 100);
        panel_2_1_1_1.add(panel_3);
        
      
        LabelOutPut2.setFont(new Font("Tahoma", Font.BOLD, 30));
        LabelOutPut2.setBounds(10, 10, 247, 80);
        panel_3.add(LabelOutPut2);
        
        JLabel lblNewLabel = new JLabel("KiloGrams");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(342, 133, 118, 23);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblM = new JLabel("CentiMeters");
        lblM.setForeground(Color.WHITE);
        lblM.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblM.setBounds(743, 133, 131, 23);
        frame.getContentPane().add(lblM);
    }
}
