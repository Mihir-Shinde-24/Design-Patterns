package observer_dp.example_1.Subjects;

import java.util.ArrayList;
import java.util.List;

import observer_dp.example_1.Observers.Observer;

public class YTChannel2 implements Subject {

	List<Observer> userList;
	public int videoCount;
	
	public YTChannel2()
	{
		userList = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer)
	{
		userList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer)
	{
		userList.remove(observer);
	}

	@Override
	public void notifyObservers(String text)
	{
		for (Observer observer : userList)
		{
			observer.update(text);
		}
	}

	public void newVideoAdded(String text)
	{
		videoCount++;
		notifyObservers(text);
	}
	
	
}
