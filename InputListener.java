import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class InputListener implements ActionListener {

	//Fields and Attributes
	private Player player;
	private ArrayList<MOB> mobs;
	private MOB currentMOB;
	private JTextPane output;
	private JTextPane inventory;
	private JTextPane roomItems;
	private JLabel roomImage;
	private JLabel roomInfo;

	//Constructor
	public InputListener(Player p, ArrayList<MOB> m, JTextPane textOutput, JTextPane inventoryList, JTextPane itemsInRoomList, JLabel image, JLabel roominf)
	{
		player = p;
		mobs = m;
		output = textOutput;
		inventory = inventoryList;
		roomItems = itemsInRoomList;
		roomImage = image;
		roomInfo = roominf;
	}
	
	//Checks whether the player has encountered any mobs in the ArrayList
	public boolean hasEncountered()
	{
		for (MOB m : mobs)
		{
			if (m.isEncountered() != null)
			{
				currentMOB = m;
				return true;
			}
		}
		return false;
	}
	
	//Various action event cases and event sources for player text input
	public void actionPerformed(ActionEvent e) 
	{
		JTextField source = (JTextField)e.getSource();
		String text = source.getText();
		if (text.startsWith("get "))
		{
			String item = text.substring(4);
			if (player.getItem(item))
			{
				output.setText("You got a/n "+item+"!");
				inventory.setText(player.showInventory());
				roomItems.setText(player.getRoom().showItems());
			}
			else output.setText("There is/are no " + item + " here you scavenging punk");
			source.setText("");
		}
		if (text.startsWith("drop "))
		{
			String item = text.substring(5);
			if (player.dropItem(item))
			{
				output.setText("You dropped your " + item);
				inventory.setText(player.showInventory());
				roomItems.setText(player.getRoom().showItems());
			}
			else output.setText("You don't have any " + item + " you little punk");
			source.setText("");
		}
		if (hasEncountered())
		{
			Event currentEvent = currentMOB.getEvent();
			for (Option o : currentEvent.getOptions())
			{
				o.getConsequence().setPlayer(player);
			}
			if (currentEvent.hasOption(text))
			{
				Option o = currentEvent.getOption(text);
				o.result();
				output.setText(o.getConsequence().getResultText());
				inventory.setText(player.showInventory());
				roomItems.setText(player.getRoom().showItems());
				roomImage.setIcon(player.getRoom().getNormalImage());
				roomInfo.setText(player.getRoom().getName() + "                       Players in room: " + player.getRoom().getPlayersIn());
				source.setText("");
			}
		}
		if(player.getRoom().hasEvent())
		{
			Event currentEvent = player.getRoom().getEvent();
			for (Option o : currentEvent.getOptions())
			{
				o.getConsequence().setPlayer(player);
			}
			if (currentEvent.hasOption(text))
			{
				Option o = currentEvent.getOption(text);
				o.result();
				output.setText(o.getConsequence().getResultText());
				inventory.setText(player.showInventory());
				roomItems.setText(player.getRoom().showItems());
				roomImage.setIcon(player.getRoom().getNormalImage());
				roomInfo.setText(player.getRoom().getName() + "                       Players in room: " + player.getRoom().getPlayersIn());
				source.setText("");
			}
		}
		if (text.equalsIgnoreCase("where am i?"))
		{
			output.setText(player.getRoom().getDescription());
			source.setText("");
		}
		if (text.equalsIgnoreCase("help"))
		{
			output.setText("You're playing a really amateur text based game. Here are the controls: " + "\n" + "-Press the arrow buttons to the right to move North, South, East or West"
							+ "\n" + "-Type 'get' followed by an item name to pick up an item" + "\n" + "-Type 'drop' followed by item name to drop an item" + 
							"\n" + "-Type Where am I? to get the current room description");
			source.setText("");
		}
	}

}
