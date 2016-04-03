
public class Unlock extends Consequence{

	public Unlock(Room r) 
	{
		super(r);		
	}
	
	void action() 
	{
		if (room.getName() == "Kelliville Docks")
		{
			if (player.playerHas("Coins"))
			{
				player.removeItem("Coins");
				room.getExit("north").unlock();
				resultText = "You pay the fare with the coins you found. You can now head north into the ocean. But the vendor tells you to watch out, because many speak of a fearsome Kraken wandering the Kellisea.";
				room.eventOver();
			}
			else
			{
				resultText = "You ain't got no money.";
			}
		}
		if (room.getName() == "Kellihary Desert Kellicave")
		{
			if (player.playerHas("Cave Key"))
			{
				player.removeItem("Cave Key");
				room.getExit("north").unlock();
				resultText = "You stick your key into the slot in the wall and turn it. Your key disappears into the slot, and the cave walls open to the way out of the desert.";
				room.eventOver();
			}
			else
			{
				resultText = "You have nothing that would fit the keyhole.";
			}
		}
		if (room.getName() == "The Kellicastle Mysterious Room")
		{
			if (player.playerHas("Green Orb") && player.playerHas("Blue Orb") && player.playerHas("Red Orb"))
			{
				player.removeItem("Green Orb");
				player.removeItem("Blue Orb");
				player.removeItem("Red Orb");
				room.getExit("north").unlock();
				resultText = "The 3 orbs float in the air. They start to glow. A blinding light appears to your north. Have you finally found your Kellidestiny?";
				room.eventOver();
			}
			else
			{
				resultText = "But nothing happens.";
			}
		}
	}
	
}
