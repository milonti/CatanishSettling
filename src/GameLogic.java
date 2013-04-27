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
	ArrayList<Resource> resDistr;
	ArrayList<Resource> portOrder;
	ArrayList<Vertex> SClocs;
	
	
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
		
		resDistr = new ArrayList<Resource>();
		// ordered from left to right, top to bottom.
		resDistr.add(new Resource("sheep"));
		resDistr.add(new Resource("wood"));
		resDistr.add(new Resource("wheat"));
		resDistr.add(new Resource("brick"));
		resDistr.add(new Resource("ore"));
		resDistr.add(new Resource("brick"));
		resDistr.add(new Resource("wood"));
		resDistr.add(new Resource("desert"));
		resDistr.add(new Resource("sheep"));
		resDistr.add(new Resource("wheat"));
		resDistr.add(new Resource("sheep"));
		resDistr.add(new Resource("wheat"));
		resDistr.add(new Resource("brick"));
		resDistr.add(new Resource("wood"));
		resDistr.add(new Resource("wood"));
		resDistr.add(new Resource("ore"));
		resDistr.add(new Resource("ore"));
		resDistr.add(new Resource("wheat"));
		resDistr.add(new Resource("sheep"));
		
		portOrder = new ArrayList<Resource>();
		// ordered from top left corner, clockwise.
		portOrder.add(new Resource("any"));
		portOrder.add(new Resource("sheep"));
		portOrder.add(new Resource("any"));
		portOrder.add(new Resource("any"));
		portOrder.add(new Resource("brick"));
		portOrder.add(new Resource("wood"));
		portOrder.add(new Resource("any"));
		portOrder.add(new Resource("wheat"));
		portOrder.add(new Resource("ore"));
		
		SClocs = new ArrayList<Vertex>();
		// ordered from left to right, top to bottom.
		// vertex's parameter order starts from above or top left, clockwise
		// v shaped triangle
		SClocs.add(new Vertex(-2-0, -1, 0));
		SClocs.add(new Vertex(-1, -2-1, 1));
		SClocs.add(new Vertex(-1, -1, 2));
		// ^ shaped triangle
		SClocs.add(new Vertex(-2-0, 0, -1));
		SClocs.add(new Vertex(-1, 1, 0));
		SClocs.add(new Vertex(-2-1, 2, 1));
		SClocs.add(new Vertex(-1, -1, 2));
		// v shaped triangle
		SClocs.add(new Vertex(-1, 0, 3));
		SClocs.add(new Vertex(0, 1, 4));
		SClocs.add(new Vertex(1, 2, 5));
		SClocs.add(new Vertex(2, -2-2, 6));
		// ^ shaped triangle
		SClocs.add(new Vertex(-1, 3, -2-8));
		SClocs.add(new Vertex(0, 4, 3));
		SClocs.add(new Vertex(1, 5, 4));
		SClocs.add(new Vertex(2, 6, 5));
		SClocs.add(new Vertex(-2-2, -1, 6));
		// v shaped triangle
		SClocs.add(new Vertex(-2-8, 3, 7));
		SClocs.add(new Vertex(3, 4, 8));
		SClocs.add(new Vertex(4, 5, 9));
		SClocs.add(new Vertex(5, 6, 10));
		SClocs.add(new Vertex(6, -1, 11));
		// ^ shaped triangle
		SClocs.add(new Vertex(-1, 7, -1));
		SClocs.add(new Vertex(3, 8, 7));
		SClocs.add(new Vertex(4, 9, 8));
		SClocs.add(new Vertex(5, 10, 9));
		SClocs.add(new Vertex(6, 11, 10));
		SClocs.add(new Vertex(-1, -2-3, 11));
		// v shaped triangle
		SClocs.add(new Vertex(-1, 7, -1));
		SClocs.add(new Vertex(7, 8, 12));
		SClocs.add(new Vertex(8, 9, 13));
		SClocs.add(new Vertex(9, 10, 14));
		SClocs.add(new Vertex(10, 11, 15));
		SClocs.add(new Vertex(11, -2-3, -1));
		// ^ shaped triangle
		SClocs.add(new Vertex(7, 12, -2-7));
		SClocs.add(new Vertex(8, 13, 12));
		SClocs.add(new Vertex(9, 14, 13));
		SClocs.add(new Vertex(10, 15, 14));
		SClocs.add(new Vertex(11, -1, 15));
		// v shaped triangle
		SClocs.add(new Vertex(-2-7, 12, -1));
		SClocs.add(new Vertex(12, 13, 16));
		SClocs.add(new Vertex(13, 14, 17));
		SClocs.add(new Vertex(14, 15, 18));
		SClocs.add(new Vertex(15, -1, -2-4));
		// ^ shaped triangle
		SClocs.add(new Vertex(12, 16, -1));
		SClocs.add(new Vertex(13, 17, 16));
		SClocs.add(new Vertex(14, 18, 17));
		SClocs.add(new Vertex(15, -2-4, 18));
		// v shaped triangle
		SClocs.add(new Vertex(-1, 16, -2-6));
		SClocs.add(new Vertex(16, 17, -1));
		SClocs.add(new Vertex(17, 18, -2-5));
		SClocs.add(new Vertex(18, -1, -1));
		// ^ shaped triangle
		SClocs.add(new Vertex(16, -1, -2-6));
		SClocs.add(new Vertex(17, -2-5, -1));
		SClocs.add(new Vertex(18, -1, -1));
		
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
