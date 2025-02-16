package insight_global.core;

import java.util.List;
import java.util.Scanner;

// MainApplication.java
public class MainApplication {
    public static void main(String[] args) {
        // Creating the CityStateMap and manually adding city-state pairs
        CityStateMap cityStateMap = new CityStateMap();

        // Manually adding city-state pairs
        cityStateMap.addCityState("New York", "New York");
        cityStateMap.addCityState("Los Angeles", "California");
        cityStateMap.addCityState("Chicago", "Illinois");
        cityStateMap.addCityState("Houston", "Texas");
        cityStateMap.addCityState("Phoenix", "Arizona");
        cityStateMap.addCityState("San Francisco", "California");

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\n1. Get all cities");
            System.out.println("2. Get all states");
            System.out.println("3. Get cities for a state");
            System.out.println("4. Add new city-state pair");
            System.out.println("5. Delete all cities for a given state");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Cities: " + cityStateMap.getAllCities());
                    break;
                case 2:
                    System.out.println("States: " + cityStateMap.getAllStates());
                    break;
                case 3:
                    System.out.print("Enter state: ");
                    String state = scanner.nextLine();
                    List<String> citiesForState = cityStateMap.getCitiesForState(state);
                    System.out.println("Cities for " + state + ": " + citiesForState);
                    break;
                case 4:
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter state: ");
                    String newState = scanner.nextLine();
                    cityStateMap.addCityState(city, newState);
                    System.out.println("City-state pair added.");
                    break;
                case 5:
                    System.out.print("Enter state to delete cities: ");
                    String deleteState = scanner.nextLine();
                    cityStateMap.deleteCitiesForState(deleteState);
                    System.out.println("Cities for state " + deleteState + " deleted.");
                    break;
                case 6:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
