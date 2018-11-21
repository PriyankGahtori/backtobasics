package stream;

public class Movie
{
  String name;
  String city;
  double rating;
  
 
  @Override
  public String toString()
  {
    return "Movie [name=" + name + ", city=" + city + ", rating=" + rating + "]";
  }
  public Movie(String name, String city, double rating)
  {
    super();
    this.name = name;
    this.city = city;
    this.rating = rating;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String getCity()
  {
    return city;
  }
  public void setCity(String city)
  {
    this.city = city;
  }
  public double getRating()
  {
    return rating;
  }
  public void setRating(double rating)
  {
    this.rating = rating;
  }
  
  
}
