import java.util.Random;


public class Fight extends Consequence{
	
	public Fight(MOB m) 
	{
		super(m);
	}

	void action() 
	{	
		if (mob.getMOBName().equalsIgnoreCase("Kelliforest Demon"))
		{
			if (player.playerHas("Sword"))
			{
				if (mob.hasItem())
					mob.dropItem();
				mob.die();
				resultText = "You charge at the vile demon, and with a swift swing of your sword, it is vanquished! Looks like it dropped something.";
				player.getRoom().setImage(player.getRoom().getNormalImage());
				player.playerFree();
			}
			else
			{
				resultText = "The demon leaps towards you screaming like a banshee. You have died. What were you gonna do, fight it with your fists?";
				player.respawn(mob.getRespawn());
				player.playerFree();
				mob.resume();
			}
		}
		if (mob.getMOBName().equalsIgnoreCase("The Kraken"))
		{
			if (player.playerHas("Harpoon"))
			{
				Random rand = new Random();
				int randomNum = rand.nextInt(3);
				if (randomNum == 1)
				{
					if (mob.hasItem())
						mob.dropItem();
					mob.die();
					resultText = "You aim your harpoon with your Kellidestiny on the line! A direct Hit! The Kraken moans then disappears into the Kellisea. You see a small object float up from the kellidepths.";
					player.getRoom().setImage(player.getRoom().getNormalImage());
					player.playerFree();
				}
				else
				{
					resultText = "You aim the harpoon, you shoot...but you miss. That was your only shot and you can only watch in horror as the Kraken's tenticles devour your ship. Everything fades to black.";
					player.respawn(mob.getRespawn());
					player.playerFree();
					mob.resume();
				}
			}
			else
			{
				resultText = "You think your tiny sword will help you against that massive Kellibeast? Think again nerd.";
				player.respawn(mob.getRespawn());
				player.playerFree();
				mob.resume();
			}
		}
		if (mob.getMOBName().equalsIgnoreCase("Kellihary Desert Kellimonster"))
		{
			if(player.playerHas("Sword") && player.playerHas("Shield"))
			{
				if (mob.hasItem())
					mob.dropItem();
				mob.die();
				resultText = "With your shield equipped, you are able to successully block the monster's heavy attacks, and land a killing blow with your sword. As it dies, it spits something out into the sand.";
				player.getRoom().setImage(player.getRoom().getNormalImage());
				player.playerFree();
			}
			else if(player.playerHas("Sword") && !player.playerHas("Shield"))
			{
				resultText = "You charge at the beast. It swipes its massive kellitail at you. You try and block with your sword, but to no avail. It breaks your sword and crushes you instantly";
				player.respawn(mob.getRespawn());
				player.playerFree();
				mob.resume();
			}
			else if(!player.playerHas("Sword") && player.playerHas("Shield"))
			{
				resultText = "While you effectively block its attacks with your shield, you have no weapon to counterattack with, so it's a stalemate. However, because of this you are free to escape.";
				player.playerFree();
				mob.resume();
			}
			else
			{
				resultText = "Well, looks like you have absolutely nothing to fight with. Enjoy your sandy grave.";
				player.respawn(mob.getRespawn());
				player.playerFree();
				mob.resume();
			}
		}
	}
	
}
