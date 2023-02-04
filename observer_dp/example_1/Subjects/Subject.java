package observer_dp.example_1.Subjects;

import observer_dp.example_1.Observers.Observer;

public interface Subject {

	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String text);

}
