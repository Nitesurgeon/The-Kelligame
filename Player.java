import java.util.*;
public class Player extends Observable{
	
	//Fields and attributes
	private ArrayList<Item> inventory;
	private String name;
	private Room location;
	private boolean canMove = true;
	
	//Constructor
	public Player(String n)
	{		
		inventory = new ArrayList<Item>();
		name = n;
	}
	
	//Returns the player's name
	public String getName()
	{
		return name;
	}
	
	//Changes the player's name
	public void setName(String newName)
	{
		name = newName;
	}
	
	//Returns the current room the player is in
	public Room getRoom()
	{
		return location;
	}
	
	//Displays the current room description the player is in
	public String whereAmI()
	{
		return (location.getDescription());
	}
	
	//Sets the room the player is in
	public void setRoom(Room newRoom)
	{
		location = newRoom;
	}
	
	//Adds an item to inventory; String input
	public boolean getItem(String aItem)
	{
		
		if (location.roomHas(aItem))
		{
			Item i = new Item(aItem);
			inventory.add(i);
			location.removeItem(aItem);
			setChanged();
			notifyObservers();
			//System.out.println("You got " + aItem + "!");
			return true;
		}
		else 
			return false;
			//System.out.println("There is/are no " + aItem + " here you scavenging punk");
	}
	
	//Adds an item to the inventory; Item input
	public void getItem(Item aItem)
	{
		inventory.add(aItem);
	}
	
	//Returns the name of the most recent item picked up
	public String getRecentItem()
	{
		return inventory.get(inventory.size() - 1).getName();
	}
	
	//Removes an item from inventory, and places in current room
	public boolean dropItem(String aItem)
	{
			for (Item i : inventory)
			{
				if (i.getName().equalsIgnoreCase(aItem))
				{
					inventory.remove(i);
					location.addItem(aItem);
					setChanged();
					notifyObservers();
					//System.out.println("You dropped " + aItem);
					return true;
				}	
			}
		return false;
		//System.out.println("You don't even have any " + aItem + " you little punk");		
	}
	
	//Removes an item from inventory
	public void removeItem(String aItem)
	{		
		for (int i = 0; i < inventory.size(); i++)
		{
			if ((inventory.get(i).getName()).equalsIgnoreCase(aItem))
			{
				inventory.remove(i);
			}
		}
		setChanged();
		notifyObservers();
	}
	
	//Display's the player's inventory
	public String showInventory()
	{
		String Invent = "";
		for (Item i : inventory)
		{
			Invent = Invent + i.getName() + "\n";
			
		}
		return Invent;
	}
	
	//Checks if a player has an item in their inventory, then returns true or false
	public boolean playerHas(String aItem)
	{
		for (Item i : inventory)
			{
				if (i.getName().equalsIgnoreCase(aItem)) return true;
			}
	
		return false;	
	}
	
	//Moves the player through a north exit
	public boolean goNorth()
	{
		if (canMove)
		{
			if (location.checkExits("North"))
			{
				Exit e = location.getExit("North");
				if (!e.isLocked())
				{
					location = e.getToRoom();
					setChanged();
					notifyObservers();
					return true;
					//System.out.println(location.getDescription());
				}
				else
					return false;
			}
			else 
				return false;
				//System.out.println("You can't go that way punk");
		}
		else
			return false;
	}
	
	//Moves the player through a south exit
	public boolean goSouth()
	{
		if (canMove)
		{
			if (location.checkExits("South"))
			{
				Exit e = location.getExit("South");
				if (!e.isLocked())
				{
					location = e.getToRoom();
					setChanged();
					notifyObservers();
					return true;
					//System.out.println(location.getDescription());
				}
				else
					return false;
			}
			else 
				return false;
				//System.out.println("You can't go that way punk");
		}
		else
			return false;
	}
	
	//Moves the player through a east exit
	public boolean goEast()
	{
		if (canMove)
		{
			if (location.checkExits("East"))
			{
				Exit e = location.getExit("East");
				if (!e.isLocked())
				{
					location = e.getToRoom();
					setChanged();
					notifyObservers();
					return true;
					//System.out.println(location.getDescription());
				}
				else
					return false;
			}
			else 
				return false;
				//System.out.println("You can't go that way punk");
		}
		else
			return false;
	}
	
	//Moves the player through a west exit
	public boolean goWest()
	{
		if (canMove)
		{
			if (location.checkExits("West"))
			{
				Exit e = location.getExit("West");
				if (!e.isLocked())
				{
					location = e.getToRoom();
					setChanged();
					notifyObservers();
					return true;
					//System.out.println(location.getDescription());
				}
				else
					return false;
			}
			else 
				return false;
				//System.out.println("You can't go that way punk");
		}
		else
			return false;
	}
	
	//Sets the player's canMove boolean to false
	public void playerTrapped()
	{
		canMove = false;
	}
	
	//Sets the player's canMove boolean to false
	public void playerFree()
	{
		canMove = true;
	}
	
	//Respawns the player
	public void respawn(Room r)
	{
		location = r;
		setChanged();
		notifyObservers();
	}
}
