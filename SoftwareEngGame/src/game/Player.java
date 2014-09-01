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
	}
}
