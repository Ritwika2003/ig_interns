package insight_global.core;

//MovieMain.java
import java.util.*;

public class MovieMain {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     MovieOperations movieOperations = new MovieOperations();

     List<Movie> movieList = movieOperations.createMovieSet();

     boolean continueRunning = true;

     while (continueRunning) {
         System.out.println("\nMenu:");
         System.out.println("1. Display all movies");
         System.out.println("2. Sort movies by language");
         System.out.println("3. Sort movies by director");
         System.out.println("4. Sort movies by duration");
         System.out.println("5. Exit");
         System.out.print("Choose an option: ");

         int choice = scanner.nextInt();
         scanner.nextLine(); // consume newline

         switch (choice) {
             case 1:
                 System.out.println("All Movies:");
                 movieList.forEach(System.out::println);
                 break;
             case 2:
                 movieOperations.sortByLanguage(movieList);
                 break;
             case 3:
                 movieOperations.sortByDirector(movieList);
                 break;
             case 4:
                 movieOperations.sortByDuration(movieList);
                 break;
             case 5:
                 continueRunning = false;
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid option, please try again.");
         }
     }

     scanner.close();
 }
}

