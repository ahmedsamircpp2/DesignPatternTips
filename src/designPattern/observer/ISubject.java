package designPattern.observer;

public interface ISubject {

	public abstract void addObserver(IObserver observer);
	public abstract void doNotify(User user);

}