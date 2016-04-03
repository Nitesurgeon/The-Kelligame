import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.plaf.basic.BasicArrowButton;

public class GUI implements Observer{
	
	Player player;
	Room room;
	JTextPane inventorys = null;
	JTextPane roomItems = null;
	JTextPane textOutput = new JTextPane();
	InputListener IL = null;
	JLabel roomInfo = new JLabel();
	JLabel roomImage = new JLabel();
	
	public GUI(Room r, Player p, ArrayList<MOB> mobs, ArrayList<Player> players)
	{
		room = r;
		player = p;
		
		//Creates the overall game window
		JFrame window = new JFrame();
		window.setSize(1000, 1000);
		window.setLayout(new BorderLayout());
		window.setTitle("The Kelligame");
		
		//Creates the panel with the room image, and the game text output		
		roomImage.setIcon(player.getRoom().getImage());
		roomInfo.setText("Room: " + room.getName() + "                       Players in room: " + room.getPlayersIn());
        JLabel playerName = new JLabel("Player: " + player.getName());
		JPanel output = new JPanel(new BorderLayout());

		textOutput.setText(player.getRoom().getDescription());
		textOutput.setEditable(false);
		output.add(roomInfo, BorderLayout.NORTH);
        output.add(playerName, BorderLayout.WEST);
		output.add(roomImage, BorderLayout.CENTER);
		output.add(textOutput, BorderLayout.SOUTH);
		
		//Creates the panel with all the game stats like inventory, and items in current room
		JPanel stats = new JPanel();
		stats.setLayout(new BoxLayout(stats, BoxLayout.Y_AXIS));
		JLabel inventoryLabel = new JLabel("Inventory: ");
		JLabel itemsInRoomLabel = new JLabel("Items in " + room.getName() + ":   ");
		JTextPane inventoryList = new JTextPane();
		inventoryList.setEditable(false);
		JTextPane itemsInRoomList = new JTextPane();
		itemsInRoomList.setText(player.getRoom().showItems());
		itemsInRoomList.setEditable(false);
		JPanel inventory = new JPanel(new BorderLayout());
		JPanel itemsInRoom = new JPanel(new BorderLayout());
		inventory.add(inventoryLabel, BorderLayout.NORTH);
		inventory.add(inventoryList, BorderLayout.SOUTH);
		itemsInRoom.add(itemsInRoomLabel, BorderLayout.NORTH);
		itemsInRoom.add(itemsInRoomList, BorderLayout.SOUTH);
		stats.add(inventory);
		stats.add(itemsInRoom);
		
		//Creates the panel with arrow buttons for movement
		JPanel movement = new JPanel(new BorderLayout());
		BasicArrowButton north = new BasicArrowButton(BasicArrowButton.NORTH);
		BasicArrowButton south = new BasicArrowButton(BasicArrowButton.SOUTH);
		BasicArrowButton east = new BasicArrowButton(BasicArrowButton.EAST);
		BasicArrowButton west = new BasicArrowButton(BasicArrowButton.WEST);
		east.addActionListener(new ButtonListener(player, mobs, textOutput, roomImage, roomInfo, itemsInRoomList));
        west.addActionListener(new ButtonListener(player, mobs, textOutput, roomImage, roomInfo, itemsInRoomList));
        north.addActionListener(new ButtonListener(player, mobs, textOutput, roomImage, roomInfo, itemsInRoomList));
        south.addActionListener(new ButtonListener(player, mobs, textOutput, roomImage, roomInfo, itemsInRoomList));
		movement.add(north, BorderLayout.NORTH);
		movement.add(south, BorderLayout.SOUTH);
		movement.add(east, BorderLayout.EAST);
		movement.add(west, BorderLayout.WEST);
		
		//Creates a panel for player text input
		JPanel inputPanel = new JPanel(new BorderLayout());
		JTextField input = new JTextField();
		IL = new InputListener(player, mobs, textOutput, inventoryList, itemsInRoomList, roomImage, roomInfo);
		inventorys = inventoryList;
		roomItems = itemsInRoomList;
		input.addActionListener(IL);
		input.setColumns(60);
		inputPanel.add(movement, BorderLayout.EAST);
		inputPanel.add(input, BorderLayout.WEST);
		
		//Puts all the previous panels together into one panel
		JPanel content = new JPanel(new BorderLayout());
		content.add(inputPanel, BorderLayout.SOUTH);
		content.add(output, BorderLayout.CENTER);
		content.add(stats, BorderLayout.EAST);
		
		//Sets the complete panel as the content pane for the overall window
		window.setContentPane(content);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	//Update method from the Observer interface
	public void update(Observable obs, Object arg1) 
	{
		if (obs instanceof Player) 
		{
			if (((Player)obs) != player)
			{
				inventorys.setText(player.showInventory());
				roomItems.setText(player.getRoom().showItems());
				roomInfo.setText("Room: " + player.getRoom().getName() + "                       Players in room: " + player.getRoom().getPlayersIn());
				if (player.getRoom().hasEvent())
				{
					player.getRoom().getEvent().getOptionNames();
				}
			}
		}
		else if (obs instanceof MOB) 
		{
			if (((MOB)obs).isEncountered() != null)
			{
				if( player.getRoom() == ((MOB)obs).getRoom())
				{
					((MOB)obs).pause();
					player.playerTrapped();
					roomImage.setIcon(player.getRoom().getMOBImage());
					textOutput.setText(((MOB)obs).getEventText() + "\n" + ((MOB)obs).getEvent().getOptionNames());
				}
			}
		}
	}
}
