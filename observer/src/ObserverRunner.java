import observer.impl.ObserverA;
import observer.impl.ObserverB;
import subject.impl.SubjectImpl;

/**
 * @author OrestO
 * @since 3/26/2015
 */
public class ObserverRunner
{

  /**
   * main method to run observer test
   * @param args commandline args
   */
  public static void main(String[] args)
  {
    subject.Subject subject = new SubjectImpl();
    subject.registerObserver(new ObserverA());
    subject.registerObserver(new ObserverB());
    subject.notifyObservers();
  }
}
