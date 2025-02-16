package insight_global.core;

//MovieOperations.java
import java.util.*;

public class MovieOperations {

 // Method to create the list of movies
 public List<Movie> createMovieSet() {
     List<Movie> movieList = new ArrayList<>();

     // Adding sample movies to the list
     try {
         movieList.add(new Movie("Inception", "English", new Date(2010, 7, 16), "Christopher Nolan", 
                                 "Emma Thomas", 148));
         movieList.add(new Movie("Parasite", "Korean", new Date(2019, 5, 30), "Bong Joon-ho", 
                                 "Bong Joon-ho", 132));
         movieList.add(new Movie("Dilwale Dulhania Le Jayenge", "Hindi", new Date(1995, 10, 20), 
                                 "Aditya Chopra", "Aditya Chopra", 190));
         movieList.add(new Movie("The Dark Knight", "English", new Date(2008, 7, 18), "Christopher Nolan", 
                                 "Emma Thomas", 152));
         movieList.add(new Movie("Lagaan", "Hindi", new Date(2001, 6, 15), "Ashutosh Gowariker", 
                                 "Aamir Khan", 224));
     } catch (Exception e) {
         e.printStackTrace();
     }

     return movieList;
 }

 // Method to sort movies by language using Comparable
 public void sortByLanguage(List<Movie> movieList) {
     Collections.sort(movieList);
     System.out.println("Movies sorted by language:");
     movieList.forEach(System.out::println);
 }

 // Method to sort movies by duration
 public void sortByDuration(List<Movie> movieList) {
     movieList.sort(Comparator.comparingInt(Movie::getDuration));
     System.out.println("Movies sorted by duration:");
     movieList.forEach(System.out::println);
 }

 // Method to sort movies by director using Comparator
 public void sortByDirector(List<Movie> movieList) {
     movieList.sort(new DirectorComparator());
     System.out.println("Movies sorted by director:");
     movieList.forEach(System.out::println);
 }
}


