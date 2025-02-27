package insight_global.StreamAPI;



import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

    public static void main(String[] args) {
        List<Candidate> candidateList = InterviewRepository.getCandidateList();

        // List candidate names from Pune city
        System.out.println("List of Pune Candidates:");
        candidateList.stream()
                .filter(candidate -> "Pune".equalsIgnoreCase(candidate.getCity()))
                .map(Candidate::getName)
                .forEach(System.out::println);
        printLine();

        // List city and count of candidates per city
        System.out.println("Candidate count per city:");
        Map<String, Long> cityCount = candidateList.stream()
                .collect(Collectors.groupingBy(Candidate::getCity, Collectors.counting()));
        cityCount.forEach((city, count) -> System.out.println(city + ": " + count));
        printLine();

        // List technical expertise and count of candidates
        System.out.println("Candidate count by Technical Expertise:");
        Map<String, Long> expertiseCount = candidateList.stream()
                .collect(Collectors.groupingBy(Candidate::getTechnicalExpertise, Collectors.counting()));
        expertiseCount.forEach((expertise, count) -> System.out.println(expertise + ": " + count));
        printLine();

        // List fresher candidates (experience 0)
        System.out.println("Fresher Candidate list:");
        candidateList.stream()
                .filter(candidate -> candidate.getExperience() == 0)
                .forEach(System.out::println);
        printLine();

        // Listing candidates with highest experience
        System.out.println("Sorted List of Candidates by Experience:");
        candidateList.stream()
                .max((c1, c2) -> Integer.compare(c1.getExperience(), c2.getExperience()))
                .ifPresent(System.out::println);
        printLine();

        // Sort the candidates by city name
        System.out.println("Sorted List of Candidates by City Name:");
        candidateList.stream()
                .sorted((c1, c2) -> c1.getCity().compareToIgnoreCase(c2.getCity()))
                .forEach(System.out::println);
        printLine();
    }

    private static void printLine() {
        System.out.println("======================================================");
    }
}

