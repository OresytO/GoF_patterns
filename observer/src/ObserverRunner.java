import observer.impl.ObserverA;
import observer.impl.ObserverB;
import subject.impl.SubjectImpl;

/**
 * @author OrestO
 * @since 3/26/2015
 */
public class ObserverRunner
{
  public static void main(String[] args)
  {
    subject.Subject subject = new SubjectImpl();
    subject.registerObserver(new ObserverA());
    subject.registerObserver(new ObserverB());
    subject.notifyObservers();
  }
}
