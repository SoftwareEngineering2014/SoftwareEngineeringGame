package game;

public class GamePlay {

	public static void main(String [] args){
		Player a = new Player("Joe");
		a.dispName();
		greetPlayer(a);
		
		System.out.println("Test 1");
	}
	
	public static void greetPlayer(Player p){
		String out = String.format("<Console> Hello there, %s!", p.getName());
		System.out.println(out);
	}
}
