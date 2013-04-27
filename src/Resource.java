import java.awt.Color;


public class Resource {
  /**
	 * any (or unknown) = -1
	 * wood = 0
	 * brick = 1
	 * wheat = 2
	 * sheep = 3
	 * ore = 4
	 * desert = 5
	 * sea = 6
	 */
	public int type=-1;
	
	public Resource(int type)
	{
		this.type=type;
	}
	
	public Resource(String typeName)
	{
		if (typeName=="any") this.type=-1;
		if (typeName=="wood") this.type=0;
		if (typeName=="brick") this.type=1;
		if (typeName=="wheat") this.type=2;
		if (typeName=="sheep") this.type=3;
		if (typeName=="iron") this.type=4;
		if (typeName=="desert") this.type=5;
		if (typeName=="sea") this.type=6;
	}
	
	public Color getColor()
	{
		switch (type)
		{
		case -1: return Color.lightGray;
		case 0: return Color.white;
		case 1: return Color.red;
		case 2: return Color.yellow;
		case 3: return Color.green;
		case 4: return Color.gray;
		case 5: return Color.magenta;
		case 6: return Color.blue;
		default: return Color.black;
		}
	}
	
	public String toPortString()
	{
		switch (type)
		{
		case -1: return "?";
		case 0: return "L";
		case 1: return "B";
		case 2: return "W";
		case 3: return "S";
		case 4: return "I";
		default: return "";
		}
	}
}
