import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;


public class TradeWindow extends JPanel {
	GameLogic gl;
	int activePlay;
	SpringLayout layout;
	private JTextField textActLumb;
	private JTextField textActBrick;
	private JTextField textActIron;
	private JTextField textActSheep;
	private JTextField textActWheat;
	private JPasswordField actPlayPass;
	
	
	TradeWindow(int playerNum, GameLogic gl){
		this.gl = gl;
		this.activePlay = playerNum;
		layout = new SpringLayout();
		setLayout(layout);
		
		JLabel lblActOffer = new JLabel("Active Player Offers:");
		lblActOffer.setFont(new Font("Tahoma", Font.BOLD, 12));
		layout.putConstraint(SpringLayout.NORTH, lblActOffer, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, lblActOffer, 10, SpringLayout.WEST, this);
		add(lblActOffer);
		
		JSeparator actPlaySep = new JSeparator();
		layout.putConstraint(SpringLayout.NORTH, actPlaySep, 2, SpringLayout.SOUTH, lblActOffer);
		actPlaySep.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.WEST, actPlaySep, 0, SpringLayout.WEST, lblActOffer);
		layout.putConstraint(SpringLayout.EAST, actPlaySep, 20, SpringLayout.EAST, lblActOffer);
		add(actPlaySep);
		
		textActLumb = new JTextField();
		layout.putConstraint(SpringLayout.EAST, textActLumb, -60, SpringLayout.EAST, actPlaySep);
		textActLumb.setHorizontalAlignment(SwingConstants.RIGHT);
		textActLumb.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textActLumb, 6, SpringLayout.SOUTH, actPlaySep);
		add(textActLumb);
		textActLumb.setColumns(3);
		
		JLabel lblActLumb = new JLabel("Lumber:");
		layout.putConstraint(SpringLayout.NORTH, lblActLumb, 3, SpringLayout.NORTH, textActLumb);
		layout.putConstraint(SpringLayout.EAST, lblActLumb, -10, SpringLayout.WEST, textActLumb);
		add(lblActLumb);
		
		JLabel lblActBrick = new JLabel("Brick:");
		layout.putConstraint(SpringLayout.NORTH, lblActBrick, 3, SpringLayout.NORTH, textActLumb);
		layout.putConstraint(SpringLayout.WEST, lblActBrick, 10, SpringLayout.EAST, textActLumb);
		add(lblActBrick);
		
		textActBrick = new JTextField();
		layout.putConstraint(SpringLayout.WEST, textActBrick, 10, SpringLayout.EAST, lblActBrick);
		textActBrick.setHorizontalAlignment(SwingConstants.RIGHT);
		textActBrick.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textActBrick, 0, SpringLayout.NORTH, textActLumb);
		add(textActBrick);
		textActBrick.setColumns(3);
		
		JLabel lblActIron = new JLabel("Iron:");
		layout.putConstraint(SpringLayout.NORTH, lblActIron, 3, SpringLayout.NORTH, textActBrick);
		layout.putConstraint(SpringLayout.WEST, lblActIron, 10, SpringLayout.EAST, textActBrick);
		add(lblActIron);
		
		textActIron = new JTextField();
		layout.putConstraint(SpringLayout.WEST, textActIron, 10, SpringLayout.EAST, lblActIron);
		textActIron.setHorizontalAlignment(SwingConstants.RIGHT);
		textActIron.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textActIron, 0, SpringLayout.NORTH, textActBrick);
		add(textActIron);
		textActIron.setColumns(3);
		
		JLabel lblActSheep = new JLabel("Sheep:");
		layout.putConstraint(SpringLayout.NORTH, lblActSheep, 3, SpringLayout.NORTH, textActIron);
		layout.putConstraint(SpringLayout.WEST, lblActSheep, 10, SpringLayout.EAST, textActIron);
		add(lblActSheep);
		
		textActSheep = new JTextField();
		layout.putConstraint(SpringLayout.WEST, textActSheep, 10, SpringLayout.EAST, lblActSheep);
		textActSheep.setHorizontalAlignment(SwingConstants.RIGHT);
		textActSheep.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textActSheep, 0, SpringLayout.NORTH, textActIron);
		add(textActSheep);
		textActSheep.setColumns(3);
		
		JLabel lblActWheat = new JLabel("Wheat:");
		layout.putConstraint(SpringLayout.NORTH, lblActWheat, 3, SpringLayout.NORTH, textActSheep);
		layout.putConstraint(SpringLayout.WEST, lblActWheat, 10, SpringLayout.EAST, textActSheep);
		add(lblActWheat);
		
		textActWheat = new JTextField();
		layout.putConstraint(SpringLayout.WEST, textActWheat, 10, SpringLayout.EAST, lblActWheat);
		textActWheat.setHorizontalAlignment(SwingConstants.RIGHT);
		textActWheat.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textActWheat, 0, SpringLayout.NORTH, textActSheep);
		add(textActWheat);
		textActWheat.setColumns(3);
		
		JLabel lblPassword = new JLabel("Password:");
		layout.putConstraint(SpringLayout.NORTH, lblPassword, 12, SpringLayout.SOUTH, lblActLumb);
		layout.putConstraint(SpringLayout.WEST, lblPassword, 0, SpringLayout.WEST, lblActLumb);
		add(lblPassword);
		
		actPlayPass = new JPasswordField();
		layout.putConstraint(SpringLayout.WEST, actPlayPass, 25, SpringLayout.EAST, lblPassword);
		actPlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, actPlayPass, 6, SpringLayout.SOUTH, textActLumb);
		add(actPlayPass);
		
		JButton actPlayLockOff = new JButton("Lock Offer");
		layout.putConstraint(SpringLayout.NORTH, actPlayLockOff, 0, SpringLayout.NORTH, actPlayPass);
		layout.putConstraint(SpringLayout.WEST, actPlayLockOff, 25, SpringLayout.EAST, actPlayPass);
		add(actPlayLockOff);
	}
}
