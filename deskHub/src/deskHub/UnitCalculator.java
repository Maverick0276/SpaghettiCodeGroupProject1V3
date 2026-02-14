package deskHub;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import java.math.BigDecimal; 
import java.math.RoundingMode;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class UnitCalculator{
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//BigDecimalNumbers For temperature
    BigDecimal tn1_8 = BigDecimal.valueOf(1.8);
    BigDecimal tn32 = BigDecimal.valueOf(32);
    BigDecimal tn273_15 = BigDecimal.valueOf(273.15);
//BigDecimalNumbers For volume
    BigDecimal vn1k = BigDecimal.valueOf(1000);
    BigDecimal vn1m = BigDecimal.valueOf(1_000_000);
    BigDecimal vn1b = BigDecimal.valueOf(1_000_000_000);
    BigDecimal vn0_001 = BigDecimal.valueOf(0.001);
    BigDecimal vn0_000001 = BigDecimal.valueOf(0.000001);
//BigDecimalNumbers fo Lenght
    BigDecimal ln1k = BigDecimal.valueOf(1000);      
    BigDecimal ln100 = BigDecimal.valueOf(100);         
    BigDecimal ln0_001 = BigDecimal.valueOf(0.001);    
    BigDecimal ln0_000001 = BigDecimal.valueOf(0.000001); 
    BigDecimal ln0_000000001 = BigDecimal.valueOf(0.000000001);
//BigDecimalNumbers for Time
    BigDecimal Tn60 = BigDecimal.valueOf(60);
    BigDecimal Tn3600 = BigDecimal.valueOf(3_600);
    BigDecimal Tn3_6m = BigDecimal.valueOf(3_600_000);         
    BigDecimal Tn3_6b = BigDecimal.valueOf(3_600_000_000L);    
    BigDecimal Tn3_6t = BigDecimal.valueOf(3_600_000_000_000L);
    BigDecimal Tn60k = BigDecimal.valueOf(60_000);
    BigDecimal Tn60m = BigDecimal.valueOf(60_000_000);
    BigDecimal Tn60b = BigDecimal.valueOf(60_000_000_000L);
   
  
   

    
	public static JFrame frame;// ginawa kong public para ma keta ng homeframe para kaya nyang i close

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitCalculator window = new UnitCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 * 
	 * Create the application.
	 */
	public UnitCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		T2.setEditable(false);
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
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(30, 30, 30));
		panel_1_1_1.setBounds(155, 84, 618, 38);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton b1Temp = new JButton("Temp");
		b1Temp.setBounds(10, 10, 100, 21);
		panel_1_1_1.add(b1Temp);
		
		b1Temp.setForeground(new Color(255, 255, 255));
		b1Temp.setBackground(new Color(30, 30, 30));
		
		JButton btn5Time = new JButton("Time");
		btn5Time.setBounds(131, 10, 100, 21);
		panel_1_1_1.add(btn5Time);
		btn5Time.setForeground(new Color(255, 255, 255));
		btn5Time.setBackground(new Color(30, 30, 30));
		
		JButton b2Volume = new JButton("Volume");
		b2Volume.setBounds(247, 10, 100, 21);
		panel_1_1_1.add(b2Volume);
		
		b2Volume.setForeground(new Color(255, 255, 255));
		b2Volume.setBackground(new Color(30, 30, 30));
		
		JButton b3Length = new JButton("Length");
		b3Length.setBounds(364, 10, 100, 21);
		panel_1_1_1.add(b3Length);
		b3Length.setForeground(new Color(255, 255, 255));
		b3Length.setBackground(new Color(30, 30, 30));
		
		JButton btn4Weight = new JButton("Weight");
		btn4Weight.setBounds(481, 10, 100, 21);
		panel_1_1_1.add(btn4Weight);
		btn4Weight.setForeground(new Color(255, 255, 255));
		btn4Weight.setBackground(new Color(30, 30, 30));
		btn4Weight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] a = {"Kilogram","Gram","Miligram","Metric Ton"};
				list1.setListData(a);
				list2.setListData(a);
							
				
			}
		});
		b3Length.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] a = {"Meter","Kilometer","Centimeter","Millimeter","Micrometer","Nanometer"};
				list1.setListData(a);
				list2.setListData(a);
			}
		});
		b2Volume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] a = {"Cubic Meter","Cubic Kilometer","Cubic Centimeter","Cubic Millimeter","Liter","Milliliter"};
				list1.setListData(a);
				list2.setListData(a);
			}
		});
		btn5Time.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] a = {"Hours","Minutes","Seconds","Microseconds","Nanoseconds"};
				list1.setListData(a);
				list2.setListData(a);
			}
		});
		b1Temp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String [] a = {"Celsius","Fahrenheit","Kelvin"};
			list1.setListData(a);
			list2.setListData(a);
			
				
			}
		});
		
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
		panel_2.setBounds(340, 296, 230, 64);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//COnverter button
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.setBounds(51, 10, 113, 45);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(30, 30, 30));
		panel_3.setBounds(35, 299, 300, 61);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(30, 30, 30));
		panel_3_1.setBounds(574, 299, 300, 61);
		frame.getContentPane().add(panel_3_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (T1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Please Enter a Value");
					return;
				}		
				String L1 =(String) list1.getSelectedValue();
				String L2 =(String) list2.getSelectedValue();
				BigDecimal input;
				
				try {
				    input = new BigDecimal(T1.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Invalid number"); 
				    return;
				}
				BigDecimal result = input;
				
				if (L1 == null || L2 == null) {
				    JOptionPane.showMessageDialog(null, "Please select both units");
				    return;
				}
				
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
// Temp calculations
//(1 Celsius to all)
				switch (L1) { //GrandParent
			case "Celsius":   //Parent  
			    switch (L2) { //Child/Nested
				    case "Kelvin": result = input.add(tn273_15); break;
			    	case "Fahrenheit": result = input.multiply(tn1_8).add(tn32); break;
				    case "Celsius": result = input; break;			
				}
				break;			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//(2 Kelvin to all)	
			case "Kelvin":      //Parent 
				switch (L2) {  //Child/nested
				    case "Celsius": result = input.subtract(tn273_15); break;
			     	case "Fahrenheit": result = input.subtract(tn273_15).multiply(tn1_8).add(tn32); break;
			    	case "Kelvin": result = input; break;
				}	
				break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//(3 Fahrenheit to all)	
				
				case "Fahrenheit":  //Parent
				    switch (L2) {  //Child/nested
				       case "Celsius": result = input.subtract(tn32).divide(tn1_8,10, RoundingMode.HALF_UP); break;
				       case "Kelvin":   result = input.subtract(tn32).divide(tn1_8, 10, RoundingMode.HALF_UP).add(tn273_15); break;
				       case "Fahrenheit":result = input; break;				
				}
				break;   
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Volume calculations	
//Cubic Meter to all				
				case "Cubic Meter": //Parent
			        switch (L2) {  //Child/Nested
			            case "Cubic Meter": result = input; break;
			            case "Cubic Kilometer": result = input.divide(vn1b, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Centimeter": result = input.multiply(vn1m); break;
			            case "Cubic Millimeter": result = input.multiply(vn1b); break;
			            case "Liter": result = input.divide(vn0_001, 10, RoundingMode.HALF_UP); break;
			            case "Milliliter": result = input.divide(vn0_000001, 10, RoundingMode.HALF_UP); break;
			        }
			        break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			        
//Cubic Kilometer to all
				case "Cubic Kilometer": //Parent 
			        switch (L2) {      //Child/nested
			            case "Cubic Meter": result = input.multiply(vn1b); break;
			            case "Cubic Kilometer": result = input; break;
			            case "Cubic Centimeter": result = input.multiply(vn1b).multiply(vn1m); break;
			            case "Cubic Millimeter": result = input.multiply(vn1b).multiply(vn1b); break;
			            case "Liter": result = input.multiply(vn1b).divide(vn0_001, 10, RoundingMode.HALF_UP); break;
			            case "Milliliter": result = input.multiply(vn1b).divide(vn0_000001, 10, RoundingMode.HALF_UP); break;
			        }
			        break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Cubic Centimeter to all
				case "Cubic Centimeter": //Parent 
			        switch (L2) {       //Child/nested
			            case "Cubic Meter": result = input.divide(vn1m, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Kilometer": result = input.divide(vn1b).divide(vn1m, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Centimeter": result = input; break;
			            case "Cubic Millimeter": result = input.multiply(vn1k); break;
			            case "Liter": result = input.divide(vn1k, 10, RoundingMode.HALF_UP); break;
			            case "Milliliter": result = input; break; 
			        }
			        break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Cubic Millimeter to all
				case "Cubic Millimeter": //Parent
			        switch (L2) {       //Child/nested
			            case "Cubic Meter": result = input.divide(vn1b, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Kilometer": result = input.divide(vn1b).divide(vn1b, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Centimeter": result = input.divide(vn1k, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Millimeter": result = input; break;
			            case "Liter": result = input.divide(vn1m, 10, RoundingMode.HALF_UP); break;
			            case "Milliliter": result = input.divide(vn1k, 10, RoundingMode.HALF_UP); break;
			        }
			        break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Liter to all
				case "Liter":      //Parent
			        switch (L2) { //Child/nested
			            case "Cubic Meter": result = input.multiply(vn0_001); break;
			            case "Cubic Kilometer": result = input.multiply(vn0_001).divide(vn1b, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Centimeter": result = input.multiply(vn1k); break;
			            case "Cubic Millimeter": result = input.multiply(vn1m); break;
			            case "Liter": result = input; break;
			            case "Milliliter": result = input.multiply(vn1k); break;     
			        }
			        break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Millimeter to all
			     case "Milliliter":  //Parent
			          switch (L2) { //Child/nested
			            case "Cubic Meter": result = input.multiply(vn0_000001); break;
			            case "Cubic Kilometer": result = input.multiply(vn0_000001).divide(vn1b, 10, RoundingMode.HALF_UP); break;
			            case "Cubic Centimeter": result = input; break;
			            case "Cubic Millimeter": result = input.multiply(vn1k); break;
			            case "Liter": result = input.multiply(vn0_001); break;
			            case "Milliliter": result = input; break;
			         }
			         break;	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Length Calculations
//Meter to all			         
			     case "Meter":     //Parent
			         switch(L2) { //Child/nested
			             case "Meter": result = input; break;
			             case "Kilometer": result = input.divide(ln1k, 10, RoundingMode.HALF_UP); break;
			             case "Centimeter": result = input.multiply(ln100); break;
			             case "Millimeter": result = input.multiply(ln1k); break;
			             case "Micrometer": result = input.multiply(BigDecimal.valueOf(1_000_000)); break; 
			             case "Nanometer": result = input.multiply(BigDecimal.valueOf(1_000_000_000)); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Kilometer to all
			     case "Kilometer":  //Parent
			         switch(L2) {  //Child/nested
			             case "Meter": result = input.multiply(ln1k); break;
			             case "Kilometer": result = input; break;
			             case "Centimeter": result = input.multiply(ln1k).multiply(ln100); break;
			             case "Millimeter": result = input.multiply(ln1k).multiply(ln1k); break;
			             case "Micrometer": result = input.multiply(ln1k).multiply(BigDecimal.valueOf(1_000_000)); break;
			             case "Nanometer": result = input.multiply(ln1k).multiply(BigDecimal.valueOf(1_000_000_000)); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Centimeter to all
			     case "Centimeter": //Parent
			         switch(L2) {  //Child/nested
			             case "Meter": result = input.divide(ln100, 10, RoundingMode.HALF_UP); break;
			             case "Kilometer": result = input.divide(ln100, 10, RoundingMode.HALF_UP).divide(ln1k, 10, RoundingMode.HALF_UP); break;
			             case "Centimeter": result = input; break;
			             case "Millimeter": result = input.multiply(BigDecimal.valueOf(10)); break;
			             case "Micrometer": result = input.multiply(BigDecimal.valueOf(10_000)); break;
			             case "Nanometer": result = input.multiply(BigDecimal.valueOf(10_000_000)); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Milimeter to all
			     case "Millimeter"://Parent
			         switch(L2) { //Child/nested
			             case "Meter": result = input.multiply(ln0_001); break;
			             case "Kilometer": result = input.multiply(ln0_001).divide(ln1k, 10, RoundingMode.HALF_UP); break;
			             case "Centimeter": result = input.divide(BigDecimal.valueOf(10), 10, RoundingMode.HALF_UP); break;
			             case "Millimeter": result = input; break;
			             case "Micrometer": result = input.multiply(BigDecimal.valueOf(1000)); break;
			             case "Nanometer": result = input.multiply(BigDecimal.valueOf(1_000_000)); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Micrometer to all
			     case "Micrometer"://Parent
			         switch(L2) { //Child/nested
			             case "Meter": result = input.multiply(ln0_000001); break;
			             case "Kilometer": result = input.multiply(ln0_000001).divide(ln1k, 10, RoundingMode.HALF_UP); break;
			             case "Centimeter": result = input.multiply(ln0_000001).divide(ln0_001, 10, RoundingMode.HALF_UP); break;
			             case "Millimeter": result = input.multiply(ln0_000001).divide(ln0_001, 10, RoundingMode.HALF_UP); break;
			             case "Micrometer": result = input; break;
			             case "Nanometer": result = input.multiply(BigDecimal.valueOf(1000)); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Nanometer to all
			     case "Nanometer": //Parent
			         switch(L2) { //Child/nested
			             case "Meter": result = input.multiply(ln0_000000001); break;
			             case "Kilometer": result = input.multiply(ln0_000000001).divide(ln1k, 10, RoundingMode.HALF_UP); break;
			             case "Centimeter": result = input.multiply(ln0_000000001).divide(ln0_001, 10, RoundingMode.HALF_UP); break;
			             case "Millimeter": result = input.multiply(ln0_000000001).divide(ln0_001, 10, RoundingMode.HALF_UP); break;
			             case "Micrometer": result = input.multiply(ln0_000000001).divide(ln0_000001, 10, RoundingMode.HALF_UP); break;
			             case "Nanometer": result = input; break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Weight Calculations	
//Kg to all			         
			     case "Kilogram":  //Parent
			         switch(L2) { //Child/nested
			             case "Kilogram": result = input; break;
			             case "Gram": result = input.multiply(vn1k); break;
			             case "Miligram": result = input.multiply(vn1k).multiply(vn1k); break;
			             case "Metric Ton": result = input.divide(vn1m, 10, RoundingMode.HALF_UP); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Grams to all
			     case "Gram":      //Parent
			         switch(L2) { //Child/nested
			             case "Kilogram": result = input.divide(vn1k, 10, RoundingMode.HALF_UP); break;
			             case "Gram": result = input; break;
			             case "Miligram": result = input.multiply(vn1k); break;
			             case "Metric Ton": result = input.divide(vn1m, 10, RoundingMode.HALF_UP); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Miligram to all
			     case "Miligram":  //Parent
			         switch(L2) { //Child/nested
			             case "Kilogram": result = input.multiply(vn0_001).multiply(vn0_001); break; 
			             case "Gram": result = input.multiply(vn0_001); break; 
			             case "Miligram": result = input; break;
			             case "Metric Ton": result = input.multiply(vn0_001).divide(vn1m, 10, RoundingMode.HALF_UP); break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Metric Ton to all
			     case "Metric Ton"://Parent
			         switch(L2) { //Child/nested
			             case "Kilogram": result = input.multiply(vn1m).divide(vn1k, 10, RoundingMode.HALF_UP); break;
			             case "Gram": result = input.multiply(vn1m); break; 
			             case "Miligram": result = input.multiply(vn1m).multiply(vn1k); break; 
			             case "Metric Ton": result = input; break;
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Time Calculations
//Hours to all			         
			     case "Hours":     //Parent
			         switch(L2) { //Child/nested
			             case "Hours": result = input; break;
			             case "Minutes": result = input.multiply(Tn60); break;
			             case "Seconds": result = input.multiply(Tn3600); break; 
			             case "Microseconds": result = input.multiply(Tn3_6b); break;
			             case "Nanoseconds": result = input.multiply(Tn3_6t); break;
			         }
			         break;    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Minutes to all		  		         
			     case "Minutes":   //Parent 
			         switch(L2) { //Child/nested
			             case "Hours":   result = input.divide(Tn60,10,RoundingMode.HALF_UP); break; 
			             case "Minutes": result = input; break;
			             case "Seconds": result = input.multiply(Tn60); break; 
			             case "Microseconds": result = input.multiply(Tn60m); break;
			             case "Nanoseconds": result = input.multiply(Tn60b); break;    
			         } 
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Seconds to all			         
			     case "Seconds":   //Parent
			         switch(L2) { //Child/nested
			             case "Hours":   result = input.divide(Tn3600,10,RoundingMode.HALF_UP); break; 
			             case "Minutes": result = input.divide(Tn60,RoundingMode.HALF_UP); break;
			             case "Seconds": result = input; break; 
			             case "Microseconds": result = input.multiply(vn1m); break;
			             case "Nanoseconds": result = input.multiply(vn1b); break;    
			         }
			         break;     
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Microseconds to all			         
			     case "Microseconds": //Parent
			         switch(L2) {   //Child/Nested
			             case "Hours":   result = input.divide(Tn3_6b,RoundingMode.HALF_UP); break; 
			             case "Minutes": result = input.divide(Tn60m,RoundingMode.HALF_UP); break;
			             case "Seconds": result = input.divide(vn1m,RoundingMode.HALF_UP); break; 
			             case "Microseconds": result = input; break;
			             case "Nanoseconds": result = input.multiply(vn1k); break;    
			         }
			         break;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Nanoseconds to all			         
			     case "Nanoseconds": //Parent
			         switch(L2) {   //Child/Nested
			             case "Hours":   result = input.divide(Tn3_6t,RoundingMode.HALF_UP); break; 
			             case "Minutes": result = input.divide(Tn60b,RoundingMode.HALF_UP); break;
			             case "Seconds": result = input.divide(vn1b,RoundingMode.HALF_UP); break; 
			             case "Microseconds": result= input.divide(vn1k); break; 
			             case "Nanoseconds": result = input;break;   
			         }
			         break;
			         
			         
			         
			         
				}//End L1 Parenthesis
				
				result = result.setScale(2,RoundingMode.HALF_UP);
				T2.setText(String.valueOf(result));
				
				
				
				
				
				
			}
		});
		
		
	
	}
}
