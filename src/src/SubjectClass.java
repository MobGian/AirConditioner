package src;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Gianl
 *	Subject class tiene la lista degli observers interessati agli aggiornamenti della classe Observable
 */
public class SubjectClass {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		norifyAllObservers();
	}

	/***
	 * 
	 * @param observer
	 * Aggiunge classi interessate all'aggiornamento dell'observable nella lista Observer
	 */	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	
	/***
	 * Aggiorna tutti gli observers nella lista Observers degli aggiornamenti della classe Observable
	 */
	private void norifyAllObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update();
		}
	}
	
}
