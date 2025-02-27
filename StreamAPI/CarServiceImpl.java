package insight_global.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    // Returns the sum of all car prices
    @Override
    public double sumOfPrices(List<Car> carList) {
        return carList.stream()
                      .mapToDouble(Car::getPrice)  // Maps each car to its price
                      .sum();  // Sums up all the prices
    }

    // Returns the list of car names
    @Override
    public List<String> getCarNames(List<Car> carList) {
        return carList.stream()
                      .map(Car::getCarName)  // Maps each car to its name
                      .collect(Collectors.toList());  // Collects the names into a list
    }

    // Returns the set of unique car makers
    @Override
    public Set<String> getCarMakers(List<Car> carList) {
        return carList.stream()
                      .map(Car::getCareMake)  // Maps each car to its make
                      .collect(Collectors.toSet());  // Collects unique makes into a set
    }

    // Returns the price of the car which has the highest price
    @Override
    public double getHighPricedCar(List<Car> carList) {
        return carList.stream()
                      .max(Comparator.comparingDouble(Car::getPrice))  // Finds the car with the highest price
                      .map(Car::getPrice)  // Maps it to its price
                      .orElse(0.0);  // Returns 0 if the list is empty
    }

    // Returns the car which has the lowest price
    @Override
    public Car getCarWithLowPricedCar(List<Car> carList) {
        return carList.stream()
                      .min(Comparator.comparingDouble(Car::getPrice))  // Finds the car with the lowest price
                      .orElse(null);  // Returns null if the list is empty
    }
}
