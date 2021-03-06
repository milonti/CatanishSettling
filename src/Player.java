import java.awt.Color;
import java.util.ArrayList;


public class Player {
	String password;
	
	int iron;
	int brick;
	int lumber;
	int sheep;
	int wheat;
	
	int pNum;
	
	Color color;
	
	ArrayList<GamePiece> cities;

	public String name;

	public int soldierHand;
	public int monopolyHand;
	public int roadBuildHand;
	public int yearPlentyHand;
	public int victoryHand;

	public int victPoints;

	public int soldierPlayed;
	
	public Player(String n, String p){
		this.name = n;
		this.password = p;
		iron = 0;
		brick = 0;
		lumber = 0;
		sheep = 0;
		wheat = 0;
		soldierHand = 0;
		monopolyHand = 0;
		roadBuildHand = 0;
		yearPlentyHand = 0;
		victoryHand = 0;
		victPoints = 0;
		soldierPlayed = 0;
		cities = new ArrayList<GamePiece>();
		color = new Color(0, 0, 0);
		
	}

	public int getIron() {
		// TODO Auto-generated method stub
		return iron;
	}

	public int getWheat() {
		// TODO Auto-generated method stub
		return wheat;
	}

	public int getSheep() {
		// TODO Auto-generated method stub
		return sheep;
	}

	public int getLumber() {
		// TODO Auto-generated method stub
		return lumber;
	}

	public int getBrick() {
		// TODO Auto-generated method stub
		return brick;
	}
}
