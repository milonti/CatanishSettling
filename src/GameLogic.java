import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;


public class GameLogic {
	
	
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
		
		
		
		
		
	
	}

	public String getActivePlayer() {
		
		return activePlayer;
	}
}
