import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.Dimension;



public class Gui extends JFrame {

	public static void main(String[] args) {

		new Gui();

	}
	
	public Gui() {
		
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Kokonut's Ticket Kiosk");
				
		JPanel thePanel = new JPanel();
		
		
		thePanel.setLayout(new BorderLayout());
		JButton button3 = new JButton ("button 3");
		JButton button4 = new JButton ("Button 4");
		JButton button5 = new JButton ("Button 5");
		JButton button6 = new JButton ("Button 6");
		JButton button7 = new JButton ("Button 7");
		
		JPanel thePanel2 = new JPanel();
		
		thePanel2.add(button3);
		thePanel2.add(button4);
		
		thePanel.add(thePanel2, BorderLayout.NORTH);
		
		JLabel label1 = new JLabel("Movies and stuff");
				
		label1.setToolTipText("Something Something movies");

		thePanel.add(label1);
		
		JButton button1 = new JButton ("Movie Button");
		JButton button2 = new JButton ("Popcorn Button");
		
		//thePanel.add(button1);
		//thePanel.add(button2);
		
		
		
		this.add(thePanel);
		
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}

}
