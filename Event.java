import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Event{
	
	//Fields and attributes
	private String eventText;
	private ArrayList<Option> options;
	
	//Constructor
	public Event(String t)
	{
		eventText = t;
		options = new ArrayList<Option>();
	}
	
	//Returns the eventText
	public String getText()
	{
		return eventText + "\n" + "Your options are: ";
	}
	
	//Sets and configures the player's options for this event
	public void setOptions(ArrayList<Option> ops)
	{
		options = ops;
	}
	
	//Returns all of the options for the event
	public String getOptionNames()
	{
		String option = "";
		for (Option o : options)
		{
			option = option + o.getName() + "\n";
			
		}
		return option;
	}
	
	//Returns the options themselves
	public ArrayList<Option> getOptions()
	{
		return options;
	}
	
	//Returns a specific option matching the passed in String
	public Option getOption(String o)
	{
		for (Option e : options)
		{
			if (e.getName().equalsIgnoreCase(o)) return e;
		}
		return null;
	}
	
	//Adds an option to the option ArrayList
	public void addOption(Option o)
	{
		options.add(o);
	}
	
	//Returns boolean testing if option exists
	public boolean hasOption(String o)
	{
		for (Option e : options)
		{
			if (e.getName().equalsIgnoreCase(o)) return true;
		}

	return false;
	}
	
	//Sets the player currently experiencing this event
	public void setPlayer(Player p)
	{
		
	}

}
