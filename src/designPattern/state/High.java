package designPattern.state;

public class High implements State {
	CeilingFan fan;
	
	public High(CeilingFan fan) {
		this.fan=fan;
		System.out.println( "high speed" );
	}

	public void pullGreen() {
	      Off newstate = new Off(fan, false);
	      fan.setState(newstate);
	}
	
	public void pullRed() {
	      Medium newstate = new Medium(fan);
	      fan.setState(newstate);
	}
}
