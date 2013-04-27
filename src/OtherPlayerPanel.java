import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class OtherPlayerPanel extends JPanel {

	GameLogic gl;
	SpringLayout layout;
	private JTextField textP1cards;
	private JTextField textP1points;
	private JTextField textP1devCards;
	private JTextField textP2cards;
	private JTextField textP2points;
	private JTextField textP2devCards;
	private JTextField textP3cards;
	private JTextField textP3points;
	private JTextField textP3devCards;
	private JTextField textP4cards;
	private JTextField textP4points;
	private JTextField textP4devCards;
	private JTextField textP1sold;
	private JTextField textP2sold;
	private JTextField textP3sold;
	private JTextField textP4sold;
	
	public OtherPlayerPanel(GameLogic gl) {
		this.gl = gl;
		setPreferredSize(new Dimension(150, 700));
		layout = new SpringLayout();
		setLayout(layout);
		JLabel lblP1 = new JLabel("Player 1");
		layout.putConstraint(SpringLayout.NORTH, lblP1, 30, SpringLayout.NORTH, this);
		lblP1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.WEST, lblP1, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, lblP1, -10, SpringLayout.EAST, this);
		add(lblP1);
		
		JSeparator p1Separator = new JSeparator();
		p1Separator.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.NORTH, p1Separator, 3, SpringLayout.SOUTH, lblP1);
		layout.putConstraint(SpringLayout.WEST, p1Separator, 0, SpringLayout.WEST, lblP1);
		layout.putConstraint(SpringLayout.EAST, p1Separator, 0, SpringLayout.EAST, lblP1);
		add(p1Separator);
		
		JLabel lblP1cards = new JLabel("Res Cards:");
		layout.putConstraint(SpringLayout.WEST, lblP1cards, 0, SpringLayout.WEST, lblP1);
		add(lblP1cards);
		
		JLabel lblP1points = new JLabel("Points:");
		layout.putConstraint(SpringLayout.WEST, lblP1points, 0, SpringLayout.WEST, lblP1cards);
		add(lblP1points);
		
		textP1cards = new JTextField();
		textP1cards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP1cards, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, textP1cards, -35, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, lblP1cards, 3, SpringLayout.NORTH, textP1cards);
		add(textP1cards);
		textP1cards.setColumns(3);
		
		textP1points = new JTextField();
		textP1points.setEditable(false);
		layout.putConstraint(SpringLayout.EAST, textP1points, 0, SpringLayout.EAST, textP1cards);
		layout.putConstraint(SpringLayout.NORTH, lblP1points, 3, SpringLayout.NORTH, textP1points);
		layout.putConstraint(SpringLayout.NORTH, textP1points, 6, SpringLayout.SOUTH, textP1cards);
		add(textP1points);
		textP1points.setColumns(3);
		
		textP1devCards = new JTextField();
		textP1devCards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP1devCards, 6, SpringLayout.SOUTH, textP1points);
		layout.putConstraint(SpringLayout.WEST, textP1devCards, 0, SpringLayout.WEST, textP1cards);
		textP1devCards.setColumns(3);
		add(textP1devCards);
		
		JLabel lblP1devCards = new JLabel("Dev Cards:");
		layout.putConstraint(SpringLayout.NORTH, lblP1devCards, 3, SpringLayout.NORTH, textP1devCards);
		layout.putConstraint(SpringLayout.WEST, lblP1devCards, 0, SpringLayout.WEST, lblP1);
		add(lblP1devCards);
		
		textP1sold = new JTextField();
		textP1sold.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP1sold, 6, SpringLayout.SOUTH, textP1devCards);
		layout.putConstraint(SpringLayout.WEST, textP1sold, 0, SpringLayout.WEST, textP1devCards);
		textP1sold.setColumns(3);
		add(textP1sold);
		
		JLabel lblP1sold = new JLabel("Soldiers:");
		layout.putConstraint(SpringLayout.NORTH, lblP1sold, 3, SpringLayout.NORTH, textP1sold);
		layout.putConstraint(SpringLayout.WEST, lblP1sold, 0, SpringLayout.WEST, lblP1);
		add(lblP1sold);
		
		JLabel lblP2 = new JLabel("Player 2");
		layout.putConstraint(SpringLayout.NORTH, lblP2, 6, SpringLayout.SOUTH, textP1sold);
		layout.putConstraint(SpringLayout.WEST, lblP2, 0, SpringLayout.WEST, lblP1);
		layout.putConstraint(SpringLayout.EAST, lblP2, -10, SpringLayout.EAST, this);
		lblP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblP2.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblP2);
		
		JSeparator p2Separator = new JSeparator();
		p2Separator.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.NORTH, p2Separator, 3, SpringLayout.SOUTH, lblP2);
		layout.putConstraint(SpringLayout.WEST, p2Separator, 0, SpringLayout.WEST, lblP2);
		layout.putConstraint(SpringLayout.EAST, p2Separator, 0, SpringLayout.EAST, lblP2);
		add(p2Separator);
		
		JLabel lblP2cards = new JLabel("Res Cards:");
		layout.putConstraint(SpringLayout.WEST, lblP2cards, 0, SpringLayout.WEST, lblP2);
		add(lblP2cards);
		
		JLabel lblP2points = new JLabel("Points:");
		layout.putConstraint(SpringLayout.WEST, lblP2points, 0, SpringLayout.WEST, lblP2cards);
		add(lblP2points);
		
		textP2cards = new JTextField();
		textP2cards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP2cards, 3, SpringLayout.SOUTH, p2Separator);
		layout.putConstraint(SpringLayout.EAST, textP2cards, -35, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, lblP2cards, 3, SpringLayout.NORTH, textP2cards);
		add(textP2cards);
		textP2cards.setColumns(3);
		
		textP2points = new JTextField();
		textP2points.setEditable(false);
		layout.putConstraint(SpringLayout.EAST, textP2points, 0, SpringLayout.EAST, textP2cards);
		layout.putConstraint(SpringLayout.NORTH, lblP2points, 3, SpringLayout.NORTH, textP2points);
		layout.putConstraint(SpringLayout.NORTH, textP2points, 6, SpringLayout.SOUTH, textP2cards);
		add(textP2points);
		textP2points.setColumns(3);
		
		textP2devCards = new JTextField();
		textP2devCards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP2devCards, 6, SpringLayout.SOUTH, textP2points);
		layout.putConstraint(SpringLayout.WEST, textP2devCards, 0, SpringLayout.WEST, textP2cards);
		textP2devCards.setColumns(3);
		add(textP2devCards);
		
		JLabel lblP2devCards = new JLabel("Dev Cards:");
		layout.putConstraint(SpringLayout.NORTH, lblP2devCards, 3, SpringLayout.NORTH, textP2devCards);
		layout.putConstraint(SpringLayout.WEST, lblP2devCards, 0, SpringLayout.WEST, lblP2);
		add(lblP2devCards);
		
		textP2sold = new JTextField();
		textP2sold.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP2sold, 6, SpringLayout.SOUTH, textP2devCards);
		layout.putConstraint(SpringLayout.WEST, textP2sold, 0, SpringLayout.WEST, textP2devCards);
		textP2sold.setColumns(3);
		add(textP2sold);
		
		JLabel lblP2sold = new JLabel("Soldiers:");
		layout.putConstraint(SpringLayout.NORTH, lblP2sold, 3, SpringLayout.NORTH, textP2sold);
		layout.putConstraint(SpringLayout.WEST, lblP2sold, 0, SpringLayout.WEST, lblP2);
		add(lblP2sold);
		
		JLabel lblP3 = new JLabel("Player 3");
		layout.putConstraint(SpringLayout.NORTH, lblP3, 6, SpringLayout.SOUTH, textP2sold);
		layout.putConstraint(SpringLayout.WEST, lblP3, 0, SpringLayout.WEST, lblP2);
		layout.putConstraint(SpringLayout.EAST, lblP3, -10, SpringLayout.EAST, this);
		lblP3.setHorizontalAlignment(SwingConstants.CENTER);
		lblP3.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblP3);
		
		JSeparator p3Separator = new JSeparator();
		p3Separator.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.NORTH, p3Separator, 3, SpringLayout.SOUTH, lblP3);
		layout.putConstraint(SpringLayout.WEST, p3Separator, 0, SpringLayout.WEST, lblP3);
		layout.putConstraint(SpringLayout.EAST, p3Separator, 0, SpringLayout.EAST, lblP3);
		add(p3Separator);
		
		JLabel lblP3cards = new JLabel("Res Cards:");
		layout.putConstraint(SpringLayout.WEST, lblP3cards, 0, SpringLayout.WEST, lblP3);
		add(lblP3cards);
		
		JLabel lblP3points = new JLabel("Points:");
		layout.putConstraint(SpringLayout.WEST, lblP3points, 0, SpringLayout.WEST, lblP3cards);
		add(lblP3points);
		
		textP3cards = new JTextField();
		textP3cards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP3cards, 3, SpringLayout.SOUTH, p3Separator);
		layout.putConstraint(SpringLayout.EAST, textP3cards, -35, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, lblP3cards, 3, SpringLayout.NORTH, textP3cards);
		add(textP3cards);
		textP3cards.setColumns(3);
		
		textP3points = new JTextField();
		textP3points.setEditable(false);
		layout.putConstraint(SpringLayout.EAST, textP3points, 0, SpringLayout.EAST, textP3cards);
		layout.putConstraint(SpringLayout.NORTH, lblP3points, 3, SpringLayout.NORTH, textP3points);
		layout.putConstraint(SpringLayout.NORTH, textP3points, 6, SpringLayout.SOUTH, textP3cards);
		add(textP3points);
		textP3points.setColumns(3);
		
		textP3devCards = new JTextField();
		textP3devCards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP3devCards, 6, SpringLayout.SOUTH, textP3points);
		layout.putConstraint(SpringLayout.WEST, textP3devCards, 0, SpringLayout.WEST, textP3cards);
		textP3devCards.setColumns(3);
		add(textP3devCards);
		
		JLabel lblP3devCards = new JLabel("Dev Cards:");
		layout.putConstraint(SpringLayout.NORTH, lblP3devCards, 3, SpringLayout.NORTH, textP3devCards);
		layout.putConstraint(SpringLayout.WEST, lblP3devCards, 0, SpringLayout.WEST, lblP3);
		add(lblP3devCards);
		
		textP3sold = new JTextField();
		textP3sold.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP3sold, 6, SpringLayout.SOUTH, textP3devCards);
		layout.putConstraint(SpringLayout.WEST, textP3sold, 0, SpringLayout.WEST, textP3devCards);
		textP3sold.setColumns(3);
		add(textP3sold);
		
		JLabel lblP3sold = new JLabel("Soldiers:");
		layout.putConstraint(SpringLayout.NORTH, lblP3sold, 3, SpringLayout.NORTH, textP3sold);
		layout.putConstraint(SpringLayout.WEST, lblP3sold, 0, SpringLayout.WEST, lblP3);
		add(lblP3sold);
		
		JLabel lblP4 = new JLabel("Player 4");
		layout.putConstraint(SpringLayout.NORTH, lblP4, 6, SpringLayout.SOUTH, textP3sold);
		layout.putConstraint(SpringLayout.WEST, lblP4, 0, SpringLayout.WEST, lblP3);
		layout.putConstraint(SpringLayout.EAST, lblP4, -10, SpringLayout.EAST, this);
		lblP4.setHorizontalAlignment(SwingConstants.CENTER);
		lblP4.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblP4);
		
		JSeparator p4Separator = new JSeparator();
		p4Separator.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.NORTH, p4Separator, 3, SpringLayout.SOUTH, lblP4);
		layout.putConstraint(SpringLayout.WEST, p4Separator, 0, SpringLayout.WEST, lblP4);
		layout.putConstraint(SpringLayout.EAST, p4Separator, 0, SpringLayout.EAST, lblP4);
		add(p4Separator);
		
		JLabel lblP4cards = new JLabel("Res Cards:");
		layout.putConstraint(SpringLayout.WEST, lblP4cards, 0, SpringLayout.WEST, lblP4);
		add(lblP4cards);
		
		JLabel lblP4points = new JLabel("Points:");
		layout.putConstraint(SpringLayout.WEST, lblP4points, 0, SpringLayout.WEST, lblP4cards);
		add(lblP4points);
		
		textP4cards = new JTextField();
		textP4cards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP4cards, 3, SpringLayout.SOUTH, p4Separator);
		layout.putConstraint(SpringLayout.EAST, textP4cards, -35, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, lblP4cards, 3, SpringLayout.NORTH, textP4cards);
		add(textP4cards);
		textP4cards.setColumns(3);
		
		textP4points = new JTextField();
		textP4points.setEditable(false);
		layout.putConstraint(SpringLayout.EAST, textP4points, 0, SpringLayout.EAST, textP4cards);
		layout.putConstraint(SpringLayout.NORTH, lblP4points, 3, SpringLayout.NORTH, textP4points);
		layout.putConstraint(SpringLayout.NORTH, textP4points, 6, SpringLayout.SOUTH, textP4cards);
		add(textP4points);
		textP4points.setColumns(3);
		
		textP4devCards = new JTextField();
		textP4devCards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP4devCards, 6, SpringLayout.SOUTH, textP4points);
		layout.putConstraint(SpringLayout.WEST, textP4devCards, 0, SpringLayout.WEST, textP4cards);
		textP4devCards.setColumns(3);
		add(textP4devCards);
		
		JLabel lblP4devCards = new JLabel("Dev Cards:");
		layout.putConstraint(SpringLayout.NORTH, lblP4devCards, 3, SpringLayout.NORTH, textP4devCards);
		layout.putConstraint(SpringLayout.WEST, lblP4devCards, 0, SpringLayout.WEST, lblP4);
		add(lblP4devCards);
		
		textP4sold = new JTextField();
		textP4sold.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP4sold, 6, SpringLayout.SOUTH, textP4devCards);
		layout.putConstraint(SpringLayout.WEST, textP4sold, 0, SpringLayout.WEST, textP4devCards);
		textP4sold.setColumns(3);
		add(textP4sold);
		
		JLabel lblP4sold = new JLabel("Soldiers:");
		layout.putConstraint(SpringLayout.NORTH, lblP4sold, 3, SpringLayout.NORTH, textP4sold);
		layout.putConstraint(SpringLayout.WEST, lblP4sold, 0, SpringLayout.WEST, lblP4);
		add(lblP4sold);
	}
	
	public void update(GameLogic l){
		//TODO
		this.gl = l;
		
	}
	
	
}
