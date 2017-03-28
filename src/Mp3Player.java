
public class Mp3Player {
	private State state;

	public Mp3Player(State state) {
		
		this.state = state;
	}
	public void play()
	{
		 state.pressPlay(this);
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	

}
