import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;


public class GameStatusPanel extends JPanel {

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
	private int cards=1;//tie into gamestate here
	private int turn=1;
	private int somethingElse=1;
	
	public GameStatusPanel(GameLogic gl) {
		this.gl = gl;
		setPreferredSize(new Dimension(150, 700));
		layout = new SpringLayout();
		setLayout(layout);
		JLabel lblP1 = new JLabel("State of game");
		layout.putConstraint(SpringLayout.NORTH, lblP1, 20, SpringLayout.NORTH, this);
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
		
		JLabel lblP1cards = new JLabel("Cards in deck: "+cards+"               Turn: "+turn+"               otherdatavalue: "+somethingElse);
		layout.putConstraint(SpringLayout.NORTH, lblP1cards, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.WEST, lblP1cards, 0, SpringLayout.WEST, lblP1);
		add(lblP1cards);
		
		JLabel lblP1points = new JLabel(" ");
		layout.putConstraint(SpringLayout.WEST, lblP1points, 0, SpringLayout.WEST, lblP1cards);
		add(lblP1points);
		
	}
	
	public void update(GameLogic l){
		//TODO
		this.gl = l;
		
	}
}
