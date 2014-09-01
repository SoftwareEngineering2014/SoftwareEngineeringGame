package game;

public class Player {

	private String name;
	
	public Player(String s){
		name = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void dispName(){
		String out = String.format("<%s> Hello, my name is %s.", name, name);
		System.out.println(out);
		String out2 = String.format("<%s>I'm really excited to be in this game.", name);
		System.out.println(out2);
	}
}
