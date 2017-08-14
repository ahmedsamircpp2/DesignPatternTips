package designPattern.strategy;

public class PointsStrategyHigh implements IPointsStrategy {

	public double computePoints(double balance) {
		if (balance > 5000){
			return balance*0.04;
		}
		else{
			if (balance > 1000){
				return balance*0.02;
			}
			else{
				return balance*0.01;
			}
		}
	}

}
