package designPattern.state;

public class CeilingFan {
	State state;
	
	public void setState(State state) {
		this.state = state;
	}

	public void pullGreen() {
	      state.pullGreen();
	}
	
	public void pullRed() {
		state.pullRed();
	}


}
