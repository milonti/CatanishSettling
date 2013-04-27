import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;


public class ActivePlayerPanel extends JPanel {

	GameLogic gl;
	SpringLayout layout;
	private JButton trade;
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
	private JTextField woodT;
	private JTextField sheepT;
	private JTextField brickT;
	private JTextField ironT;
	private JTextField wheatT;
	private JTextField soldierT;
	private JTextField monopolyT;
	private JTextField roadT;
	private JTextField yearT;
	private JTextField victoryT;
	private JTextField woodTrade;
	private JTextField sheepTrade;
	private JTextField brickTrade;
	private JTextField ironTrade;
	private JTextField WheatTrade;
	private int playerNumber=1;//change this and afterwards to gamelogics
	private int woodI=1; 
	private int sheepI=1;
	private int brickI=1;
	private int ironI=1;
	private int wheatI=1;
	private int soldierI=1;
	private int monopolyI=1;
	private int roadI=1;
	private int yearI=1;
	private int victoryI=1;
	private int resources=woodI+sheepI+brickI+ironI+wheatI;
	
	
	
	public ActivePlayerPanel(GameLogic gl) {
		this.gl = gl;
		setPreferredSize(new Dimension(150, 700));
		layout = new SpringLayout();
		setLayout(layout);
		JLabel lblP1 = new JLabel("Active Player: "+playerNumber);
		layout.putConstraint(SpringLayout.NORTH, lblP1, 30, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, lblP1, 0, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, lblP1, 0, SpringLayout.EAST, this);
		lblP1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblP1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblP1);
		
		JSeparator p1Separator = new JSeparator();
		layout.putConstraint(SpringLayout.NORTH, p1Separator, 3, SpringLayout.SOUTH, lblP1);
		layout.putConstraint(SpringLayout.WEST, p1Separator, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, p1Separator, -10, SpringLayout.EAST, this);
		p1Separator.setForeground(Color.BLACK);
		add(p1Separator);
		
		JLabel lblP1cards = new JLabel("Total Cards:");
		layout.putConstraint(SpringLayout.NORTH, lblP1cards, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.WEST, lblP1cards, 0, SpringLayout.WEST, this);
		add(lblP1cards);
		
