package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Biker implements Runnable
{
  
  String name;
  int duration;
  CyclicBarrier barrier;
  
  
  
  
 public Biker(String name, int duration, CyclicBarrier barrier)
  {
    super();
    this.name = name;
    this.duration = duration;
    this.barrier = barrier;
  }




@Override
  public void run()
  {
    // TODO Auto-generated method stub
    System.out.println("I " + name + " will reach barrier Point in " + duration + " ms.");
    
    try
    {
      Thread.sleep(duration);
    }
    catch(InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("I " + name + "  have reached barrier Point. Waiting for others..");
    
    try
    {
      barrier.await();
    }
    catch(InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch(BrokenBarrierException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    System.out.println("Everone has Arrived.... I " + name + " going for re-fuling..");
  } 
}
