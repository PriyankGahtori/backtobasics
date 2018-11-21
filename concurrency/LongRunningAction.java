package concurrency;

import java.util.concurrent.Phaser;

public class LongRunningAction implements Runnable
{
  
  private String threadName;
  private Phaser ph;
  
  
  public LongRunningAction(String threadName, Phaser ph)
  {
    super();
    this.threadName = threadName;
    this.ph = ph;
    ph.register();
  }


  @Override
  public void run()
  {
    // TODO Auto-generated method stub
    ph.arriveAndAwaitAdvance();
    
    try
    {
      Thread.sleep(20);
    }
    catch(InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    ph.arriveAndDeregister();
  }

}
