import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import javax.swing.JPanel;


public class GameBoardPanel extends JPanel {
	public GameBoardPanel(GameLogic gl) {
		this.gl = gl;
		this.hexRolls = gl.hexRolls;
	}
	
	//Keep these in a 30 60 90 ratio
	//Also try to make them ints
	private int a = 22;
	private int b = 38;
	private int c = 44;
	
	private int startX = 350;
	private int startY = 250;
	
	private GameLogic gl;
	
	private ArrayList<Integer> hexRolls;
	
	
	public void paint(Graphics g){
		
		Polygon bigHex = new Polygon();
		int bigX = (int) (startX - 5.90*b);
		int bigY = (int) (startY - 2.75*(a+c));
		bigHex.addPoint(bigX , bigY + b*6);
		bigHex.addPoint(bigX + 6*a, bigY );
		bigHex.addPoint(bigX + 6*(a+c), bigY );
		bigHex.addPoint(bigX + 6*2*c, bigY + 6*b);
		bigHex.addPoint(bigX + 6*(a+c), bigY + 6*2*b);
		bigHex.addPoint(bigX + 6*a, bigY + 6*2*b);
		g.setColor(Color.blue);
		g.fillPolygon(bigHex);
		
		
		//Set up board
		g.setColor(Color.magenta);
		g.fillPolygon(makeHex(startX - 4*b,startY));
		g.setColor(Color.white);
		g.fillPolygon(makeHex(startX + b,startY + a + c));
		g.fillPolygon(makeHex(startX - b, startY + a + c));
		g.fillPolygon(makeHex(startX + b*3, startY - (a + c) ));
		g.fillPolygon(makeHex(startX, startY - 2*(a + c) ));
		g.setColor(Color.green);
		g.fillPolygon(makeHex(startX + 2*b,startY ));
		g.fillPolygon(makeHex(startX + 2*b,startY + 2*(a + c)));
		g.fillPolygon(makeHex(startX - 2*b,startY ));
		g.fillPolygon(makeHex(startX - 2*b,startY - 2*(a + c)));
		g.setColor(Color.yellow);
		g.fillPolygon(makeHex(startX + 0*b,startY + 0*(a + c)));
		g.fillPolygon(makeHex(startX + 2*b,startY - 2*(a + c)));
		g.fillPolygon(makeHex(startX + 4*b,startY + 0*(a + c)));
		g.fillPolygon(makeHex(startX + 0*b,startY + 2*(a + c)));
		g.setColor(Color.red);
		g.fillPolygon(makeHex(startX + 1*b,startY - 1*(a + c)));
		g.fillPolygon(makeHex(startX - 3*b,startY - 1*(a + c)));
		g.fillPolygon(makeHex(startX - 3*b,startY + 1*(a + c)));
		g.setColor(Color.gray);
		g.fillPolygon(makeHex(startX - 1*b,startY - 1*(a + c)));
		g.fillPolygon(makeHex(startX + 3*b,startY + 1*(a + c)));
		g.fillPolygon(makeHex(startX - 2*b,startY + 2*(a + c)));
		
		//Draw border lines
		g.setColor(Color.black);
		g.drawPolygon(makeHex(startX - 4*b,startY));
		g.drawPolygon(makeHex(startX + b,startY + a + c));
		g.drawPolygon(makeHex(startX - b, startY + a + c));
		g.drawPolygon(makeHex(startX + b*3, startY - (a + c) ));
		g.drawPolygon(makeHex(startX, startY - 2*(a + c) ));
		g.drawPolygon(makeHex(startX + 2*b,startY ));
		g.drawPolygon(makeHex(startX + 2*b,startY + 2*(a + c)));
		g.drawPolygon(makeHex(startX - 2*b,startY ));
		g.drawPolygon(makeHex(startX - 2*b,startY - 2*(a + c)));
		g.drawPolygon(makeHex(startX + 0*b,startY + 0*(a + c)));
		g.drawPolygon(makeHex(startX + 2*b,startY - 2*(a + c)));
		g.drawPolygon(makeHex(startX + 4*b,startY + 0*(a + c)));
		g.drawPolygon(makeHex(startX + 0*b,startY + 2*(a + c)));
		g.drawPolygon(makeHex(startX + 1*b,startY - 1*(a + c)));
		g.drawPolygon(makeHex(startX - 3*b,startY - 1*(a + c)));
		g.drawPolygon(makeHex(startX - 3*b,startY + 1*(a + c)));
		g.drawPolygon(makeHex(startX - 1*b,startY - 1*(a + c)));
		g.drawPolygon(makeHex(startX + 3*b,startY + 1*(a + c)));
		g.drawPolygon(makeHex(startX - 2*b,startY + 2*(a + c)));
		
		
		//Draw Roll Thingies
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(214 + 2*b, 272, c, c);
		g.fillOval(214 + 4*b, 272, c, c);
		g.fillOval(214 + 6*b, 272, c, c);
		g.fillOval(214 + 8*b, 272, c, c);
		g.fillOval(214 + 1*b, 272 - (a + c), c, c);
		g.fillOval(214 + 3*b, 272 - (a + c), c, c);
		g.fillOval(214 + 5*b, 272 - (a + c), c, c);
		g.fillOval(214 + 7*b, 272 - (a + c), c, c);
		g.fillOval(214 + 2*b, 272 - 2*(a + c), c, c);
		g.fillOval(214 + 4*b, 272 - 2*(a + c), c, c);
		g.fillOval(214 + 6*b, 272 - 2*(a + c), c, c);
		g.fillOval(214 + 1*b, 272 + (a + c), c, c);
		g.fillOval(214 + 3*b, 272 + (a + c), c, c);
		g.fillOval(214 + 5*b, 272 + (a + c), c, c);
		g.fillOval(214 + 7*b, 272 + (a + c), c, c);
		g.fillOval(214 + 2*b, 272 + 2*(a + c), c, c);
		g.fillOval(214 + 4*b, 272 + 2*(a + c), c, c);
		g.fillOval(214 + 6*b, 272 + 2*(a + c), c, c);
		//Docks
		g.fillOval(214 + 5*b, 272 + 3*(a + c), c, c);
		g.fillOval(214 + 8*b, 272 + 2*(a + c), c, c);
		g.fillOval(214 + 1*b, 272 + 3*(a + c), c, c);
		g.fillOval(214 - 1*b, 272 + (a + c), c, c);
		g.fillOval(214 - 1*b, 272 - (a + c), c, c);
		g.fillOval(214 + 5*b, 272 - 3*(a + c), c, c);
		g.fillOval(214 + 8*b, 272 - 2*(a + c), c, c);
		g.fillOval(214 + 1*b, 272 - 3*(a + c), c, c);
		g.fillOval(214 + 10*b, 272 - 0*(a + c), c, c);
		
		g.setColor(Color.black);
		g.drawOval(214 + 2*b, 272, c, c);
		g.drawOval(214 + 4*b, 272, c, c);
		g.drawOval(214 + 6*b, 272, c, c);
		g.drawOval(214 + 8*b, 272, c, c);
		g.drawOval(214 + 1*b, 272 - (a + c), c, c);
		g.drawOval(214 + 3*b, 272 - (a + c), c, c);
		g.drawOval(214 + 5*b, 272 - (a + c), c, c);
		g.drawOval(214 + 7*b, 272 - (a + c), c, c);
		g.drawOval(214 + 2*b, 272 - 2*(a + c), c, c);
		g.drawOval(214 + 4*b, 272 - 2*(a + c), c, c);
		g.drawOval(214 + 6*b, 272 - 2*(a + c), c, c);
		g.drawOval(214 + 1*b, 272 + (a + c), c, c);
		g.drawOval(214 + 3*b, 272 + (a + c), c, c);
		g.drawOval(214 + 5*b, 272 + (a + c), c, c);
		g.drawOval(214 + 7*b, 272 + (a + c), c, c);
		g.drawOval(214 + 2*b, 272 + 2*(a + c), c, c);
		g.drawOval(214 + 4*b, 272 + 2*(a + c), c, c);
		g.drawOval(214 + 6*b, 272 + 2*(a + c), c, c);
		g.drawOval(214 + 5*b, 272 + 3*(a + c), c, c);
		g.drawOval(214 + 8*b, 272 + 2*(a + c), c, c);
		g.drawOval(214 + 1*b, 272 + 3*(a + c), c, c);
		g.drawOval(214 - 1*b, 272 + (a + c), c, c);
		g.drawOval(214 - 1*b, 272 - (a + c), c, c);
		g.drawOval(214 + 5*b, 272 - 3*(a + c), c, c);
		g.drawOval(214 + 8*b, 272 - 2*(a + c), c, c);
		g.drawOval(214 + 1*b, 272 - 3*(a + c), c, c);
		g.drawOval(214 + 10*b, 272 - 0*(a + c), c, c);
		
		g.setColor(Color.black);
		g.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		g.drawString(hexRolls.get(0).toString(), 301, 168);
		g.drawString(hexRolls.get(1).toString(), 301 + 2*b, 168);
		g.drawString(hexRolls.get(2).toString(), 301 + 4*b, 168);
		g.drawString(hexRolls.get(3).toString(), 301 - 1*b, 168 + (a+c));
		g.drawString(hexRolls.get(4).toString(), 301 + 1*b, 168 + (a+c));
		g.drawString(hexRolls.get(5).toString(), 301 + 3*b, 168 + (a+c));
		g.drawString(hexRolls.get(6).toString(), 301 + 5*b, 168 + (a+c));
		g.drawString(hexRolls.get(8).toString(), 301 + 0*b, 168 + 2*(a+c));
		g.drawString(hexRolls.get(9).toString(), 301 + 2*b, 168 + 2*(a+c));
		g.drawString(hexRolls.get(10).toString(), 301 + 4*b, 168 + 2*(a+c));
		g.drawString(hexRolls.get(11).toString(), 301 + 6*b, 168 + 2*(a+c));
		g.drawString(hexRolls.get(12).toString(), 301 - 1*b, 168 + 3*(a+c));
		g.drawString(hexRolls.get(13).toString(), 301 + 1*b, 168 + 3*(a+c));
		g.drawString(hexRolls.get(14).toString(), 301 + 3*b, 168 + 3*(a+c));
		g.drawString(hexRolls.get(15).toString(), 301 + 5*b, 168 + 3*(a+c));
		g.drawString(hexRolls.get(13).toString(), 301 + 0*b, 168 + 4*(a+c));
		g.drawString(hexRolls.get(14).toString(), 301 + 2*b, 168 + 4*(a+c));
		g.drawString(hexRolls.get(15).toString(), 301 + 4*b, 168 + 4*(a+c));
		//Once again, DOCKS
		g.drawString(" ?", 301 - 1*b, 168 - 1*(a+c));
		g.drawString(" S", 301 + 3*b, 168 - 1*(a+c));
		g.drawString(" ?", 301 + 6*b, 168 + 0*(a+c));
		g.drawString(" ?", 301 + 8*b, 168 + 2*(a+c));
		g.drawString(" B", 301 + 6*b, 168 + 4*(a+c)); 
		g.drawString(" ?", 301 - 1*b, 168 + 5*(a+c));
		g.drawString(" L", 301 + 3*b, 168 + 5*(a+c));
		g.drawString(" I", 301 - 3*b, 168 + 1*(a+c));
		g.drawString(" W", 301 - 3*b, 168 + 3*(a+c));
	}
	
	public Polygon makeHex(int x, int y){
		Polygon p = new Polygon();
		p.addPoint(x, y + a + c);
		p.addPoint(x , y + a);
		p.addPoint(x + b, y);
		p.addPoint(x + b + b, y + a);
		p.addPoint(x + b + b, y + a + c);
		p.addPoint(x + b, y + c + c);
		
		return p;
	}
	
	public void drawRoad(int player, int location, Graphics g){
		//make polygon
		//set color via player
		//giant switch statement
		//do this in game piece instead
	}
	
	
}
