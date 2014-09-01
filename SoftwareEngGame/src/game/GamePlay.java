package game;

public class GamePlay {

	public static void main(String [] args){
		Player a = new Player("Joe");
		a.dispName();
		greetPlayer(a);
	}
	
	public static void greetPlayer(Player p){
		String out = String.format("<Console> Hello there, %s!", p.getName());
		System.out.println(out);
	}
}
