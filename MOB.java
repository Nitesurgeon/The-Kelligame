import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

import javax.swing.ImageIcon;


public class MOB extends Observable implements Runnable{
	
	//Fields and Attributes
	private String name;
	private Room location;
	private Room respawn;
	private Item heldItem;
	private Event event;
	private ArrayList<Room> bounds;
	private ArrayList<Player> players;
	private boolean isDead = false;
	private boolean paused = false;
	
	//Constructor
	public MOB(String n, Room l, Room r, Item i, ArrayList<Player> p)
	{
		name = n;
		location = l;
		respawn = r;
		heldItem = i;
		players = p;
		bounds = new ArrayList<Room>();
	}
	
	//Returns the name of the MOB
	public String getMOBName()
	{
		return name;
	}
	
	//Returns event
	public String getEventText()
	{
		return event.getText();
	}
	
	//Returns the MOB's event
	public Event getEvent()
	{
		return event;
	}
	
	//Sets the MOB's event
	public void setEvent(Event e)
	{
		event = e;
	}
	
	//Sets the name of the MOB
	public void setMOBName(String newName)
	{
		name = newName;
	}
	
	//Returns the current location of the MOB
	public Room getRoom()
	{
		return location;
	}
	
	//Sets the current location of the MOB
	public void setRoom(Room newLocation)
	{
		location = newLocation;
	}
	
	//Gets the respawn location for when the player dies to this MOB
	public Room getRespawn()
	{
		return respawn;
	}
	
	//Sets the respawn location for when the player dies to this MOB
	public void setRespawn(Room r)
	{
		respawn = r;
	}
	
	//Returns the MOB's held item
	public Item getItem()
	{
		return heldItem;
	}
	
	//Sets the MOB's held item
	public void setItem(Item aItem)
	{
		heldItem = aItem;
	}
	
	//Drops the held item in the current room
	public void dropItem()
	{
		location.addItem(heldItem);
	}
	
	//Checks whether the MOB has a held item
	public boolean hasItem()
	{
		if (heldItem != null)
			return true;
		else
			return false;
	}
	
	//Adds a bound to the ArrayList of bounds
	public void addBound(Room e)
	{
		bounds.add(e);
	}
	
	//Removes a bound from the ArrayList of bounds
	public boolean removeBound(Exit e)
	{
		if (bounds.contains(e))
		{
			bounds.remove(e);
			return true;
		}
		else
			return false;
	}
	
	//Kills the MOB object
	public void die()
	{
		isDead = true;
		location = new Room("Grave");
	}
	
	//Pauses the thread
	public void pause()
	{
		paused = true;
	}
	
	//Resumes the thread
	public void resume()
	{
		paused = false;
	}
	
	//Returns the player that is in the same room as this MOB
	public Player isEncountered()
	{
		for (Player i : players)
		{
			if (getRoom() == i.getRoom())
				return i;
		}
		return null;
	}
	
	//The run method for this thread
	public void run()
	{
		try 
		{
			while(isDead != true)
			{
				Thread.sleep(900);
				if (isDead)
					break;
				ArrayList<Exit> exits = location.getExits();
				Random rand = new Random();
				int randomNum = rand.nextInt(exits.size());
				if (paused == false)
				{
					Room r = exits.get(randomNum).getToRoom();
					if (!bounds.contains(r))
					{
						location = r;
						setChanged();
						notifyObservers();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			//e.printStackTrace();
		}
	}

}
