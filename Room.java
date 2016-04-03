import java.util.ArrayList;
import java.util.Observable;

import javax.swing.ImageIcon;
public class Room{
	
	//Fields and attributes
	private String name;
	private String description;
	private ArrayList<Item> roomItems;
	private ArrayList<Exit> exits;
	private ImageIcon image;
	private ImageIcon mobImage;
	private ImageIcon normalImage;
	private ArrayList<Player> players;
	private Event event;
	private boolean eventExists;
	
	//Constructor
	public Room(String n, String d, ImageIcon i, ArrayList<Player> ps)
	{
		name = n;
		description = d;
		normalImage = i;
		image = i;
		players = ps;
		roomItems = new ArrayList<Item>();
		exits = new ArrayList<Exit>();
	}
	
	//Grave constructor
	public Room(String n)
	{
		name = n;
	}
	
	//Returns the name of the room
	public String getName()
	{
		return name;
	}
	
	//Sets the name of the room
	public void setName(String newName)
	{
		name = newName;
	}
	
	//Gets players in room
	public String getPlayersIn()
	{
		String Players = "";
		for (Player i : players)
		{
			if (i.getRoom() == this)
			{
				Players = Players + i.getName() + ",   ";
			}
		}
		return (Players.substring(0, (Players.length()-4)));
		
	}
	
	//Returns a boolean on whether the room has a specific player
	public boolean hasPlayer(Player p)
	{
		for (Player i : players)
		{
			if(i == p)
			{
				return true;
			}
		}
		return false;
	}
	
	//Sets the description of the room
	public void setDescription(String newD)
	{
		description = newD;
	}
	
	//Returns the description of the room
	public String getDescription()
	{
		return description;
	}
	
	//Adds an item to the room (String input)
	public void addItem(String aItem)
	{
		Item i = new Item(aItem);
		roomItems.add(i);
	}
	
	//Adds an item to the room
	public void addItem(Item aItem)
	{
		roomItems.add(aItem);
	}
	
	//Removes an item from the room
	public void removeItem(String aItem)
	{
		for (Item i : roomItems)
		{
			if (i.getName().equalsIgnoreCase(aItem))
			{
				roomItems.remove(i);
				break;
			}
		}
	}
	
	//Returns an item from the room
	public Item getItem(String n)
	{
		Item i = new Item(n);
		if (this.roomHas(n))
		{
			return i;
		}
		System.out.println("This room does not have any " + n);
		return null;
		
	}
	
	//Checks if a room has an item in it, then returns true or false
	public boolean roomHas(String aItem)
	{
		for (Item i : roomItems)
			{
				if (i.getName().equalsIgnoreCase(aItem)) return true;
			}
	
		return false;	
	}
	
	//Adds an exit to the room
	public void addExit(String n, Room r)
	{
		exits.add(new Exit(n, r));
	}
	
	//Removes and exit from the room
	public void removeExit(Exit x)
	{
		exits.remove(x);
	}
	
	//Returns an exit in the room
	public Exit getExit(String nsew)
	{
		for (Exit e : exits)			
		{		
			if (e.getDirection().equalsIgnoreCase(nsew))
				return e;			
		}
		System.out.println("This room does not have a " + nsew + " exit.");
		return null;
	}
	
	//Returns the entire ArrayList of exits
	public ArrayList<Exit> getExits()
	{
		return exits;
	}
	
	//Checks to see if a room has a particular type of exit
	public boolean checkExits(String nsew)
	{
		for (Exit e : exits)
		{
			if (e.getDirection().equalsIgnoreCase(nsew)) return true;
		}
		return false;
	}
	
	//Returns the image for the room
	public ImageIcon getNormalImage()
	{
		return normalImage;
	}
	
	//Sets the image for the room
	public void setNormalImage(ImageIcon i)
	{
		normalImage = i;
	}
	
	//Returns the mob version of the room image, if any
	public ImageIcon getMOBImage()
	{
		return mobImage;
	}
	
	//Sets the Mob version of the room image
	public void setMOBImage(ImageIcon i)
	{
		mobImage = i;
	}
	
	//Gets the room's current image
	public ImageIcon getImage()
	{
		return image;
	}
	
	//Sets the room's current image
	public void setImage(ImageIcon i)
	{
		image = i;
	}
	
	//Display's the room's items
	public String showItems()
	{
		String Invent = "";
		for (Item i : roomItems)
		{
			Invent = Invent + i.getName() + "\n";
			
		}
		return Invent;
	}
	
	//Returns a boolean on whether the room's event exists or not
	public boolean hasEvent()
	{
		return eventExists;
	}
	
	//Returns the Event of the room
	public Event getEvent()
	{
		return event;
	}
	
	//Sets the Event for the room
	public void setEvent(Event e)
	{
		event = e;
		eventExists = true;
	}
	
	//Sets the eventExists to false
	public void eventOver()
	{
		eventExists = false;
	}
	
	//Returns the event text for this room
	public String getEventText()
	{
		return event.getText();
	}

	public void addExit(Exit e) 
	{
		exits.add(e);
	}

}
