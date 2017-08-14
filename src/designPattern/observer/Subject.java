package designPattern.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Subject implements ISubject {
  private Collection<IObserver> observerlist = new ArrayList();
  
  public void addObserver(IObserver observer){
	  observerlist.add(observer);
  }
  
  public void doNotify(User user){
	  Iterator<IObserver> iterator = observerlist.iterator();
	  while(iterator.hasNext()){
		  IObserver observer = iterator.next();
		  observer.update(user);
	  }
  }
  
}
