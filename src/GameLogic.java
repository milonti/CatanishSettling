import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import javax.swing.JFrame;


public class GameLogic {
	
	private ActivePlayerPanel ActivePlayer;
	private GameBoardPanel GameBoard;
	private OtherPlayerPanel OtherPlayers;
	private ChatPanel ChatPanel;
	private GameStatusPanel StateOfGamePanel;
	private MainGamePanel MainGamePanel;
	private JFrame tFrame;
	
	ArrayList<GamePiece> allP;
	
	GamePiece thief;
	ArrayList<GamePiece> road;
	ArrayList<GamePiece> verts;
	
	String activePlayer = null;
	
	ArrayList<String> playerList;
	
	
	ArrayList<Integer> hexRolls;
	
	
	public GameLogic(){
		thief = new GamePiece();
		thief.type = 3;
		thief.player = -1;
		
		road = new ArrayList<GamePiece>();
		verts = new ArrayList<GamePiece>(54);
		
		
		hexRolls = new ArrayList<Integer>();
		hexRolls.add(11);
		hexRolls.add(12);
		hexRolls.add(9);
		hexRolls.add(4);
		hexRolls.add(6);
		hexRolls.add(5);
		hexRolls.add(10);
		hexRolls.add(null);
		hexRolls.add(3);
		hexRolls.add(11);
		hexRolls.add(4);
		hexRolls.add(8);
		hexRolls.add(8);
		hexRolls.add(10);
		hexRolls.add(9);
		hexRolls.add(3);
		hexRolls.add(5);
		hexRolls.add(2);
		hexRolls.add(6);
		
		ActivePlayer = null;
		GameBoard = null;
		OtherPlayers = null;
		ChatPanel = null;
		StateOfGamePanel = null;
		
		
		
		
	
	}

	public String getActivePlayer() {
		return activePlayer;
	}

	public void newChatMessage(String string) {
		ChatPanel.addMessage(string);
	}

	public void setPanels(GameBoardPanel g,
			GameStatusPanel s, ActivePlayerPanel a,
			OtherPlayerPanel o, ChatPanel c, MainGamePanel m) {
		this.ActivePlayer = a;
		this.GameBoard = g;
		this.OtherPlayers = o;
		this.ChatPanel = c;
		this.StateOfGamePanel = s;
		this.MainGamePanel = m;
		
		
	}

	public void startTrade(int activePlayerNum) {
		MainGamePanel.setVisible(false);
		tFrame = new JFrame("Trade Window");
		TradeWindow tPanel = new TradeWindow(activePlayerNum, this);
		tFrame.setBounds(100, 100, 900, 750);
		tFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tFrame.add(tPanel);
		tFrame.setVisible(true);
		
	}
	
	public void endTrade(){
		tFrame.dispose();
		tFrame = null;
		MainGamePanel.setVisible(true);
	}
	
}
