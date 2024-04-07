package weekTwo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PanelsAndFrames extends JFrame {
	public static void main(String[] args) {
		new PanelsAndFrames();
	}
	public PanelsAndFrames() {
		setSize(500,480);
		setVisible(true);
		setTitle("Frame Example");
		setCursor(getCursor());
	
		
		JButton button = new JButton("click button for secret message");
		button.setBounds(98, 135, 240, 125);
		add(button);
		
		
		
		
		button.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JLabel label = new JLabel("Buried treasure hidden here >  x", JLabel.CENTER);
				label.setAlignmentX(0);
				label.setAlignmentY(0);
				
				JFrame window = new JFrame("Button Clicked... ");
				window.setVisible(true);
				window.setBounds(280, 280, 300, 300);
				window.add(label);
				
				
			}
			
		});
		
	}
}

