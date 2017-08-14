package designPattern.state;

public class Medium implements State {
	CeilingFan fan;
	
	public Medium(CeilingFan fan) {
		this.fan=fan;
		System.out.println( "medium speed" );
	}

	public void pullGreen() {
	      High newstate = new High(fan);
	      fan.setState(newstate);
	}
	
	public void pullRed() {
	      Low newstate = new Low(fan);
	      fan.setState(newstate);
	}
}