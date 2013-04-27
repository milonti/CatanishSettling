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
	
	
	private String actPass;
	private String p1Pass;
	private String p2Pass;
	private String p3Pass;
	public boolean p3Locked;
	
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
		
		lblP1Offer = new JLabel("P1 Offers:");
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
		layout.putConstraint(SpringLayout.NORTH, lblP1Password, 3, SpringLayout.NORTH, P1PlayPass);
		layout.putConstraint(SpringLayout.WEST, P1PlayPass, 25, SpringLayout.EAST, lblP1Password);
		P1PlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, P1PlayPass, 6, SpringLayout.SOUTH, textP1Lumb);
		add(P1PlayPass);
		
		P1PlayLockOff = new JButton("Lock Offer");
		layout.putConstraint(SpringLayout.NORTH, P1PlayLockOff, -1, SpringLayout.NORTH, P1PlayPass);
		layout.putConstraint(SpringLayout.WEST, P1PlayLockOff, 25, SpringLayout.EAST, P1PlayPass);
		add(P1PlayLockOff);
		
		lblP2Offer = new JLabel("P2 Offers:");
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
		layout.putConstraint(SpringLayout.NORTH, lblP2Password, 3, SpringLayout.NORTH, P2PlayPass);
		layout.putConstraint(SpringLayout.WEST, P2PlayPass, 25, SpringLayout.EAST, lblP2Password);
		P2PlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, P2PlayPass, 6, SpringLayout.SOUTH, textP2Lumb);
		add(P2PlayPass);
		
		P2PlayLockOff = new JButton("Lock Offer");
		layout.putConstraint(SpringLayout.NORTH, P2PlayLockOff, -1, SpringLayout.NORTH, P2PlayPass);
		layout.putConstraint(SpringLayout.WEST, P2PlayLockOff, 25, SpringLayout.EAST, P2PlayPass);
		add(P2PlayLockOff);
		
		lblP3Offer = new JLabel("P3 Offers:");
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
		layout.putConstraint(SpringLayout.NORTH, lblP3Password, 3, SpringLayout.NORTH, P3PlayPass);
		layout.putConstraint(SpringLayout.WEST, P3PlayPass, 25, SpringLayout.EAST, lblP3Password);
		P3PlayPass.setColumns(8);
		layout.putConstraint(SpringLayout.NORTH, P3PlayPass, 6, SpringLayout.SOUTH, textP3Lumb);
		add(P3PlayPass);
		
		P3PlayLockOff = new JButton("Lock Offer");
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
		
		actPass = "woot";
		p1Pass = "toot";
		p2Pass = "loot";
		p3Pass = "boot";
		
		actPlayLockOff.addActionListener(new lockListener());
		actPlayLockOff.setActionCommand("activeLock");
		
		P1PlayLockOff.addActionListener(new lockListener());
		P1PlayLockOff.setActionCommand("p1Lock");
		P2PlayLockOff.addActionListener(new lockListener());
		P2PlayLockOff.setActionCommand("p2Lock");
		P3PlayLockOff.addActionListener(new lockListener());
		P3PlayLockOff.setActionCommand("p3Lock");
		
	}
	
	class lockListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("activeLock") && (new String(actPlayPass.getPassword()).equals(actPass))){
				for(JTextField j : actPlayFields){
					j.setEditable(false);
				}
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
				activeLocked = true;
			}
			if(e.getActionCommand().equals("p1Lock") && activeLocked && (new String(P1PlayPass.getPassword()).equals(p1Pass))){
				for(JTextField j : p1Fields){
					j.setEditable(false);
				}
				p1Locked = true;
			}
			if(e.getActionCommand().equals("p2Lock") && activeLocked && (new String(P2PlayPass.getPassword()).equals(p2Pass))){
				for(JTextField j : p2Fields){
					j.setEditable(false);
				}
				p2Locked = true;
			}
			if(e.getActionCommand().equals("p3Lock") && activeLocked && (new String(P3PlayPass.getPassword()).equals(p3Pass))){
				for(JTextField j : p3Fields){
					j.setEditable(false);
				}
				p3Locked = true;
			}
		}
		
	}
	
}
