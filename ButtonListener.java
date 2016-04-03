import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicArrowButton;


public class ButtonListener implements ActionListener {
	
	//Fields and Attributes
	private Player player;
	private JTextPane output;
	private JLabel image;
	private JLabel roomName;
	private JTextPane roomItems;
	private ArrayList<MOB> mobs;
	
	//Constructor
	public ButtonListener(Player p, ArrayList<MOB> m, JTextPane textOutput, JLabel i, JLabel rn, JTextPane itemsInRoomList) 
	{
		player = p;
		mobs = m;
		output = textOutput;
		image = i;
		roomName = rn;
		roomItems = itemsInRoomList;
	}

	//Various action event cases and event sources for the arrow buttons
	public void actionPerformed(ActionEvent e) 
	{
		 BasicArrowButton source = (BasicArrowButton)e.getSource();
	        if (source.getDirection() == SwingConstants.NORTH) {
	            if (player.goNorth())
	            {
	            	if (player.getRoom().hasEvent())
	            		output.setText(player.getRoom().getEventText() + "\n" + player.getRoom().getEvent().getOptionNames());
	            	else 
	            		output.setText(player.getRoom().getDescription());
	            	image.setIcon(player.getRoom().getImage()); 
	            	roomName.setText(player.getRoom().getName());
	            	roomItems.setText(player.getRoom().showItems());
	            }
	            else
	            	output.setText("You can't go that way punk");
	        }
	        else if (source.getDirection() == SwingConstants.SOUTH) {
	        	if (player.goSouth())
	        	{
	        		if (player.getRoom().hasEvent())
	            		output.setText(player.getRoom().getEventText() + "\n" + player.getRoom().getEvent().getOptionNames());
	            	else 
	            		output.setText(player.getRoom().getDescription());
	            	image.setIcon(player.getRoom().getImage());
	            	roomName.setText(player.getRoom().getName());
	            	roomItems.setText(player.getRoom().showItems());
	        	}
	            else
	            	output.setText("You can't go that way punk");
	        }
	        else if (source.getDirection() == SwingConstants.WEST) {
	        	if (player.goWest())
	        	{
	        		if (player.getRoom().hasEvent())
	            		output.setText(player.getRoom().getEventText() + "\n" + player.getRoom().getEvent().getOptionNames());
	            	else 
	            		output.setText(player.getRoom().getDescription());
	            	image.setIcon(player.getRoom().getImage());
	            	roomName.setText(player.getRoom().getName());
	            	roomItems.setText(player.getRoom().showItems());
	        	}
	            else
	            	output.setText("You can't go that way punk");
	        }
	       
	        else 
	        {
	        if (player.goEast())
	        {
	        	if (player.getRoom().hasEvent())
            		output.setText(player.getRoom().getEventText() + "\n" + player.getRoom().getEvent().getOptionNames());
            	else 
            		output.setText(player.getRoom().getDescription());
            	image.setIcon(player.getRoom().getImage());
            	roomName.setText(player.getRoom().getName());
            	roomItems.setText(player.getRoom().showItems());
	        }
            else
            	output.setText("You can't go that way punk");
	        }
	}

}
