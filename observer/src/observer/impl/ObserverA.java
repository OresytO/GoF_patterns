package observer.impl;

import observer.Observer;

/**
 * @author OrestO
 * @since 3/26/2015
 */
public class ObserverA implements Observer
{
  @Override
  public void myNotify()
  {
    System.out.println("ObserverA was notified");
  }
}
