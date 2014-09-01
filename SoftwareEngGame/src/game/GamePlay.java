package game;

import java.util.ArrayList;

public class GamePlay {

	public static ArrayList<String> playerNames = new ArrayList<String>();
	
	
	public static void main(String [] args){
		PlayerIO.getPlayers();
	}
	
	public static void greetPlayer(Player p){
		String out = String.format("<Console> Hello there, %s!", p.getName());
		System.out.println(out);
	}
}
