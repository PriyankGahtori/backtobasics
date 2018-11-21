package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserExample
{
  public static void main(String[] args)
  {
    ExecutorService exs = Executors.newCachedThreadPool(); 
    Phaser ph = new Phaser(1);
    
    
  }
}
