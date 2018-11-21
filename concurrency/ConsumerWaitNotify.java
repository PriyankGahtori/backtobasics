package concurrency;

import java.util.Queue;
import java.util.Random;

public class ConsumerWaitNotify implements Runnable
{

  private Queue<Integer> sharedQueue;
  
  
  
  public ConsumerWaitNotify(Queue<Integer> sharedQueue)
  {
    super();
    this.sharedQueue = sharedQueue;
  }



  @Override
  public void run()
  {
    while(true)
    {
      synchronized(sharedQueue)
      {
        while(sharedQueue.isEmpty())
        {
          try
          {
            System.out.println("Consumer is waiting for object");
            sharedQueue.wait();
          }
          catch(InterruptedException e)
          {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }

        int data = sharedQueue.poll();
        System.out.println("Consumed:" + data);
        sharedQueue.notify();
        
      }
    }
  }

}
