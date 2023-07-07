package Engine.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car firstCar, Car secondCar) {
        return firstCar.getMark().compareTo(secondCar.getMark());
    }
}
