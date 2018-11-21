package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Sorting
{
  public static void main(String[] args)
  {
/*    //Sorting List of String
    List<String> lstring = Arrays.asList("New Delhi", "mumbai", "Kolkata", "chennai", "lucknow", "Agra", "agartala");
    System.out.println(lstring);
    
    lstring.sort(String.CASE_INSENSITIVE_ORDER);
    System.out.println(lstring);
    
    lstring.sort(Comparator.naturalOrder());
    System.out.println(lstring);
    
*/    
    /*//Sorting List of Integers
    List<Integer> lint = Arrays.asList(1,3,6,88,22,33,1,2,6,89);
    System.out.println(lint);
    
    lint.sort(Comparator.naturalOrder());
    System.out.println(lint);
    */
    
    
    List<Movie> lmovies = Arrays.asList(new Movie("DDDLJ", "Mumbai", 9.3), new Movie("KKHH", "New Delhi", 8.8), 
        new Movie("Pari", "Kolkata", 6.5), new Movie("Badhai Ho", "Patna", 7.9));
    
    lmovies.sort(Comparator.comparing(Movie::getName));
    
    lmovies.forEach(System.out::println);
    
  }
}
