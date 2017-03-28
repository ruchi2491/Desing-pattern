public class StopState  implements State{

	@Override
	public void pressPlay(Mp3Player mp3Player) {
		
		mp3Player.setState(new StopState());
		System.out.println("The player has been stopped");
	}
	

}
