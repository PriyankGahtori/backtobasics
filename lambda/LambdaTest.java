package lambda;

public class LambdaTest
{
  public static void main(String[] args)
  {
    
    Sum s2 =  new Sum(){

      @Override
      public int getSum(int a, int b)
      {
        // TODO Auto-generated method stub
        return a + b;
      }
       @Override
      public String toString()
      {
        // TODO Auto-generated method stub
        return "I am anonymous...";
      }
     };
     
/*     
     new Runnable()
    {
      
      @Override
      public void run()
      {
        // TODO Auto-generated method stub
        
      }
    };*/
     
     
     Sum s1 = new MySum();
     int k = s1.getSum(2, 3);
     System.out.println(k);
     System.out.println("Implementing way -" + s1);
     
     System.out.println(s2.getSum(4, 5));
     System.out.println("Anonymous way -" + s2);
    
     
     Sum s3 = (a, b) -> a+b;
     System.out.println(s3.getSum(4, 3));
     System.out.println("Lambda way -" + s3);
     
  }
  
  @Override
  public String toString()
  {
    // TODO Auto-generated method stub
    return "I am Main Class";
  }
  
}


//Interface should be functional interface

//it should have only one abstract function, 
//It could have multiple default as well as static function
//But only one Abstract function is allowed

@FunctionalInterface
interface Sum
{
  public int getSum(int a, int b);
  
}


class MySum implements Sum
{

  @Override
  public int getSum(int a, int b)
  {
    // TODO Auto-generated method stub
    return a + b;
  }
  
  @Override
  public String toString()
  {
    // TODO Auto-generated method stub
    return "I am mySum";
  }
  
}