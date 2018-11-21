package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEachStream
{
  
  public static void main(String[] args)
  {
    List<Integer> l1 = Arrays.asList(23,11,4,1,2,3,4,5,6,45,67,88,7,8,9,10);
    
   /* System.out.println("Using Basic For");
    for(int i = 0; i < l1.size() ; i++)
      System.out.println(l1.get(i));

    System.out.println("Using for in");
    for(Integer i : l1)
      System.out.println(i);*/
    
    System.out.println("Using for each");
    //long qq = 
    l1.stream()
    //.filter(i -> i%2 == 0)
    //.sorted()
    //.sorted(Comparator.comparing(keyExtractor))
    //.sorted(Comparator.comparingInt())
    .forEach(System.out::println);
    
    //System.out.println( qq);
    //.forEach(System.out::println);
    //l1.forEach(System.out::println);
    //l1.forEach((i)-> System.out.println(2*i));
    //l1.forEach(action);
  }
}
