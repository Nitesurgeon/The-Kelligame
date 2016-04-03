import java.util.Random;


public class Escape extends Consequence{

	public Escape(MOB m) 
	{
		super(m);
	}

	void action() 
	{
		if (mob.getMOBName().equalsIgnoreCase("Kelliforest Demon"))
		{
			Random rand = new Random();
			int randomNum = rand.nextInt(2);
			if (randomNum == 1)
			{
				resultText = "Escape is now possible!";
				player.playerFree();
				mob.resume();
			}
			else
			{
				resultText = "You try to run, but your vision and thoughts start to blur. You see the demon approach you. You hear a banshee like scream. It all goes black.";
				player.respawn(mob.getRespawn());
				player.playerFree();
				mob.resume();
			}
		}
		if (mob.getMOBName().equalsIgnoreCase("The Kraken"))
		{
			Random rand = new Random();
			int randomNum = rand.nextInt(2);
			if (randomNum == 1)
			{
				resultText = "Escape is now possible!";
				player.playerFree();
				mob.resume();
			}
			else
			{
				resultText = "You turn the boat around as fast as you can. But you realize there is no hope when you look up and see one of its tentacles plummeting down on you.";
				player.respawn(mob.getRespawn());
				player.playerFree();
				mob.resume();
			}
		}
		if (mob.getMOBName().equalsIgnoreCase("Kellihary Desert Kellimonster"))
		{
			Random rand = new Random();
			int randomNum = rand.nextInt(2);
			if (randomNum == 1)
			{
				resultText = "Escape is now possible!";
				player.playerFree();
				mob.resume();
			}
			else
			{
				resultText = "You try and run away, but the kellimonster is too quick! It swallows you whole";
				player.respawn(mob.getRespawn());
				player.playerFree();
				mob.resume();
			}
		}
		
	}
	
	

}
