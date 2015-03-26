package subject;

import observer.Observer;

/**
 * @author OrestO
 * @since 3/26/2015
 */
public interface Subject
{
  void registerObserver(Observer observer);

  void unregisterObserver(Observer observer);

  void notifyObservers();
}
