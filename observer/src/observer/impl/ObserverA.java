package observer.impl;

import observer.Observer;

/**
 * Implementation A of Observer
 *
 * @author OrestO
 * @since 3/26/2015
 */
public class ObserverA implements Observer
{
  /**
   * @see Observer#myNotify()
   */
  @Override
  public void myNotify()
  {
    System.out.println("ObserverA was notified");
  }
}
