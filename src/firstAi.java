import java.util.ArrayList;
import java.util.PriorityQueue;


public class firstAi 
{
	GameLogic gl;
	
	double Ir,Lr,Wr,Sr,Br;//ratios
	double Id=0.5;
	double Ld=0.5;
	double Wd=0.5;
	double Sd=0.5;
	double Bd=0.5;
	
	int I,L,W,S,B,playerID;//current values;
	public firstAi(GameLogic gl,int playerID)
	{
		
		this.gl=gl;
		this.playerID=playerID;
		
	}
	
	public void takeTurn(GameLogic gl)
	{
		this.gl=gl;
		updateRatios();
		updateMe();
		
	}
	public void updateRatios()
	{
		Ir=0;
		Lr=0;
		Wr=0;
		Sr=0;
		Br=0;
		for(GamePiece p:gl.verts)
		{
			if((p.type==1||p.type==2)&&p.player==playerID)
			{
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex1).type==0)Lr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex1))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex1).type==1)Br+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex1))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex1).type==2)Wr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex1))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex1).type==3)Sr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex1))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex1).type==4)Ir+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex1))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex2).type==0)Lr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex2))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex2).type==1)Br+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex2))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex2).type==2)Wr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex2))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex2).type==3)Sr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex2))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex2).type==4)Ir+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex2))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex3).type==0)Lr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex3))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex3).type==1)Br+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex3))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex3).type==2)Wr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex3))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex3).type==3)Sr+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex3))*p.type;
				if(gl.resDistr.get(gl.SClocs.get(p.location).resIndex3).type==4)Ir+=getProb(gl.hexRolls.get(gl.SClocs.get(p.location).resIndex3))*p.type;
				
				
				
				
			}
		}
		//NOW ratios should be compared the hard way and such. combare the r's to d's
		
		ArrayList<Double> sorted=new ArrayList<Double>();
		ArrayList<Resource> sorte=new ArrayList<Resource>();
		double temp=Ld-Lr;
		sorted.add(temp);
		sorte.add(new Resource(0));
		//double tempType=0;//0-4 lumber through iron same order as above lalalalalalalalalalala
		int i=0;
		while(i<sorted.size()&&sorted.get(i)>Bd-Br)i++;
		sorted.add(Bd-Br);
		sorte.add(new Resource(1));
		
		while(i<sorted.size()&&sorted.get(i)>Wd-Wr)i++;
		sorted.add(Wd-Wr);
		sorte.add(new Resource(2));
		while(i<sorted.size()&&sorted.get(i)>Sd-Sr)i++;
		sorted.add(Sd-Sr);
		sorte.add(new Resource(3));
		
		while(i<sorted.size()&&sorted.get(i)>Id-Ir)i++;
		sorted.add(Id-Ir);
		sorte.add(new Resource(4));
		
		//sorte is now the sortes by worst first, so try to fix that last thing first.
		Resource first=find(sorte.remove(0));
		
		//temptype is now the worst variable, so try to improve that first
		
		
		
		
	}
	public Resource find(Resource r)
	{
		return r;
	}
	public double getProb(int value)
	{
		//takes in a value and returns hardcoded probabilities
		if(value==2||value==12)return 0.03;
		if(value==3||value==11)return 0.06;
		if(value==4||value==10)return 0.08;
		if(value==5||value==9)return 0.11;
		if(value==6||value==8)return 0.14;
		if(value==7)return 0.17;
		return 0.0;
		
	}
	public void updateMe()
	{
		I=gl.playerList.get(playerID).iron;
		L=gl.playerList.get(playerID).lumber;
		W=gl.playerList.get(playerID).wheat;
		S=gl.playerList.get(playerID).sheep;
		B=gl.playerList.get(playerID).brick;
		
	}
}
