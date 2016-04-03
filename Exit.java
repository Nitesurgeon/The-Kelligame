
public class Exit {
	
	//Fields and attributes
	private String description;
	private String direction;
	private Room toRoom;
	private boolean lock = false;
	
	//Constructor
	public Exit(String nsew, Room r)
	{
		direction = nsew;
		toRoom = r;
	}
	
	//Sets the direction of the exit
	public void setDirection(String nsew)
	{
		direction = nsew;
	}
	
	//Returns the direction of the exit
	public String getDirection()
	{
		return direction;
	}
	
	//Sets the room the exit leads to
	public void setToRoom(Room r)
	{
		toRoom = r;
	}
	
	//Returns the room the exit leads to
	public Room getToRoom()
	{
		return toRoom;
	}
	
	//Sets the Exit's description
	public void setDescription(String d)
	{
		description = d;
	}
	
	//Returns the Exit's description
	public String getDescription()
	{
		return description;
	}
	
	//Returns a boolean on whether the exit is locked
	public boolean isLocked()
	{
		return lock;
	}
	
	//Locks the room
	public void lock()
	{
		lock = true;
	}
	
	//Unlocks the room
	public void unlock()
	{
		lock = false;
	}

}
