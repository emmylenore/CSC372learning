package weekTwo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class BirthdayGUIcta2 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Birthday GUI Example");
		frame.setSize(500,300);
		frame.setVisible(true);
		
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter DOB (yyyy-mm-dd): ");
		JTextField birthDateField = new JTextField(10);
		
		JButton button = new JButton("Click me!! ! : ");
		button.setBounds(98, 135, 240, 125);
		panel.add(button);
		JLabel age = new JLabel("Click Button for Age Output");
		
		
      button.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
			       try {
	                    LocalDate birthDate = LocalDate.parse(birthDateField.getText());
	                    LocalDate now = LocalDate.now();
	                    Period current = Period.between(birthDate, now);
	                    age.setText("You are " + current.getYears());
	                } catch (Exception ex) {
	                    age.setText("Invalid entry");
	                }
	            }
	        });

	        panel.add(label);
	        panel.add(birthDateField);
	        panel.add(age);
	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}
