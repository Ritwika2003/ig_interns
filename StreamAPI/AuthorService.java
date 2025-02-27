package insight_global.StreamAPI;

import java.util.List;
import java.util.Set;

public interface AuthorService {
    // Get the unique surnames in uppercase
    Set<String> getUniqueSurnames(List<Author> authorList);

    // Get authors by city
    List<Author> getAuthorsByCity(List<Author> authorList, String city);

    // Get average age of female authors
    double femaleAverageAge(List<Author> authorList);

    // Get mobile number by Adhar card
    Long getMobileByAdhar(List<Author> authorList, Long adharCard);
}

