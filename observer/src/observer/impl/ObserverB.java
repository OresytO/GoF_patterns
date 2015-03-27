package observer.impl;

import observer.Observer;

/**
 * Implementation B of Observer
 *
 * @author OrestO
 * @since 3/26/2015
 */
public class ObserverB implements Observer
{
  /**
   * @see Observer#myNotify()
   */
  @Override
  public void myNotify()
  {
    System.out.println("ObserverB was notified");
  }
}
