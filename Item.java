
public class Item {
	
	//Fields and attributes
	private String name;
	
	//Constructor
	public Item(String n)
	{
		name = n;
	}
	
	//Returns the item name
	public String getName()
	{
		return name;
	}
	
	//Changes the item name
	public void setName(String newName)
	{
		name = newName;
	}
}
