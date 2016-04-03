//Abstract class that all event consequences are born from
public abstract class Consequence {
	
	//Fields and Attributes
	protected String resultText;
	protected MOB mob;
	protected Player player = null;
	protected Room room;
	
	//MOB event constructor
	public Consequence(MOB m)
	{
		mob = m;
	}
	
	//Room event constructor
	public Consequence(Room r)
	{
		room = r;
	}
	
	//returns the result text for this
	public String getResultText()
	{
		return resultText;
	}
	
	//Sets the current player for the consequence
	public void setPlayer(Player p)
	{
		player = p;
	}
	
	abstract void action();

}
