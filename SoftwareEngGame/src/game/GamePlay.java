package game;

import java.util.ArrayList;

public class GamePlay {

	public static ArrayList<String> playerNames = new ArrayList<String>();
	public static Player players[];
	
	public static void main(String [] args){
		PlayerIO.getPlayers();
		players = new Player[playerNames.size()];
		for(int i = 0; i < playerNames.size(); i++){
			players[i] = new Player(playerNames.get(i));
		}
		lineSep();
	}
	
	public static void lineSep(){
		String br = "------------------------------------------------------";
		System.out.println(br);
	}
}