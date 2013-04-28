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
	private JTextField textP1Lumb;
	private JTextField textP1Brick;
	private JTextField textP1Iron;
	private JTextField textP1Sheep;
	private JTextField textP1Wheat;
	private JPasswordField P1PlayPass;
	private JTextField textP2Lumb;
	private JTextField textP2Brick;
	private JTextField textP2Iron;
	private JTextField textP2Sheep;
	private JTextField textP2Wheat;
	private JPasswordField P2PlayPass;
	private JTextField textP3Lumb;
	private JTextField textP3Brick;
	private JTextField textP3Iron;
	private JTextField textP3Sheep;
	private JTextField textP3Wheat;
	private JPasswordField P3PlayPass;
	private JLabel lblP1Wheat;
	private JSeparator P3PlaySep;
	private JLabel lblP2Wheat;
	private JLabel lblP3Offer;
	private JSeparator actPlaySep;
	private JLabel lblP2Iron;
	private JLabel lblP1Sheep;
	private JLabel lblActBrick;
	private JLabel lblActIron;
	private JLabel lblActSheep;
	private JLabel lblActWheat;
	private JLabel lblPassword;
	private JButton actPlayLockOff;
	private JLabel lblP1Offer;
	private JSeparator P1PlaySep;
	private JLabel lblP1Lumb;
	private JLabel lblP1Brick;
	private JLabel lblP1Iron;
	private JLabel lblP1Password;
	private JButton P1PlayLockOff;
	private JLabel lblP2Offer;
	private JSeparator P2PlaySep;
	private JLabel lblP2Lumb;
	private JLabel lblP2Brick;
	private JLabel lblP2Sheep;
	private JLabel lblP2Password;
	private JButton P2PlayLockOff;
	private Component lblP3Lumb;
	private JLabel lblP3Brick;
	private JLabel lblP3Iron;
	private JLabel lblP3Sheep;
	private JLabel lblP3Wheat;
	private JLabel lblP3Password;
	private JButton P3PlayLockOff;
	
	ArrayList<JTextField> actPlayFields;
	ArrayList<JTextField> p1Fields;
	ArrayList<JTextField> p2Fields;
	ArrayList<JTextField> p3Fields;
	public boolean activeLocked;
	public boolean p1Locked;
	public boolean p2Locked;
	public boolean p3Locked;
	
	private String actPass;
	private String p1Pass;
	private String p2Pass;
	private String p3Pass;
	
	
	private Player active;
	private Player p1;
	private Player p2;
	private Player p3;
	private JButton btnP1Acc;
	private JButton btnP2Acc;
	private JButton btnP3Acc;
	private JButton btnEndTrading;
	
	TradeWindow(int playerNum, GameLogic gl){
		this.gl = gl;
		this.activePlay = playerNum;
		
		active = gl.activeP;
		p1 = null;
		p2 = null;
		p3 = null;
		
		for(int i = 0; i < 4; i++){
			if(i == playerNum) continue;
			if(p1 == null) p1 = gl.playerList.get(i);
			else if(p2 == null) p2 = gl.playerList.get(i);
			else if(p3 == null) p3 = gl.playerList.get(i);
		}
		
		actPass = active.password;
		p1Pass = p1.password;
		p2Pass = p2.password;
		p3Pass = p3.password;
		
		layout = new SpringLayout();
		setLayout(layout);
		
		JLabel lblActOffer = new JLabel(active.name + " Offers:");
		lblActOffer.setFont(new Font("Tahoma", Font.BOLD, 12));
		layout.putConstraint(SpringLayout.NORTH, lblActOffer, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, lblActOffer, 10, SpringLayout.WEST, this);
		add(lblActOffer);
		
		actPlaySep = new JSeparator();
		layout.putConstraint(SpringLayout.NORTH, actPlaySep, 2, SpringLayout.SOUTH, lblActOffer);
		actPlaySep.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.WEST, actPlaySep, 0, SpringLayout.WEST, lblActOffer);
		layout.putConstraint(SpringLayout.EAST, actPlaySep, 20, SpringLayout.EAST, lblActOffer);
		add(actPlaySep);
		
		textActLumb = new JTextField();
		textActLumb.setHorizontalAlignment(SwingConstants.RIGHT);
		textActLumb.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textActLumb, 6, SpringLayout.SOUTH, actPlaySep);
		add(textActLumb);
		textActLumb.setColumns(3);
		
		JLabel lblActLumb = new JLabel("Lumber:");
		layout.putConstraint(SpringLayout.WEST, textActLumb, 10, SpringLayout.EAST, lblActLumb);
		layout.putConstraint(SpringLayout.NORTH, lblActLumb, 3, SpringLayout.NORTH, textActLumb);
		layout.putConstraint(SpringLayout.WEST, lblActLumb, 0, SpringLayout.WEST, lblActOffer);
		add(lblActLumb);
		
		lblActBrick = new JLabel("Brick:");
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
		
		lblActIron = new JLabel("Iron:");
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
		
		lblActSheep = new JLabel("Sheep:");
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
		
		lblActWheat = new JLabel("Wheat:");
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
		
		lblPassword = new JLabel("Password:");
		layout.putConstraint(SpringLayout.WEST, lblPassword, 0, SpringLayout.WEST, lblActLumb);
		add(lblPassword);
		
		actPlayPass = new JPasswordField();
		layout.putConstraint(SpringLayout.NORTH, lblPassword, 3, SpringLayout.NORTH, actPlayPass);
		layout.putConstraint(SpringLayout.WEST, actPlayPass, 25, SpringLayout.EAST, lblPassword);
		actPlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, actPlayPass, 6, SpringLayout.SOUTH, textActLumb);
		add(actPlayPass);
		
		actPlayLockOff = new JButton("Lock Offer");
		layout.putConstraint(SpringLayout.NORTH, actPlayLockOff, -1, SpringLayout.NORTH, actPlayPass);
		layout.putConstraint(SpringLayout.WEST, actPlayLockOff, 25, SpringLayout.EAST, actPlayPass);
		add(actPlayLockOff);
		
		lblP1Offer = new JLabel(p1.name + " Proposes:");
		layout.putConstraint(SpringLayout.NORTH, lblP1Offer, 10, SpringLayout.SOUTH, lblPassword);
		lblP1Offer.setFont(new Font("Tahoma", Font.BOLD, 12));
		layout.putConstraint(SpringLayout.WEST, lblP1Offer, 10, SpringLayout.WEST, this);
		add(lblP1Offer);
		
		P1PlaySep = new JSeparator();
		layout.putConstraint(SpringLayout.NORTH, P1PlaySep, 2, SpringLayout.SOUTH, lblP1Offer);
		P1PlaySep.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.WEST, P1PlaySep, 0, SpringLayout.WEST, lblP1Offer);
		layout.putConstraint(SpringLayout.EAST, P1PlaySep, 20, SpringLayout.EAST, lblP1Offer);
		add(P1PlaySep);
		
		textP1Lumb = new JTextField();
		textP1Lumb.setEditable(false);
		textP1Lumb.setHorizontalAlignment(SwingConstants.RIGHT);
		textP1Lumb.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP1Lumb, 6, SpringLayout.SOUTH, P1PlaySep);
		add(textP1Lumb);
		textP1Lumb.setColumns(3);
		
		lblP1Lumb = new JLabel("Lumber:");
		layout.putConstraint(SpringLayout.WEST, textP1Lumb, 10, SpringLayout.EAST, lblP1Lumb);
		layout.putConstraint(SpringLayout.NORTH, lblP1Lumb, 3, SpringLayout.NORTH, textP1Lumb);
		layout.putConstraint(SpringLayout.WEST, lblP1Lumb, 0, SpringLayout.WEST, lblP1Offer);
		add(lblP1Lumb);
		
		lblP1Brick = new JLabel("Brick:");
		layout.putConstraint(SpringLayout.NORTH, lblP1Brick, 3, SpringLayout.NORTH, textP1Lumb);
		layout.putConstraint(SpringLayout.WEST, lblP1Brick, 10, SpringLayout.EAST, textP1Lumb);
		add(lblP1Brick);
		
		textP1Brick = new JTextField();
		textP1Brick.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP1Brick, 10, SpringLayout.EAST, lblP1Brick);
		textP1Brick.setHorizontalAlignment(SwingConstants.RIGHT);
		textP1Brick.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP1Brick, 0, SpringLayout.NORTH, textP1Lumb);
		add(textP1Brick);
		textP1Brick.setColumns(3);
		
		lblP1Iron = new JLabel("Iron:");
		layout.putConstraint(SpringLayout.NORTH, lblP1Iron, 3, SpringLayout.NORTH, textP1Brick);
		layout.putConstraint(SpringLayout.WEST, lblP1Iron, 10, SpringLayout.EAST, textP1Brick);
		add(lblP1Iron);
		
		textP1Iron = new JTextField();
		textP1Iron.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP1Iron, 10, SpringLayout.EAST, lblP1Iron);
		textP1Iron.setHorizontalAlignment(SwingConstants.RIGHT);
		textP1Iron.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP1Iron, 0, SpringLayout.NORTH, textP1Brick);
		add(textP1Iron);
		textP1Iron.setColumns(3);
		
		lblP1Sheep = new JLabel("Sheep:");
		layout.putConstraint(SpringLayout.NORTH, lblP1Sheep, 3, SpringLayout.NORTH, textP1Iron);
		layout.putConstraint(SpringLayout.WEST, lblP1Sheep, 10, SpringLayout.EAST, textP1Iron);
		add(lblP1Sheep);
		
		textP1Sheep = new JTextField();
		textP1Sheep.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP1Sheep, 10, SpringLayout.EAST, lblP1Sheep);
		textP1Sheep.setHorizontalAlignment(SwingConstants.RIGHT);
		textP1Sheep.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP1Sheep, 0, SpringLayout.NORTH, textP1Iron);
		add(textP1Sheep);
		textP1Sheep.setColumns(3);
		
		lblP1Wheat = new JLabel("Wheat:");
		layout.putConstraint(SpringLayout.NORTH, lblP1Wheat, 3, SpringLayout.NORTH, textP1Sheep);
		layout.putConstraint(SpringLayout.WEST, lblP1Wheat, 10, SpringLayout.EAST, textP1Sheep);
		add(lblP1Wheat);
		
		textP1Wheat = new JTextField();
		textP1Wheat.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP1Wheat, 10, SpringLayout.EAST, lblP1Wheat);
		textP1Wheat.setHorizontalAlignment(SwingConstants.RIGHT);
		textP1Wheat.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP1Wheat, 0, SpringLayout.NORTH, textP1Sheep);
		add(textP1Wheat);
		textP1Wheat.setColumns(3);
		
		lblP1Password = new JLabel("Password:");
		layout.putConstraint(SpringLayout.WEST, lblP1Password, 0, SpringLayout.WEST, lblP1Lumb);
		add(lblP1Password);
		
		P1PlayPass = new JPasswordField();
		P1PlayPass.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, lblP1Password, 3, SpringLayout.NORTH, P1PlayPass);
		layout.putConstraint(SpringLayout.WEST, P1PlayPass, 25, SpringLayout.EAST, lblP1Password);
		P1PlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, P1PlayPass, 6, SpringLayout.SOUTH, textP1Lumb);
		add(P1PlayPass);
		
		P1PlayLockOff = new JButton("Lock Offer");
		P1PlayLockOff.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, P1PlayLockOff, -1, SpringLayout.NORTH, P1PlayPass);
		layout.putConstraint(SpringLayout.WEST, P1PlayLockOff, 25, SpringLayout.EAST, P1PlayPass);
		add(P1PlayLockOff);
		
		lblP2Offer = new JLabel(p2.name + " Proposes:");
		layout.putConstraint(SpringLayout.NORTH, lblP2Offer, 10, SpringLayout.SOUTH, lblP1Password);
		lblP2Offer.setFont(new Font("Tahoma", Font.BOLD, 12));
		layout.putConstraint(SpringLayout.WEST, lblP2Offer, 10, SpringLayout.WEST, this);
		add(lblP2Offer);
		
		P2PlaySep = new JSeparator();
		layout.putConstraint(SpringLayout.NORTH, P2PlaySep, 2, SpringLayout.SOUTH, lblP2Offer);
		P2PlaySep.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.WEST, P2PlaySep, 0, SpringLayout.WEST, lblP2Offer);
		layout.putConstraint(SpringLayout.EAST, P2PlaySep, 20, SpringLayout.EAST, lblP2Offer);
		add(P2PlaySep);
		
		textP2Lumb = new JTextField();
		textP2Lumb.setEditable(false);
		textP2Lumb.setHorizontalAlignment(SwingConstants.RIGHT);
		textP2Lumb.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP2Lumb, 6, SpringLayout.SOUTH, P2PlaySep);
		add(textP2Lumb);
		textP2Lumb.setColumns(3);
		
		lblP2Lumb = new JLabel("Lumber:");
		layout.putConstraint(SpringLayout.WEST, textP2Lumb, 10, SpringLayout.EAST, lblP2Lumb);
		layout.putConstraint(SpringLayout.NORTH, lblP2Lumb, 3, SpringLayout.NORTH, textP2Lumb);
		layout.putConstraint(SpringLayout.WEST, lblP2Lumb, 0, SpringLayout.WEST, lblP2Offer);
		add(lblP2Lumb);
		
		lblP2Brick = new JLabel("Brick:");
		layout.putConstraint(SpringLayout.NORTH, lblP2Brick, 3, SpringLayout.NORTH, textP2Lumb);
		layout.putConstraint(SpringLayout.WEST, lblP2Brick, 10, SpringLayout.EAST, textP2Lumb);
		add(lblP2Brick);
		
		textP2Brick = new JTextField();
		textP2Brick.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP2Brick, 10, SpringLayout.EAST, lblP2Brick);
		textP2Brick.setHorizontalAlignment(SwingConstants.RIGHT);
		textP2Brick.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP2Brick, 0, SpringLayout.NORTH, textP2Lumb);
		add(textP2Brick);
		textP2Brick.setColumns(3);
		
		lblP2Iron = new JLabel("Iron:");
		layout.putConstraint(SpringLayout.NORTH, lblP2Iron, 3, SpringLayout.NORTH, textP2Brick);
		layout.putConstraint(SpringLayout.WEST, lblP2Iron, 10, SpringLayout.EAST, textP2Brick);
		add(lblP2Iron);
		
		textP2Iron = new JTextField();
		textP2Iron.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP2Iron, 10, SpringLayout.EAST, lblP2Iron);
		textP2Iron.setHorizontalAlignment(SwingConstants.RIGHT);
		textP2Iron.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP2Iron, 0, SpringLayout.NORTH, textP2Brick);
		add(textP2Iron);
		textP2Iron.setColumns(3);
		
		lblP2Sheep = new JLabel("Sheep:");
		layout.putConstraint(SpringLayout.NORTH, lblP2Sheep, 3, SpringLayout.NORTH, textP2Iron);
		layout.putConstraint(SpringLayout.WEST, lblP2Sheep, 10, SpringLayout.EAST, textP2Iron);
		add(lblP2Sheep);
		
		textP2Sheep = new JTextField();
		textP2Sheep.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP2Sheep, 10, SpringLayout.EAST, lblP2Sheep);
		textP2Sheep.setHorizontalAlignment(SwingConstants.RIGHT);
		textP2Sheep.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP2Sheep, 0, SpringLayout.NORTH, textP2Iron);
		add(textP2Sheep);
		textP2Sheep.setColumns(3);
		
		lblP2Wheat = new JLabel("Wheat:");
		layout.putConstraint(SpringLayout.NORTH, lblP2Wheat, 3, SpringLayout.NORTH, textP2Sheep);
		layout.putConstraint(SpringLayout.WEST, lblP2Wheat, 10, SpringLayout.EAST, textP2Sheep);
		add(lblP2Wheat);
		
		textP2Wheat = new JTextField();
		textP2Wheat.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP2Wheat, 10, SpringLayout.EAST, lblP2Wheat);
		textP2Wheat.setHorizontalAlignment(SwingConstants.RIGHT);
		textP2Wheat.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP2Wheat, 0, SpringLayout.NORTH, textP2Sheep);
		add(textP2Wheat);
		textP2Wheat.setColumns(3);
		
		lblP2Password = new JLabel("Password:");
		layout.putConstraint(SpringLayout.WEST, lblP2Password, 0, SpringLayout.WEST, lblP2Lumb);
		add(lblP2Password);
		
		P2PlayPass = new JPasswordField();
		P2PlayPass.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, lblP2Password, 3, SpringLayout.NORTH, P2PlayPass);
		layout.putConstraint(SpringLayout.WEST, P2PlayPass, 25, SpringLayout.EAST, lblP2Password);
		P2PlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, P2PlayPass, 6, SpringLayout.SOUTH, textP2Lumb);
		add(P2PlayPass);
		
		P2PlayLockOff = new JButton("Lock Offer");
		P2PlayLockOff.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, P2PlayLockOff, -1, SpringLayout.NORTH, P2PlayPass);
		layout.putConstraint(SpringLayout.WEST, P2PlayLockOff, 25, SpringLayout.EAST, P2PlayPass);
		add(P2PlayLockOff);
		
		lblP3Offer = new JLabel(p3.name + " Proposes:");
		layout.putConstraint(SpringLayout.NORTH, lblP3Offer, 10, SpringLayout.SOUTH, lblP2Password);
		lblP3Offer.setFont(new Font("Tahoma", Font.BOLD, 12));
		layout.putConstraint(SpringLayout.WEST, lblP3Offer, 10, SpringLayout.WEST, this);
		add(lblP3Offer);
		
		P3PlaySep = new JSeparator();
		layout.putConstraint(SpringLayout.NORTH, P3PlaySep, 2, SpringLayout.SOUTH, lblP3Offer);
		P3PlaySep.setForeground(Color.BLACK);
		layout.putConstraint(SpringLayout.WEST, P3PlaySep, 0, SpringLayout.WEST, lblP3Offer);
		layout.putConstraint(SpringLayout.EAST, P3PlaySep, 20, SpringLayout.EAST, lblP3Offer);
		add(P3PlaySep);
		
		textP3Lumb = new JTextField();
		textP3Lumb.setEditable(false);
		textP3Lumb.setHorizontalAlignment(SwingConstants.RIGHT);
		textP3Lumb.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP3Lumb, 6, SpringLayout.SOUTH, P3PlaySep);
		add(textP3Lumb);
		textP3Lumb.setColumns(3);
		
		lblP3Lumb = new JLabel("Lumber:");
		layout.putConstraint(SpringLayout.WEST, textP3Lumb, 10, SpringLayout.EAST, lblP3Lumb);
		layout.putConstraint(SpringLayout.NORTH, lblP3Lumb, 3, SpringLayout.NORTH, textP3Lumb);
		layout.putConstraint(SpringLayout.WEST, lblP3Lumb, 0, SpringLayout.WEST, lblP3Offer);
		add(lblP3Lumb);
		
		lblP3Brick = new JLabel("Brick:");
		layout.putConstraint(SpringLayout.NORTH, lblP3Brick, 3, SpringLayout.NORTH, textP3Lumb);
		layout.putConstraint(SpringLayout.WEST, lblP3Brick, 10, SpringLayout.EAST, textP3Lumb);
		add(lblP3Brick);
		
		textP3Brick = new JTextField();
		textP3Brick.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP3Brick, 10, SpringLayout.EAST, lblP3Brick);
		textP3Brick.setHorizontalAlignment(SwingConstants.RIGHT);
		textP3Brick.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP3Brick, 0, SpringLayout.NORTH, textP3Lumb);
		add(textP3Brick);
		textP3Brick.setColumns(3);
		
		lblP3Iron = new JLabel("Iron:");
		layout.putConstraint(SpringLayout.NORTH, lblP3Iron, 3, SpringLayout.NORTH, textP3Brick);
		layout.putConstraint(SpringLayout.WEST, lblP3Iron, 10, SpringLayout.EAST, textP3Brick);
		add(lblP3Iron);
		
		textP3Iron = new JTextField();
		textP3Iron.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP3Iron, 10, SpringLayout.EAST, lblP3Iron);
		textP3Iron.setHorizontalAlignment(SwingConstants.RIGHT);
		textP3Iron.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP3Iron, 0, SpringLayout.NORTH, textP3Brick);
		add(textP3Iron);
		textP3Iron.setColumns(3);
		
		lblP3Sheep = new JLabel("Sheep:");
		layout.putConstraint(SpringLayout.NORTH, lblP3Sheep, 3, SpringLayout.NORTH, textP3Iron);
		layout.putConstraint(SpringLayout.WEST, lblP3Sheep, 10, SpringLayout.EAST, textP3Iron);
		add(lblP3Sheep);
		
		textP3Sheep = new JTextField();
		textP3Sheep.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP3Sheep, 10, SpringLayout.EAST, lblP3Sheep);
		textP3Sheep.setHorizontalAlignment(SwingConstants.RIGHT);
		textP3Sheep.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP3Sheep, 0, SpringLayout.NORTH, textP3Iron);
		add(textP3Sheep);
		textP3Sheep.setColumns(3);
		
		lblP3Wheat = new JLabel("Wheat:");
		layout.putConstraint(SpringLayout.NORTH, lblP3Wheat, 3, SpringLayout.NORTH, textP3Sheep);
		layout.putConstraint(SpringLayout.WEST, lblP3Wheat, 10, SpringLayout.EAST, textP3Sheep);
		add(lblP3Wheat);
		
		textP3Wheat = new JTextField();
		textP3Wheat.setEditable(false);
		layout.putConstraint(SpringLayout.WEST, textP3Wheat, 10, SpringLayout.EAST, lblP3Wheat);
		textP3Wheat.setHorizontalAlignment(SwingConstants.RIGHT);
		textP3Wheat.setText("0");
		layout.putConstraint(SpringLayout.NORTH, textP3Wheat, 0, SpringLayout.NORTH, textP3Sheep);
		add(textP3Wheat);
		textP3Wheat.setColumns(3);
		
		lblP3Password = new JLabel("Password:");
		layout.putConstraint(SpringLayout.WEST, lblP3Password, 0, SpringLayout.WEST, lblP3Lumb);
		add(lblP3Password);
		
		P3PlayPass = new JPasswordField();
		P3PlayPass.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, lblP3Password, 3, SpringLayout.NORTH, P3PlayPass);
		layout.putConstraint(SpringLayout.WEST, P3PlayPass, 25, SpringLayout.EAST, lblP3Password);
		P3PlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, P3PlayPass, 6, SpringLayout.SOUTH, textP3Lumb);
		add(P3PlayPass);
		
		P3PlayLockOff = new JButton("Lock Offer");
		P3PlayLockOff.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, P3PlayLockOff, -1, SpringLayout.NORTH, P3PlayPass);
		layout.putConstraint(SpringLayout.WEST, P3PlayLockOff, 25, SpringLayout.EAST, P3PlayPass);
		add(P3PlayLockOff);
		
		actPlayFields = new ArrayList<JTextField>();
		p1Fields = new ArrayList<JTextField>();
		p2Fields = new ArrayList<JTextField>();
		p3Fields = new ArrayList<JTextField>();
		
		actPlayFields.add(textActBrick);
		actPlayFields.add(textActIron);
		actPlayFields.add(textActLumb);
		actPlayFields.add(textActSheep);
		actPlayFields.add(textActWheat);
		
		p1Fields.add(textP1Brick);
		p1Fields.add(textP1Iron);
		p1Fields.add(textP1Lumb);
		p1Fields.add(textP1Sheep);
		p1Fields.add(textP1Wheat);
		
		p2Fields.add(textP2Brick);
		p2Fields.add(textP2Iron);
		p2Fields.add(textP2Lumb);
		p2Fields.add(textP2Sheep);
		p2Fields.add(textP2Wheat);
		
		p3Fields.add(textP3Brick);
		p3Fields.add(textP3Iron);
		p3Fields.add(textP3Lumb);
		p3Fields.add(textP3Sheep);
		p3Fields.add(textP3Wheat);
		
		activeLocked = false;
		
		
		actPlayLockOff.addActionListener(new lockListener());
		actPlayLockOff.setActionCommand("activeLock");
		
		P1PlayLockOff.addActionListener(new lockListener());
		P1PlayLockOff.setActionCommand("p1Lock");
		P2PlayLockOff.addActionListener(new lockListener());
		P2PlayLockOff.setActionCommand("p2Lock");
		P3PlayLockOff.addActionListener(new lockListener());
		P3PlayLockOff.setActionCommand("p3Lock");
		
		btnP1Acc = new JButton("Accept Offer");
		btnP1Acc.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, btnP1Acc, 0, SpringLayout.NORTH, P1PlayLockOff);
		layout.putConstraint(SpringLayout.WEST, btnP1Acc, 0, SpringLayout.WEST, textActSheep);
		add(btnP1Acc);
		btnP1Acc.addActionListener(new tradeListener());
		btnP1Acc.setActionCommand("1");
		
		btnP2Acc = new JButton("Accept Offer");
		layout.putConstraint(SpringLayout.NORTH, btnP2Acc, 0, SpringLayout.NORTH, P2PlayLockOff);
		layout.putConstraint(SpringLayout.WEST, btnP2Acc, 0, SpringLayout.WEST, btnP1Acc);
		btnP2Acc.setEnabled(false);
		add(btnP2Acc);
		btnP2Acc.addActionListener(new tradeListener());
		btnP2Acc.setActionCommand("2");
		
		btnP3Acc = new JButton("Accept Offer");
		btnP3Acc.setEnabled(false);
		layout.putConstraint(SpringLayout.NORTH, btnP3Acc, 0, SpringLayout.NORTH, P3PlayLockOff);
		layout.putConstraint(SpringLayout.WEST, btnP3Acc, 0, SpringLayout.WEST, btnP2Acc);
		add(btnP3Acc);
		btnP3Acc.addActionListener(new tradeListener());
		btnP3Acc.setActionCommand("3");
		
		btnEndTrading = new JButton("End Trading");
		layout.putConstraint(SpringLayout.NORTH, btnEndTrading, 0, SpringLayout.NORTH, actPlayLockOff);
		layout.putConstraint(SpringLayout.WEST, btnEndTrading, 0, SpringLayout.WEST, btnP1Acc);
		add(btnEndTrading);
		btnEndTrading.addActionListener(new endTrading());
		
		
	}
	
	public boolean validateResources(int playerNum){
		
		if(playerNum == 0){
			int iron = Integer.parseInt(textActIron.getText());
			if(!(iron <= active.getIron())) return false;
			int brick = Integer.parseInt(textActBrick.getText());
			if(!(brick <= active.getBrick())) return false;
			int lumber = Integer.parseInt(textActLumb.getText());
			if(!(lumber <= active.getLumber())) return false;
			int sheep = Integer.parseInt(textActSheep.getText());
			if(!(sheep <= active.getSheep())) return false;
			int wheat = Integer.parseInt(textActWheat.getText());
			if(!(wheat <= active.getWheat())) return false;
		}
		if(playerNum == 1){
			int iron = Integer.parseInt(textP1Iron.getText());
			if(!(iron <= p1.getIron())) return false;
			int brick = Integer.parseInt(textP1Brick.getText());
			if(!(brick <= p1.getBrick())) return false;
			int lumber = Integer.parseInt(textP1Lumb.getText());
			if(!(lumber <= p1.getLumber())) return false;
			int sheep = Integer.parseInt(textP1Sheep.getText());
			if(!(sheep <= p1.getSheep())) return false;
			int wheat = Integer.parseInt(textP1Wheat.getText());
			if(!(wheat <= p1.getWheat())) return false;
		}
		if(playerNum == 2){
			int iron = Integer.parseInt(textP2Iron.getText());
			if(!(iron <= p2.getIron())) return false;
			int brick = Integer.parseInt(textP2Brick.getText());
			if(!(brick <= p2.getBrick())) return false;
			int lumber = Integer.parseInt(textP2Lumb.getText());
			if(!(lumber <= p2.getLumber())) return false;
			int sheep = Integer.parseInt(textP2Sheep.getText());
			if(!(sheep <= p2.getSheep())) return false;
			int wheat = Integer.parseInt(textP2Wheat.getText());
			if(!(wheat <= p2.getWheat())) return false;
		}
		if(playerNum == 3){
			int iron = Integer.parseInt(textP3Iron.getText());
			if(!(iron <= p3.getIron())) return false;
			int brick = Integer.parseInt(textP3Brick.getText());
			if(!(brick <= p3.getBrick())) return false;
			int lumber = Integer.parseInt(textP3Lumb.getText());
			if(!(lumber <= p3.getLumber())) return false;
			int sheep = Integer.parseInt(textP3Sheep.getText());
			if(!(sheep <= p3.getSheep())) return false;
			int wheat = Integer.parseInt(textP3Wheat.getText());
			if(!(wheat <= p3.getWheat())) return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @param aiNum
	 * @param offers Length 5 array in the order lumber, brick, iron, sheep, wheat
	 */
	public void aiOffer(int aiNum, int[] offers){
		if(active.equals(gl.playerList.get(aiNum))){
			textActLumb.setText("" + offers[0]);
			textActBrick.setText("" + offers[1]);
			textActIron.setText("" + offers[2]);
			textActSheep.setText("" + offers[3]);
			textActWheat.setText("" + offers[4]);
			actPlayPass.setText(active.password);
			actPlayLockOff.getActionListeners()[0].actionPerformed(new ActionEvent(actPlayLockOff, ActionEvent.ACTION_PERFORMED, "activeLock"));
		}
		else if(p1.equals(gl.playerList.get(aiNum))){
			textP1Lumb.setText("" + offers[0]);
			textP1Brick.setText("" + offers[1]);
			textP1Iron.setText("" + offers[2]);
			textP1Sheep.setText("" + offers[3]);
			textP1Wheat.setText("" + offers[4]);
			P1PlayPass.setText(p1.password);
			P1PlayLockOff.getActionListeners()[0].actionPerformed(new ActionEvent(P1PlayLockOff, ActionEvent.ACTION_PERFORMED, "p1Lock"));
		}
		else if(p2.equals(gl.playerList.get(aiNum))){
			textP2Lumb.setText("" + offers[0]);
			textP2Brick.setText("" + offers[1]);
			textP2Iron.setText("" + offers[2]);
			textP2Sheep.setText("" + offers[3]);
			textP2Wheat.setText("" + offers[4]);
			P2PlayPass.setText(p2.password);
			P2PlayLockOff.getActionListeners()[0].actionPerformed(new ActionEvent(P2PlayLockOff, ActionEvent.ACTION_PERFORMED, "p2Lock"));
		}
		else if(p3.equals(gl.playerList.get(aiNum))){
			textP3Lumb.setText("" + offers[0]);
			textP3Brick.setText("" + offers[1]);
			textP3Iron.setText("" + offers[2]);
			textP3Sheep.setText("" + offers[3]);
			textP3Wheat.setText("" + offers[4]);
			P3PlayPass.setText(p3.password);
			P3PlayLockOff.getActionListeners()[0].actionPerformed(new ActionEvent(P3PlayLockOff, ActionEvent.ACTION_PERFORMED, "p3Lock"));
		}
	}
	
	class lockListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("activeLock") && (new String(actPlayPass.getPassword()).equals(actPass)) && validateResources(0)){
				for(JTextField j : actPlayFields){
					j.setEditable(false);
				}
				actPlayPass.setEditable(false);
				actPlayLockOff.setEnabled(false);
				for(JTextField j : p1Fields){
					j.setEditable(true);
				}
				for(JTextField j : p2Fields){
					j.setEditable(true);
				}
				for(JTextField j : p3Fields){
					j.setEditable(true);
				}
				gl.sendTrade();
				P1PlayLockOff.setEnabled(true);
				P1PlayPass.setEnabled(true);
				P2PlayLockOff.setEnabled(true);
				P2PlayPass.setEnabled(true);
				P3PlayLockOff.setEnabled(true);
				P3PlayPass.setEnabled(true);
				activeLocked = true;
			}
			if(e.getActionCommand().equals("p1Lock") && activeLocked && (new String(P1PlayPass.getPassword()).equals(p1Pass)) && validateResources(1)){
				for(JTextField j : p1Fields){
					j.setEditable(false);
				}
				P1PlayPass.setEditable(false);
				P1PlayLockOff.setEnabled(false);
				p1Locked = true;
			}
			if(e.getActionCommand().equals("p2Lock") && activeLocked && (new String(P2PlayPass.getPassword()).equals(p2Pass)) && validateResources(2)){
				for(JTextField j : p2Fields){
					j.setEditable(false);
				}
				P2PlayPass.setEditable(false);
				P2PlayLockOff.setEnabled(false);
				p2Locked = true;
			}
			if(e.getActionCommand().equals("p3Lock") && activeLocked && (new String(P3PlayPass.getPassword()).equals(p3Pass)) && validateResources(3)){
				for(JTextField j : p3Fields){
					j.setEditable(false);
				}
				P3PlayPass.setEditable(false);
				P3PlayLockOff.setEnabled(false);
				p3Locked = true;
			}
			if(p3Locked && p2Locked && p1Locked){
				btnP1Acc.setEnabled(true);
				btnP2Acc.setEnabled(true);
				btnP3Acc.setEnabled(true);
			}
		}
		
	}

	class tradeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(! (activeLocked && p1Locked && p2Locked && p3Locked)) return;	
			if(!(new String(actPlayPass.getPassword()).equals(actPass))) return;
			
			int source = Integer.parseInt(e.getActionCommand());
			
			int aIron  = Integer.parseInt(textActIron.getText());
			int aBrick = Integer.parseInt(textActBrick.getText());
			int aSheep = Integer.parseInt(textActSheep.getText());
			int aLumb  = Integer.parseInt(textActLumb.getText());
			int aWheat = Integer.parseInt(textActWheat.getText());
			
			int oIron = 0;
			int oBrick = 0;
			int oSheep = 0;
			int oLumb = 0;
			int oWheat = 0;
			
			Player tradee = active;
			
			if(source == 1){
				oIron  = Integer.parseInt(textP1Iron.getText());
				oBrick = Integer.parseInt(textP1Brick.getText());
				oSheep = Integer.parseInt(textP1Sheep.getText());
				oLumb  = Integer.parseInt(textP1Lumb.getText());
				oWheat = Integer.parseInt(textP1Wheat.getText());
				tradee = p1;
			}
			else if(source == 2){
				oIron  = Integer.parseInt(textP2Iron.getText());
				oBrick = Integer.parseInt(textP2Brick.getText());
				oSheep = Integer.parseInt(textP2Sheep.getText());
				oLumb  = Integer.parseInt(textP2Lumb.getText());
				oWheat = Integer.parseInt(textP2Wheat.getText());
				tradee = p2;
			}
			else if(source == 3){
				oIron  = Integer.parseInt(textP3Iron.getText());
				oBrick = Integer.parseInt(textP3Brick.getText());
				oSheep = Integer.parseInt(textP3Sheep.getText());
				oLumb  = Integer.parseInt(textP3Lumb.getText());
				oWheat = Integer.parseInt(textP3Wheat.getText());
				tradee = p3;
			}
			
			tradee.iron   += aIron;
			tradee.brick  += aBrick;
			tradee.lumber += aLumb;
			tradee.sheep  += aSheep;
			tradee.wheat  += aWheat;
			
			tradee.iron   -= oIron;
			tradee.brick  -= oBrick;
			tradee.lumber -= oLumb;
			tradee.sheep  -= oSheep;
			tradee.wheat  -= oWheat;
			
			active.iron   -= aIron;
			active.brick  -= aBrick;
			active.lumber -= aLumb;
			active.sheep  -= aSheep;
			active.wheat  -= aWheat;
			
			active.iron   += oIron;
			active.brick  += oBrick;
			active.lumber += oLumb;
			active.sheep  += oSheep;
			active.wheat  += oWheat;
			
			gl.endTrade();
		}
		
	}
	
	class endTrading implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			gl.endTrade();
			
		}
		
	}
}
