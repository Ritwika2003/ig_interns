package insight_global.StreamAPI;


import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService {

    // Get the unique surnames in uppercase
    @Override
    public Set<String> getUniqueSurnames(List<Author> authorList) {
        return authorList.stream()
                         .map(author -> author.getSurname().toUpperCase())  // Convert surname to uppercase
                         .collect(Collectors.toSet());  // Collect as a Set to ensure uniqueness
    }

    // Get authors by city
    @Override
    public List<Author> getAuthorsByCity(List<Author> authorList, String city) {
        return authorList.stream()
                         .filter(author -> author.getCity().equalsIgnoreCase(city))  // Filter authors by city
                         .collect(Collectors.toList());  // Collect matching authors into a list
    }

    // Get the average age of female authors
    @Override
    public double femaleAverageAge(List<Author> authorList) {
        LocalDate currentDate = LocalDate.now();
        
        return authorList.stream()
                         .filter(author -> author.getGender().equalsIgnoreCase("female"))  // Filter female authors
                         .mapToInt(author -> Period.between(author.getBirthdate(), currentDate).getYears())  // Calculate age
                         .average()  // Calculate average age
                         .orElse(0.0);  // Return 0 if no female authors
    }

    // Get mobile number by Adhar card
    @Override
    public Long getMobileByAdhar(List<Author> authorList, Long adharCard) {
        return authorList.stream()
                         .filter(author -> author.getAdharCard().equals(adharCard))  // Find author by Adhar card
                         .map(Author::getMobile)  // Extract mobile number
                         .findFirst()  // Get the first result (if any)
                         .orElse(null);  // Return null if not found
    }
}
