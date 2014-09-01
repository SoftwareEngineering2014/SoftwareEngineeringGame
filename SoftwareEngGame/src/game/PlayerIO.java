package game;


import javax.swing.JOptionPane;

public class PlayerIO {

	public static void getPlayers(){
		int numPlayers = 0;
		try{
			numPlayers = Integer.parseInt(JOptionPane.showInputDialog(null,"How many players would you like in the game?", "Waiting for Input", JOptionPane.QUESTION_MESSAGE));
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "That is not a valid number.", "Game Error", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Game Ended.", "Game Information", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		for(int i = 1; i <= numPlayers; i++){
			boolean isEntered = false;
			while(isEntered == false){
				String out = String.format("Player %s, enter your name.", i);
				String name = "";
				try{
					name = JOptionPane.showInputDialog(out).toLowerCase();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Game Ended.", "Game Information", JOptionPane.INFORMATION_MESSAGE);
				}

				if (GamePlay.playerNames.contains(name)){
					JOptionPane.showMessageDialog(null, "That name is already taken.", "Game Error", JOptionPane.ERROR_MESSAGE);
					isEntered = false;
				}
				else if(name.equals(null)){
					isEntered = false;
					JOptionPane.showMessageDialog(null, "That name is not valid.", "Game Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					GamePlay.playerNames.add(name);
					isEntered = true;
				}
			}
		}
	}
	
}
