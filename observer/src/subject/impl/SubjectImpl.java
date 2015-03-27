package subject.impl;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import subject.Subject;

/**
 * @author OrestO
 * @since 3/26/2015
 */
public class SubjectImpl implements Subject
{
  private List<Observer> observers = new ArrayList<>(10);

  @Override
  public void registerObserver(Observer observer)
  {
    observers.add(observer);
  }

  @Override
  public void unregisterObserver(Observer observer)
  {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers()
  {
    for (Observer observer : observers)
    {
      observer.myNotify();
    }
  }
}
