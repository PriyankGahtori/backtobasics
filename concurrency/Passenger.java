package concurrency;

import java.util.concurrent.CountDownLatch;

public class Passenger implements Runnable
{
  
  String name;
  int waitTime;
  String destination;
  CountDownLatch latch;


  public Passenger(String name, int waitTime, String destination, CountDownLatch latch)
  {
    super();
    this.name = name;
    this.waitTime = waitTime;
    this.destination = destination;
    this.latch = latch;
  }


  @Override
  public void run()
  {
    // TODO Auto-generated method stub
    System.out.println("Occupying Seat for Passanger: " + this.name + " Wait time: " + this.waitTime);
    
    try
    {
     Thread.sleep(waitTime);
    }
    catch(InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    System.out.println(this.name + " Passenger arrived...");
    latch.countDown();
  }

}
