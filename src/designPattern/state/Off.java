package designPattern.state;

public class Off implements State {
	CeilingFan fan;
	
	public Off(CeilingFan fan, boolean start) {
		this.fan=fan;
		if (!start) 
			System.out.println( "turning off" );
	}

	public void pullGreen() {
	      Low newstate = new Low(fan);
	      fan.setState(newstate);	      
	}
	
	public void pullRed() {
	      High newstate = new High(fan);
	      fan.setState(newstate);
	}
}
