
public class PauseState implements State {

	public void pressPlay(Mp3Player mp3Player) {
	mp3Player.setState(new PauseState());
	System.out.println("The player is in paused state");
		
	}
	

}
