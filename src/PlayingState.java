
public class PlayingState  implements State{

	@Override
	public void pressPlay(Mp3Player mp3Player) {
		mp3Player.setState(new PlayingState());
		System.out.println("The player is in playing state");
		
	}
	

}
