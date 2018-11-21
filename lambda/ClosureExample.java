package lambda;

public class ClosureExample
{
  
  public static void main(String[] args)
  {
    int a = 10;
    int b = 20;
    
    ClosureExample ce = new ClosureExample();
    //process
    /*ce.doProcess(50 , i -> {
          System.out.println(this);
          System.out.println(i+b);
      });*/
    ce.execute(20);
  }
  
  public void execute(int i)
  {
    doProcess(i, q ->{
      System.out.println(this);
      System.out.println(q);
    });
    
  }

  //execution
  public void doProcess(int i, Process p)
  {
    p.process(i);
  }
  
  @Override
  public String toString()
  {
    // TODO Auto-generated method stub
    return "I am ClosureExample Class";
  }
 
}


interface Process{
  void process(int i);
}


