package concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class PCWNTest
{
  public static void main(String[] args)
  {
    Queue<Integer> sharedQueue = new LinkedList<>();
    
    ProducerWaitNotify producer = new ProducerWaitNotify(sharedQueue);
    ConsumerWaitNotify consumer = new ConsumerWaitNotify(sharedQueue);
    
    Thread producerThread = new Thread(producer);
    Thread consumerThread = new Thread(consumer);
    
    producerThread.start();
    consumerThread.start();
  }
}
