import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;



public class PlaceWindow extends JPanel {
	GameLogic gl;
	
	SpringLayout layout;
	private JButton next;
	private JButton place;
	private String a="nextt";
	private Player active;
	/*
	private JButton btnP1Acc;
	private JButton btnP2Acc;
	private JButton btnP3Acc;
	private JButton btnEndTrading;
	*/
	
	PlaceWindow(int playerNum, GameLogic gl)
	{
		this.gl = gl;
		
		
		
		layout = new SpringLayout();
		setLayout(layout);
		next= new JButton(a);
		next.setFont(new Font("Tahoma", Font.BOLD, 12));
		layout.putConstraint(SpringLayout.NORTH, next, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, next, 10, SpringLayout.WEST, this);
		add(next);
		next.addActionListener(new tradeListener());
		next.setActionCommand("1");
		place = new JButton("place");
		layout.putConstraint(SpringLayout.NORTH, place, 2, SpringLayout.SOUTH, next);
		place.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.WEST, place, 0, SpringLayout.WEST, next);
		
		add(place);
		
		place.addActionListener(new tradeListener());
		place.setActionCommand("2");
		
	}
	class tradeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String source = e.getActionCommand();

			if(source.equals("1"))
			{
				a="poo";
				System.out.println("hi there");
			}
			if(source.equals("2"))
			{
				System.out.println("exit here!");
			}
		}
		
	}
}	
