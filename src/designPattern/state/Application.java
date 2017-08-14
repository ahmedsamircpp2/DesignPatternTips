package designPattern.state;

public class Application {


	public static void main(String[] args) {
		CeilingFan fan = new CeilingFan();
		fan.setState(new Off(fan, true));
		fan.pullGreen();
		fan.pullGreen();
		fan.pullGreen();
		fan.pullGreen();
		fan.pullRed();
		fan.pullRed();
	}
}
