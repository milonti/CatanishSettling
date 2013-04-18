import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;


public class GameLogic {
	public class GamePiece {
		/**
		 * road = 0
		 * settlement = 1
		 * city = 2
		 * thief = 3
		 */
		public int type;
		public int player;
		
		/**
		 * Road locations 0-71
		 * S/C locations 0-53
		 * Thief locations 0-18
		 */
		public int location;
	}
	
	ArrayList<GamePiece> allP;
	
	GamePiece thief;
	ArrayList<GamePiece> road;
	ArrayList<GamePiece> verts;
	
	/**
	 * IF YOU USE THIS YOU'RE A TERRIBLE PERSON
	 */
	ArrayList<ArrayList<Integer>> diceNums;
	
	ArrayList<Integer> hexRolls;
	
	public GameLogic(){
		thief = new GamePiece();
		thief.type = 3;
		thief.player = -1;
		
		road = new ArrayList<GamePiece>();
		verts = new ArrayList<GamePiece>(54);
		
			/*diceNums = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < 13; i++){
				diceNums.add(i, new ArrayList<Integer>());
			}
			diceNums.get(2).add(17);
			diceNums.get(3).add(15);
			diceNums.get(3).add(8);
			diceNums.get(4).add(10);
			diceNums.get(4).add(3);
			diceNums.get(5).add(16);
			diceNums.get(5).add(5);
			diceNums.get(6).add(18);
			diceNums.get(6).add(4);
			diceNums.get(8).add(11);
			diceNums.get(8).add(12);
			diceNums.get(9).add(14);
			diceNums.get(9).add(2);
			diceNums.get(10).add(13);
			diceNums.get(10).add(6);
			diceNums.get(11).add(9);
			diceNums.get(11).add(0);
			diceNums.get(12).add(1);*/
		
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
}
