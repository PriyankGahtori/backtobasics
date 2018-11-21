package concurrency;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample
{
  public static void main(String[] args)
  {
    
    CyclicBarrier barrier = new CyclicBarrier(3);
    
    Biker b1 = new Biker("Ram", 1000, barrier);
    Biker b2 = new Biker("Shyam", 2000, barrier);
    Biker b3 = new Biker("Anand", 3000, barrier);
    
    Thread t1 = new Thread(b1);
    Thread t2 = new Thread(b2);
    Thread t3 = new Thread(b3);
    
    t1.start();
    t2.start();
    t3.start();
    
    System.out.println("I am main thread.. let bikers cordinate themself.. going to exit..");
    
    
  }
}
