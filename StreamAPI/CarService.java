package insight_global.StreamAPI;

import java.util.List;
import java.util.Set;

public interface CarService {

    // Returns the sum of all car prices
    double sumOfPrices(List<Car> carList);

    // Returns the list of car names
    List<String> getCarNames(List<Car> carList);

    // Returns the set of unique car makers
    Set<String> getCarMakers(List<Car> carList);

    // Returns the price of the car which has the highest price
    double getHighPricedCar(List<Car> carList);

    // Returns the car which has the lowest price
    Car getCarWithLowPricedCar(List<Car> carList);
}
