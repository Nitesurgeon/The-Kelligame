
public class Steal extends Consequence{

	public Steal(MOB m) 
	{
		super(m);
	}

	void action() 
	{
		if (mob.hasItem())
		{
			player.getItem(mob.getItem());
			mob.setItem(null);
		}
	}
	
	
	
}
