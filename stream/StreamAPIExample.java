package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamAPIExample
{
  public static void main(String[] args)
  {
    System.out.println("JAVA Stream testing");
    
    /*
     * Internal Iteration VS External Iteration
     * 
     */
    
    List<String> strList = Arrays.asList(new String[]{"g","h","i","e","d","a","b","c","d","e","f"}); 
    System.out.println("USING For loop");
    for(String str : strList)
    {
      System.out.println(str.toUpperCase());
    }
    
    System.out.println("USING iterator");
    Iterator<String> itr = strList.listIterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next().toUpperCase());
    }
    
    System.out.println("USING For Each");
    
    strList.forEach(str -> System.out.println(str.toUpperCase()));
    
    
  }
}