		textP1cards = new JTextField(resources);
		textP1cards.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, textP1cards, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, textP1cards, -15, SpringLayout.EAST, this);
		
		add(textP1cards);
		textP1cards.setColumns(3);
		
		JLabel wood = new JLabel("Wood: ");
		layout.putConstraint(SpringLayout.NORTH, wood, 0, SpringLayout.SOUTH, lblP1cards);
		layout.putConstraint(SpringLayout.WEST, wood, 0, SpringLayout.WEST, lblP1cards);
		add(wood);
		
		woodT = new JTextField(0);
		layout.putConstraint(SpringLayout.NORTH, woodT, 6, SpringLayout.SOUTH, textP1cards);
		layout.putConstraint(SpringLayout.EAST, woodT, -15, SpringLayout.EAST, this);
		woodT.setEditable(true);
		add(woodT);
		woodT.setColumns(3);
		
		JLabel sheep = new JLabel("Sheep:");
		layout.putConstraint(SpringLayout.NORTH, sheep, 3, SpringLayout.SOUTH, wood);
		layout.putConstraint(SpringLayout.WEST, wood, 0, SpringLayout.WEST, sheep);
		add(sheep);
		sheepT = new JTextField(0);
		sheepT.setEditable(true);
		layout.putConstraint(SpringLayout.NORTH, sheepT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, sheepT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, sheepT, 3, SpringLayout.NORTH, sheep);
		add(sheepT);
		sheepT.setColumns(3);
		JLabel brick = new JLabel("Brick: "+brickI);
		layout.putConstraint(SpringLayout.NORTH, brick, 3, SpringLayout.SOUTH, sheep);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, brick);
		add(brick);
		brickT = new JTextField(0);
		brickT.setEditable(true);
		layout.putConstraint(SpringLayout.NORTH, brickT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, brickT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, brickT, 3, SpringLayout.NORTH, brick);
		add(brickT);
		brickT.setColumns(3);
		JLabel iron = new JLabel("Iron: "+ironT);
		layout.putConstraint(SpringLayout.NORTH, iron, 3, SpringLayout.SOUTH, brick);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, iron);
		add(iron);
		ironT = new JTextField(0);
		ironT.setEditable(true);
		layout.putConstraint(SpringLayout.NORTH, ironT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, ironT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, ironT, 3, SpringLayout.NORTH, iron);
		add(ironT);
		ironT.setColumns(3);
		JLabel wheat = new JLabel("Wheat: "+wheatI);
		layout.putConstraint(SpringLayout.NORTH, wheat, 3, SpringLayout.SOUTH, iron);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, wheat);
		add(wheat);
		wheatT = new JTextField(0);
		wheatT.setEditable(true);
		layout.putConstraint(SpringLayout.NORTH, wheatT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, wheatT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, wheatT, 3, SpringLayout.NORTH, wheat);
		add(wheatT);
		wheatT.setColumns(3);
		JButton trade = new JButton("Trade");
		layout.putConstraint(SpringLayout.NORTH, trade, 3, SpringLayout.SOUTH, wheat);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, trade);
		add(trade);
		//after resources. knight cards, monopoly, road building, year of plenty, victory point
		JLabel soldier = new JLabel("Knight cards:");
		layout.putConstraint(SpringLayout.NORTH, soldier, 3, SpringLayout.SOUTH, trade);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, soldier);
		add(soldier);
		soldierT = new JTextField(soldierI);
		soldierT.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, soldierT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, soldierT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, soldierT, 3, SpringLayout.NORTH, soldier);
		add(soldierT);
		soldierT.setColumns(3);
		
		
		JLabel monopoly = new JLabel("monopoly cards:");
		layout.putConstraint(SpringLayout.NORTH, monopoly, 3, SpringLayout.SOUTH, soldier);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, monopoly);
		add(monopoly);
		monopolyT = new JTextField(monopolyI);
		monopolyT.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, monopolyT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, monopolyT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, monopolyT, 3, SpringLayout.NORTH, monopoly);
		add(monopolyT);
		monopolyT.setColumns(3);
		JLabel road = new JLabel("road cards:");
		layout.putConstraint(SpringLayout.NORTH, road, 3, SpringLayout.SOUTH, monopoly);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, road);
		add(road);
		roadT = new JTextField(roadI);
		roadT.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, roadT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, roadT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, roadT, 3, SpringLayout.NORTH, road);
		add(roadT);
		roadT.setColumns(3);
		JLabel year = new JLabel("year cards:");
		layout.putConstraint(SpringLayout.NORTH, year, 3, SpringLayout.SOUTH, road);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, year);
		add(year);
		yearT = new JTextField(yearI);
		yearT.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, yearT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, yearT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, yearT, 3, SpringLayout.NORTH, year);
		add(yearT);
		yearT.setColumns(3);
		JLabel victory = new JLabel("victory cards:");
		layout.putConstraint(SpringLayout.NORTH, victory, 3, SpringLayout.SOUTH, year);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, victory);
		add(victory);
		victoryT = new JTextField(victoryI);
		victoryT.setEditable(false);
		layout.putConstraint(SpringLayout.NORTH, victoryT, 3, SpringLayout.SOUTH, p1Separator);
		layout.putConstraint(SpringLayout.EAST, victoryT, -15, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, victoryT, 3, SpringLayout.NORTH, victory);
		add(victoryT);
		victoryT.setColumns(3);
		JLabel data1 = new JLabel("R: 1 wood 1 brick ");
		layout.putConstraint(SpringLayout.NORTH, data1, 3, SpringLayout.SOUTH, victory);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, data1);
		add(data1);
		JLabel data2 = new JLabel("C: 3 wheat 2 iron");
		layout.putConstraint(SpringLayout.NORTH, data2, 3, SpringLayout.SOUTH, data1);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, data2);
		add(data2);
		JLabel data3 = new JLabel("S: 1 brick 1 wood ");
		layout.putConstraint(SpringLayout.NORTH, data3, 3, SpringLayout.SOUTH, data2);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, data3);
		add(data3);
		JLabel data5 = new JLabel("     1 wheat 1 sheep");
		layout.putConstraint(SpringLayout.NORTH, data5, 3, SpringLayout.SOUTH, data3);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, data5);
		add(data5);
		JLabel data4 = new JLabel("D: 1 sheep 1 wheat 1 grain");
		layout.putConstraint(SpringLayout.NORTH, data4, 3, SpringLayout.SOUTH, data5);
		layout.putConstraint(SpringLayout.WEST, sheep, 0, SpringLayout.WEST, data4);
		add(data4);
		/*
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
	monopolybel lblP1devCards = new JLabel("Dev Cards:");
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
		*/
		
	}
	
	public void update(GameLogic l){
		//TODO
		this.gl = l;
		
	}
}
