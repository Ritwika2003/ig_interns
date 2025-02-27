package insight_global.StreamAPI;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class AuthorApp {

    public static void main(String[] args) {
        // Sample data
        Author[] authors = {
            new Author(1234567890L, "Smith", "John", "Doe", LocalDate.of(1990, 5, 10), "male", "New York", 9876543210L),
            new Author(2345678901L, "Johnson", "Emily", "Davis", LocalDate.of(1985, 3, 22), "female", "Chicago", 9876543211L),
            new Author(3456789012L, "Williams", "Sophia", "Brown", LocalDate.of(1993, 8, 15), "female", "New York", 9876543212L),
            new Author(4567890123L, "Jones", "David", "Miller", LocalDate.of(1978, 10, 30), "male", "Los Angeles", 9876543213L)
        };

        List<Author> authorList = new ArrayList<>(Arrays.asList(authors));

        // Create AuthorService instance
        AuthorService authorService = new AuthorServiceImpl();

        try {
            // Test get unique surnames in uppercase
            Set<String> uniqueSurnames = authorService.getUniqueSurnames(authorList);
            System.out.println("Unique Surnames (Uppercase): " + uniqueSurnames);

            // Test get authors by city
            List<Author> authorsInNY = authorService.getAuthorsByCity(authorList, "New York");
            System.out.println("\nAuthors in New York:");
            authorsInNY.forEach(System.out::println);

            // Test get female average age
            double femaleAvgAge = authorService.femaleAverageAge(authorList);
            System.out.println("\nAverage Age of Female Authors: " + femaleAvgAge);

            // Test get mobile number by Adhar card
            Long mobile = authorService.getMobileByAdhar(authorList, 2345678901L);
            System.out.println("\nMobile Number of Author with Adhar Card 2345678901: " + mobile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

