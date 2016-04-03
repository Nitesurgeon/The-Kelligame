import java.util.ArrayList;

import javax.swing.ImageIcon;
public class Boot {

	/**
	 * @param args
	 */
	
	public Boot()
	{
		//Create the players and consolidate them
		ArrayList<Player> players = new ArrayList<Player>();
		Player player01 = new Player("Kellihero01");
		Player player02 = new Player("Kellihero02");
		Player player03 = new Player("Kellihero03");
		Player player04 = new Player("Kellihero04");
		players.add(player01);
		players.add(player02);
		players.add(player03);
		players.add(player04);
		
		//Creating all of the rooms
		Room kelliwoods = new Room("Kelliwoods", "You find yourself in a serene grove in the middle of a wood. You must find your Kellidestiny! You see a path leading north.", new ImageIcon("Kelliwoods.jpg"), players);
		Room kelliplains = new Room("The Kelliplains", "You arrive on an open expanse of lush kelligrass. To your west you see a sign pointing towards Kelliville. To your east you see trees, but they are dead, spooky and uninviting trees.", new ImageIcon("Kelliplains.jpg"), players);
		Room kelliforest01 = new Room("The Spooky Kelliforest", "Despite your best instincts you enter this decrepit, spooky forest. Hopefully your Kellidestiny is not here... Going west takes you back to the Kelliplains", new ImageIcon("Kelliforest01.jpg"), players);
		kelliforest01.setMOBImage(new ImageIcon("Kelliforest01 Monster.jpg"));
		Room kelliforest02 = new Room("The Spooky Kelliforest", "You continue to trudge on through the obviously haunted forest. You can still leave by heading west", new ImageIcon("Kelliforest02.jpg"), players);
		kelliforest02.setMOBImage(new ImageIcon("Kelliforest02 Monster.jpg"));
		Room kelliforest03 = new Room("The Spooky Kelliforest", "Go any further and you will lose your sanity. Best to turn back west.", new ImageIcon("Kelliforest03.jpg"), players);
		kelliforest03.setMOBImage(new ImageIcon("Kelliforest03 Monster.jpg"));
		Room roadToKelliville = new Room("Kelliroad to Kelliville", "A winding dirt path though the plains. You can make out a town in the distant west.", new ImageIcon("Kelliroad to Kelliville.jpg"), players);
		Room kelliville = new Room("Kelliville", "A seemingly busy town with not all that much to do. Maybe your Kellidestiny is here! There is a dark alleyway to the south, and the town docks are to the north.", new ImageIcon("Kelliville.jpg"), players);
		Room kellivilleAlley = new Room("Kelliville", "A dark alleyway.", new ImageIcon("Kelliville Alley.jpg"), players);
		Room kellidocks = new Room("Kelliville Docks", "Many ships come and go here. Up north is a vast ocean. Maybe your Kellidestiny is across the ocean.", new ImageIcon("Kelliville Docks.jpg"), players);
		Room kellisea01 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea01.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea02 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea02.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea03 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea03.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea04 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea04.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea05 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea05.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea06 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea06.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea07 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea07.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea08 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea08.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kellisea09 = new Room("The Great Kellisea", "A vast expanse of water.", new ImageIcon("Kellisea.jpg"), players);
		kellisea09.setMOBImage(new ImageIcon("Kraken.jpg"));
		Room kelliharydesertBeach = new Room("Kellihary Desert Shore", "You finally hit kelliland, and it's the shoreline for a massive desert. Your Kellidestiny couldn't possibly be somewhere in that massive pile of kellisand, could it? The Kellisea is to the west, while the Kellihary desert is to the east.", new ImageIcon("KelliharyDesert Beach.jpg"), players);
		Room kelliharydesert01 = new Room("The Kellihary Desert", "A humongous dry and hot desert. Be careful not to get lost.", new ImageIcon("Kelliharydesert01.jpg"), players);
		kelliharydesert01.setMOBImage(new ImageIcon("Kellidesert01 Monster.jpg"));
		Room kelliharydesert02 = new Room("The Kellihary Desert", "A humongous dry and hot desert. Be careful not to get lost.", new ImageIcon("Kelliharydesert02.jpg"), players);
		kelliharydesert02.setMOBImage(new ImageIcon("Kellidesert02 Monster.jpg"));
		Room kelliharydesert03 = new Room("The Kellihary Desert", "A humongous dry and hot desert. Be careful not to get lost.", new ImageIcon("Kelliharydesert03.jpg"), players);
		kelliharydesert03.setMOBImage(new ImageIcon("Kellidesert03 Monster.jpg"));
		Room kelliharydesert04 = new Room("The Kellihary Desert", "A humongous dry and hot desert. Be careful not to get lost.", new ImageIcon("Kelliharydesert04.jpg"), players);
		kelliharydesert04.setMOBImage(new ImageIcon("Kellidesert04 Monster.jpg"));
		Room kelliharydesert05 = new Room("The Kellihary Desert", "A humongous dry and hot desert. Be careful not to get lost.", new ImageIcon("Kelliharydesert05.jpg"), players);
		kelliharydesert05.setMOBImage(new ImageIcon("Kellidesert05 Monster.jpg"));
		Room kelliharydesert06 = new Room("The Kellihary Desert", "A humongous dry and hot desert. Be careful not to get lost.", new ImageIcon("Kelliharydesert06.jpg"), players);
		kelliharydesert06.setMOBImage(new ImageIcon("Kellidesert06 Monster.jpg"));
		Room kelliharydesertCave = new Room("Kellihary Desert Kellicave", "You find a hidden desert kellicave! A small respite from the sandstorms at least.", new ImageIcon("Kelliharydesert Kellicave.jpg"), players);
		Room kelliharydesertExit = new Room("Kellihary Desert Exit", "FINALLY! You find a path leading out of the desert heading north. Go south to head back into the kellihary desert.", new ImageIcon("Kelliharydesert Exit.jpg"), players);
		Room roadToKellicastle = new Room("Mysterious Kelliroad", "You don't see any signs indicating where this road will lead you. But it continues to wind north.", new ImageIcon("Kellicastle Road.jpg"), players);
		Room kellicastle = new Room("The Kellicastle", "You arrive upon an obviously evil castle. But what the heck, you trudged through a haunted forest so how bad could this be? Plus, maybe that Kellidestiny you are looking for is here. South leads back to the kellihary desert. Go north to enter the kellicastle.", new ImageIcon("Kellicastle.jpg"), players);
		Room kellicastleEntrance = new Room("The Kellicastle", "You walk into a dark church like room. Maybe some kind of kellidevil worship happened here. You see stairs to your east.", new ImageIcon("Kellicastle Entrance.jpg"), players);
		Room kellicastleStairs = new Room("The Kellicastle", "You descend these dark stairs heading north. You can feel your Kellidestiny getting closer", new ImageIcon("Kellicastle to Kellidungeon.jpg"), players);
		Room kellicastleDungeon = new Room("The Kellicastle", "You see what looks like a dungeon to your left. The hall goes on north. You can almost taste the Kellidestiny at this point!", new ImageIcon("Kellidungeon.jpg"), players);
		Room kellicastleDestiny = new Room("The Kellicastle Mysterious Room", "There! That has to be it! Your Kellidestiny to the north!", new ImageIcon("Kellidestiny.jpg"), players);
		Room toBeContinued = new Room("Your Kellidestiny Is...", "That's all folks.", new ImageIcon("Kellicontinue.jpg"), players);
		
		//Manually connecting all the rooms via exits
		kelliwoods.addExit("north", kelliplains);
		
		kelliplains.addExit("east", kelliforest01);
		kelliplains.addExit("west", roadToKelliville);
		kelliplains.addExit("south", kelliwoods);
		
		kelliforest01.addExit("east", kelliforest02);
		kelliforest01.addExit("west", kelliplains);
		kelliforest02.addExit("east", kelliforest03);
		kelliforest02.addExit("west", kelliforest01);
		kelliforest03.addExit("west", kelliforest02);
		
		roadToKelliville.addExit("east", kelliplains);
		roadToKelliville.addExit("west", kelliville);
		
		kelliville.addExit("east", roadToKelliville);
		kelliville.addExit("south", kellivilleAlley);
		kelliville.addExit("north", kellidocks);
		kellivilleAlley.addExit("north", kelliville);
		kellidocks.addExit("south", kelliville);
		Exit toSea = new Exit("north", kellisea02);
		toSea.lock();
		kellidocks.addExit(toSea);
		
		kellisea01.addExit("north", kellisea04);
		kellisea01.addExit("west", kellisea02);
		kellisea02.addExit("east", kellisea01);
		kellisea02.addExit("south", kellidocks);
		kellisea02.addExit("west", kellisea03);
		kellisea02.addExit("north", kellisea05);
		kellisea03.addExit("east", kellisea02);
		kellisea03.addExit("north", kellisea06);
		kellisea04.addExit("south", kellisea01);
		kellisea04.addExit("west", kellisea05);
		kellisea04.addExit("north", kellisea07);
		kellisea05.addExit("east", kellisea04);
		kellisea05.addExit("south", kellisea02);
		kellisea05.addExit("west", kellisea06);
		kellisea05.addExit("north", kellisea08);
		kellisea06.addExit("west", kellisea05);
		kellisea06.addExit("north", kellisea09);
		kellisea06.addExit("south", kellisea03);
		kellisea07.addExit("south", kellisea04);
		kellisea07.addExit("east", kellisea08);
		kellisea08.addExit("west", kellisea07);
		kellisea08.addExit("south", kellisea05);
		kellisea08.addExit("east", kellisea09);
		kellisea09.addExit("west", kellisea08);
		kellisea09.addExit("souh", kellisea06);
		kellisea09.addExit("east", kelliharydesertBeach);
		
		kelliharydesertBeach.addExit("west", kellisea09);
		kelliharydesertBeach.addExit("east", kelliharydesert01);
		
		kelliharydesert01.addExit("west", kelliharydesertBeach);
		kelliharydesert01.addExit("south", kelliharydesert05);
		kelliharydesert01.addExit("east", kelliharydesert02);
		kelliharydesert01.addExit("north", kelliharydesert04);
		kelliharydesert02.addExit("south", kelliharydesert06);
		kelliharydesert02.addExit("west", kelliharydesert01);
		kelliharydesert02.addExit("north", kelliharydesert05);
		kelliharydesert02.addExit("east", kelliharydesert03);
		kelliharydesert03.addExit("west", kelliharydesert02);
		kelliharydesert03.addExit("south", kelliharydesert04);
		kelliharydesert03.addExit("east", kelliharydesert05);
		kelliharydesert03.addExit("north", kelliharydesert06);
		kelliharydesert04.addExit("west", kelliharydesert03);
		kelliharydesert04.addExit("south", kelliharydesert01);
		kelliharydesert04.addExit("east", kelliharydesert05);
		kelliharydesert04.addExit("north", kelliharydesert02);
		kelliharydesert05.addExit("west", kelliharydesert04);
		kelliharydesert05.addExit("south", kelliharydesert02);
		kelliharydesert05.addExit("east", kelliharydesert06);
		kelliharydesert05.addExit("north", kelliharydesert03);
		kelliharydesert06.addExit("west", kelliharydesert05);
		kelliharydesert06.addExit("south", kelliharydesert03);
		kelliharydesert06.addExit("east", kelliharydesert01);
		kelliharydesert06.addExit("north", kelliharydesertCave);
		
		Exit desertExit = new Exit("north", kelliharydesertExit);
		desertExit.lock();
		kelliharydesertCave.addExit(desertExit);
		kelliharydesertCave.addExit("south", kelliharydesert06);
		kelliharydesertExit.addExit("north", roadToKellicastle);
		kelliharydesertExit.addExit("south", kelliharydesert05);
		
		roadToKellicastle.addExit("south", kelliharydesertExit);
		roadToKellicastle.addExit("north", kellicastle);
		
		kellicastle.addExit("south", roadToKellicastle);
		kellicastle.addExit("north", kellicastleEntrance);
		kellicastleEntrance.addExit("south", kellicastle);
		kellicastleEntrance.addExit("east", kellicastleStairs);
		kellicastleStairs.addExit("west", kellicastleEntrance);
		kellicastleStairs.addExit("north", kellicastleDungeon);
		kellicastleDungeon.addExit("south", kellicastleStairs);
		kellicastleDungeon.addExit("north", kellicastleDestiny);
		kellicastleDestiny.addExit("south", kellicastleDungeon);
		Exit toDestiny = new Exit("north", toBeContinued);
		toDestiny.lock();
		kellicastleDestiny.addExit(toDestiny);
		
		//Creating items
		Item sword = new Item("Sword");
		Item shield = new Item("Shield");
		Item coins = new Item("Coins");
		Item caveKey = new Item("Cave Key");
		Item redOrb = new Item("Red Orb");
		Item blueOrb = new Item("Blue Orb");
		Item greenOrb = new Item("Green Orb");
		Item harpoon = new Item("Harpoon");
		
		//Creating MOBs
		MOB forestDemon = new MOB("Kelliforest Demon", kelliforest03, kelliwoods, harpoon, players);
		MOB kraken = new MOB("The Kraken", kellisea07, kellidocks, blueOrb, players);
		MOB desertMonster = new MOB("Kellihary Desert kellimonster", kelliharydesert05, kelliharydesertBeach, caveKey, players);
		
		//Creating Events
		Event forestDemonEvent = new Event("From the shadows creeps a horrifying demon. You feel your mind start to warp and bend just being near it.");
		Option demonFight = new Option("Fight", new Fight(forestDemon));
		Option demonEscape = new Option("Escape", new Escape(forestDemon));
		forestDemonEvent.addOption(demonFight);
		forestDemonEvent.addOption(demonEscape);
		
		Event krakenEvent = new Event("You hear the roar of waves and the sound of a terrible creature as giant tentacles rise from the kellisea. It's the Kraken!");
		Option krakenFight = new Option("Fight", new Fight(kraken));
		Option krakenEscape = new Option("Escape", new Escape(kraken));
		krakenEvent.addOption(krakenFight);
		krakenEvent.addOption(krakenEscape);
		
		Event monsterEvent = new Event("You see the sand in front of you start to shift and rumble. Out comes a vicious looking kellimonster!");
		Option monsterFight = new Option("Fight", new Fight(desertMonster));
		Option monsterEscape = new Option("Escape", new Escape(desertMonster));
		monsterEvent.addOption(monsterFight);
		monsterEvent.addOption(monsterEscape);
		
		Event kellidocksEvent = new Event("You arrive in a busy kellidocks in kelliville. A boat vendor tells you you need coins to pay for a boat in order to cross into the ocean.");
		Option pay = new Option("Pay", new Unlock(kellidocks));
		kellidocksEvent.addOption(pay);
		
		Event caveEvent = new Event("You find a hidden desert kellicave! A small respite from the sandstorms at least. You see what looks like a crude keyhole on the wall in the back.");
		Option unlock = new Option("Insert Key", new Unlock(kelliharydesertCave));
		caveEvent.addOption(unlock);
		
		Event finalEvent = new Event("There! That has to be it! Your Kellidestiny to the north!");
		Option destiny = new Option("Destiny", new Unlock(kellicastleDestiny));
		finalEvent.addOption(destiny);
		
		//Distributing players
		player01.setRoom(kelliwoods);
		player02.setRoom(kelliwoods);
		player03.setRoom(kelliwoods);
		player04.setRoom(kelliwoods);
		
		//Distributing Items
		kelliharydesertCave.addItem(shield);
		kellivilleAlley.addItem(sword);
		kelliwoods.addItem(greenOrb);
		kelliharydesert04.addItem(redOrb);
		kelliforest03.addItem(coins);
		
		//Setting MOB bounds
		forestDemon.addBound(kelliplains);
		kraken.addBound(kellidocks);
		kraken.addBound(kelliharydesertBeach);
		desertMonster.addBound(kelliharydesertBeach);
		desertMonster.addBound(kelliharydesertCave);
		desertMonster.addBound(kelliharydesertExit);
		
		//Distributing Events
		forestDemon.setEvent(forestDemonEvent);
		kraken.setEvent(krakenEvent);
		desertMonster.setEvent(monsterEvent);
		kellidocks.setEvent(kellidocksEvent);
		kelliharydesertCave.setEvent(caveEvent);
		kellicastleDestiny.setEvent(finalEvent);
		
		//Consolidating MOBs
		ArrayList<MOB> mobs = new ArrayList<MOB>();
		mobs.add(forestDemon);
		mobs.add(kraken);
		mobs.add(desertMonster);
		
		//Create GUIs
		ArrayList<GUI> guis = new ArrayList<GUI>();
		for (Player i : players) 
		{
            GUI gui = new GUI((i.getRoom()), i, mobs, players);
            forestDemon.addObserver(gui);
            kraken.addObserver(gui);
            desertMonster.addObserver(gui);
            guis.add(gui);
        }
		
		//Add Observers
		for (GUI i : guis)
		{
        	for (Player j : players)
        	{
        		j.addObserver(i);
        	}
        }
		
		//Creating MOB Threads
		Thread[] mobThreads = new Thread[mobs.size()];
		for (int i = 0; i < mobs.size(); i++)
		{
			mobThreads[i] = new Thread(mobs.get(i));
		}
		
		//Start the Threads
		for (Thread t : mobThreads)
		{
			t.start();
		}
	}
	
	
	public static void main(String[] args) 
	{
		new Boot();
	}

}
