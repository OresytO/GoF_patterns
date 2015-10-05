package subject.impl;

import java.util.HashSet;
import java.util.Set;

import observer.Observer;
import subject.Subject;

/**
 * Implementation of subject interface
 *
 * @author OrestO
 * @since 3/26/2015
 */
public class SubjectImpl implements Subject
{
  private Set<Observer> observers = new HashSet<>();

  /**
   * @see Subject#registerObserver(Observer)
   */
  @Override
  public void registerObserver(Observer observer)
  {
    observers.add(observer);
  }

  /**
   * @see Subject#unregisterObserver(Observer)
   */
  @Override
  public void unregisterObserver(Observer observer)
  {
    observers.remove(observer);
  }

  /**
   * @see Subject#notifyObservers()
   */
  @Override
  public void notifyObservers()
  {
    for (Observer observer : observers)
    {
      observer.myNotify();
    }
  }
}
