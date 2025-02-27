package insight_global.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CarApp {

    public static void main(String[] args) {
        // Sample data
        Car[] cars = {
            new Car("Maruti", "Swift Dezire", 810000.00),
            new Car("Hyundai", "Verna", 1100000.00),
            new Car("Toyota", "Innova", 2450000.00),
            new Car("Audi", "Q3", 4500000.00)
        };

        List<Car> carList = new ArrayList<>(Arrays.asList(cars));
        
        // CarService instance
        CarService carService = new CarServiceImpl();

        try {
            // Test sum of prices
            double sum = carService.sumOfPrices(carList);
            System.out.println("Sum of Prices: " + sum);

            // Test getting car names
            List<String> carNames = carService.getCarNames(carList);
            System.out.println("Car Names: " + carNames);

            // Test getting unique car makers
            Set<String> carMakers = carService.getCarMakers(carList);
            System.out.println("Car Makers: " + carMakers);

            // Test getting the highest priced car
            double highPricedCar = carService.getHighPricedCar(carList);
            System.out.println("Highest Priced Car: " + highPricedCar);

            // Test getting the car with the lowest price
            Car lowPricedCar = carService.getCarWithLowPricedCar(carList);
            System.out.println("Car with Lowest Price: " + lowPricedCar);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
