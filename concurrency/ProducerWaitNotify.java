package concurrency;

import java.util.Queue;
import java.util.Random;

public class ProducerWaitNotify implements Runnable
{

  private Queue<Integer> sharedQueue;
  private final int MAX_SIZE =5;
  
  
  
  public ProducerWaitNotify(Queue<Integer> sharedQueue)
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
        while(sharedQueue.size() ==5)
        {
          try
          {
            System.out.println("Producer is waiting to consume object by consumer");
            sharedQueue.wait();
          }
          catch(InterruptedException e)
          {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        Random rm = new Random();
        int data = rm.nextInt(MAX_SIZE);
        sharedQueue.add(data);
        System.out.println("Produced:" + data);
        try
        {
          Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        sharedQueue.notify();
        
      }
    }
  }

}
