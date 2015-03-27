package subject;

import observer.Observer;

/**
 * Subject interface
 *
 * @author OrestO
 * @since 3/26/2015
 */
public interface Subject
{
  /**
   * method to register current Observer
   *
   * @param observer Observer instance to register
   */
  void registerObserver(Observer observer);

  /**
   * method to unregister current Observer
   *
   * @param observer Observer instance to unregister
   */
  void unregisterObserver(Observer observer);

  /**
   * method to trigger all Observers sign to this event
   */
  void notifyObservers();
}
