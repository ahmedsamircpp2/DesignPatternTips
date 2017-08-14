package designPattern.strategy;

public class PointsStrategyLow implements IPointsStrategy {

	public double computePoints(double balance) {
		if (balance > 1000){
			 return balance*0.025;
		}
		else{
			return balance*0.015;
		}
	}

}
