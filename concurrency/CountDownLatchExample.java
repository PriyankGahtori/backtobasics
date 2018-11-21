package concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample
{
  public static void main(String[] args)
  {
    final CountDownLatch latch = new CountDownLatch(3);
    
    Passenger p1 = new Passenger("Raj", 1000, "Noida", latch);
    Passenger p2 = new Passenger("Manoj", 2000, "Gurgaon", latch);
    Passenger p3 = new Passenger("Suresh", 1000, "Delhi", latch);
    
    Thread seat1 = new Thread(p1);
    Thread seat2 = new Thread(p2);
    Thread seat3 = new Thread(p3);
    
    seat1.start();
    seat2.start();
    seat3.start();
    
    System.out.println("Waiting For All passengers to arrive...");
    
    try
    {
      latch.await();
    }
    catch(InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    System.out.println("EveryOne has arrived.. Lets start...");
  }
}
