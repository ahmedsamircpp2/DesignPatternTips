package designPattern.state;

public class Low implements State {
	CeilingFan fan;
	
	public Low(CeilingFan fan) {
		this.fan=fan;
		System.out.println( "low speed" );
	}

	public void pullGreen() {
	      Medium newstate = new Medium(fan);
	      fan.setState(newstate);
	}
	
	public void pullRed() {
	      Off newstate = new Off(fan, false);
	      fan.setState(newstate);
	}
}