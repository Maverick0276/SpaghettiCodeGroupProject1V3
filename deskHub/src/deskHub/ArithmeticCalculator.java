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

public class ArithmeticCalculator {

    public static JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ArithmeticCalculator window = new ArithmeticCalculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ArithmeticCalculator() {
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

        
        
        JList list1 = new JList();
        JList list2 = new JList();

        JFormattedTextField T1 = new JFormattedTextField();
        T1.setBackground(new Color(255, 128, 0));
        T1.setBounds(67, 127, 247, 19);
        frame.getContentPane().add(T1);

        JFormattedTextField T2 = new JFormattedTextField();
        T2.setBackground(new Color(255, 128, 0));
        T2.setBounds(595, 127, 247, 19);
        frame.getContentPane().add(T2);


        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(30, 30, 30));
        panel_1.setBounds(35, 10, 839, 71);
        frame.getContentPane().add(panel_1);

        JPanel panel_2_1 = new JPanel();
        panel_2_1.setLayout(null);
        panel_2_1.setBackground(new Color(30, 30, 30));
        panel_2_1.setBounds(574, 156, 268, 133);
        frame.getContentPane().add(panel_2_1);

        list2.setBounds(10, 10, 247, 110);
        panel_2_1.add(list2);
        list2.setBackground(new Color(255, 128, 0));

        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setLayout(null);
        panel_2_1_1.setBackground(new Color(30, 30, 30));
        panel_2_1_1.setBounds(67, 156, 268, 133);
        frame.getContentPane().add(panel_2_1_1);

        list1.setBounds(10, 10, 247, 110);
        panel_2_1_1.add(list1);
        list1.setBackground(new Color(255, 128, 0));

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(30, 30, 30));
        panel_2.setBounds(40, 296, 833, 64);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JFormattedTextField T3 = new JFormattedTextField();
        T3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        T3.setBackground(new Color(255, 128, 0));
        T3.setBounds(303, 10, 248, 29);
        panel_2.add(T3);
        
        JLabel lblNewLabel = new JLabel("OutPut");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(389, 41, 96, 23);
        panel_2.add(lblNewLabel);
        
        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBackground(new Color(30, 30, 30));
        panel_1_1_1.setBounds(148, 84, 618, 39);
        frame.getContentPane().add(panel_1_1_1);
        
        JButton b1Temp = new JButton("+");
        b1Temp.setFont(new Font("Tahoma", Font.BOLD, 20));
        b1Temp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		  double from = Double.parseDouble(T1.getText());
        		  double to = Double.parseDouble(T2.getText());
        		  T3.setText(String.valueOf(from + to));
        	}
        });
        b1Temp.setForeground(new Color(255, 255, 255));
        b1Temp.setBackground(new Color(30, 30, 30));
        b1Temp.setBounds(10, 10, 100, 21);
        panel_1_1_1.add(b1Temp);
        
        JButton btn5Time = new JButton("-");
        btn5Time.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5Time.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		double from = Double.parseDouble(T1.getText());
      		    double to = Double.parseDouble(T2.getText());
      		  T3.setText(String.valueOf(from - to));
        	}
        });
        btn5Time.setForeground(new Color(255, 255, 255));
        btn5Time.setBackground(new Color(30, 30, 30));
        btn5Time.setBounds(131, 10, 100, 21);
        panel_1_1_1.add(btn5Time);
        
        JButton b2Volume = new JButton("x");
        b2Volume.setFont(new Font("Tahoma", Font.BOLD, 20));
        b2Volume.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		double from = Double.parseDouble(T1.getText());
      		    double to = Double.parseDouble(T2.getText());
      		    T3.setText(String.valueOf(from * to));
        	}
        });
        b2Volume.setForeground(new Color(255, 255, 255));
        b2Volume.setBackground(new Color(30, 30, 30));
        b2Volume.setBounds(247, 10, 100, 21);
        panel_1_1_1.add(b2Volume);
        
        JButton b3Length = new JButton("/");
        b3Length.setFont(new Font("Tahoma", Font.BOLD, 20));
        b3Length.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		double from = Double.parseDouble(T1.getText());
      		    double to = Double.parseDouble(T2.getText());
      		    T3.setText(String.valueOf(from / to));
        	}
        });
        b3Length.setForeground(new Color(255, 255, 255));
        b3Length.setBackground(new Color(30, 30, 30));
        b3Length.setBounds(364, 10, 100, 21);
        panel_1_1_1.add(b3Length);
    }
}
