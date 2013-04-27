
public class Vertex {

  // index of resDistr, which equals index of hexRolls
	// if is sea, -1 is used
	// if is a port, -2 - (index of port) is used.
	public int resIndex1;
	public int resIndex2;
	public int resIndex3;
	
	public Vertex(int resIndex1, int resIndex2, int resIndex3)
	{
		this.resIndex1=resIndex1;
		this.resIndex2=resIndex2;
		this.resIndex3=resIndex3;
	}
}
