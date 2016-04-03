
public class Option {
	
	//Fields and Attributes
	private Consequence consequence;
	private String name;
	
	//Constructor
	public Option(String n, Consequence c)
	{
		name = n;
		consequence = c;
	}
	
	//Returns the option's name
	public String getName()
	{
		return name;
	}
	
	//Sets the option's name
	public void setName(String n)
	{
		name = n;
	}
	
	//Returns the option's consequence
	public Consequence getConsequence()
	{
		return consequence;
	}
	
	//sets the option's consequence
	public void setConsequence(Consequence c)
	{
		consequence = c;
	}
	
	//Triggers the action method in the option's consequence
	public void result()
	{
		consequence.action();
	}

}
