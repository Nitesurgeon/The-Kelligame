import java.util.Scanner;
public class ConsoleIO {
	
	//Fields and attributes
	private Scanner scanner;
	private Player player;
	
	//Constructor
	public ConsoleIO(Scanner s, Player p)
	{
		scanner = s;
		player = p;
	}
	
	//Outputs text to the user
	public void output (String text)
	{
		System.out.println(text);
	}
	
	//Main ConsoleIO
	public void run()
	{
		boolean more = true;
		String command, arg, line;
		
		while (more)
		{
			System.out.print("> ");
			command = scanner.next();
			if (command.equalsIgnoreCase("get") || command.equalsIgnoreCase("grab"))
			{
				arg = scanner.next();
				player.getItem(arg);			
			}
			else if (command.equalsIgnoreCase("drop"))
			{
				arg = scanner.next();
				player.dropItem(arg);
			}
			else if ((command.equalsIgnoreCase("inventory")) || (command.equalsIgnoreCase("bag")))
			{
				player.showInventory();
			}
			else if (command.equalsIgnoreCase("go"))
			{
				arg = scanner.next();
				if (arg.equalsIgnoreCase("north"))
					player.goNorth();
				else if (arg.equalsIgnoreCase("south"))
					player.goSouth();
				else if (arg.equalsIgnoreCase("east"))
					player.goEast();
				else if (arg.equalsIgnoreCase("west"))
					player.goWest();
				else
					output("go where?");
			}
			else if ((command.equalsIgnoreCase("quit")) || (command.equalsIgnoreCase("end")))
			{
				System.out.println("I'm sure you have better things to do");
				more = false;
			}
			else if (command.equalsIgnoreCase("where"))
			{
				line = scanner.nextLine();
				if ((line.equalsIgnoreCase("am i?")) || (line.equalsIgnoreCase("am i?")))
				{
					System.out.println(player.whereAmI());
				}
			}
			else if (command.equalsIgnoreCase("help"))
			{
				System.out.println("You're playing a really amateur text based game. Here are the controls:");
				System.out.println("-Type 'go' followed by north, south, east, or west to travel");
				System.out.println("-Type 'get' or 'grab' followed by an item name to pick up an item");
				System.out.println("-Type 'drop' followed by item name to drop an item");
				System.out.println("-Type 'inventory' or 'bag' to display your current inventory");
				System.out.println("-Type 'where am i?' to get info on the room you are currently in (in case you forget how to scroll up)");
			}
			else System.out.println("What did you just type you illiterate punk? Type help if you're lost");
				
		}
	}
	
	
}
