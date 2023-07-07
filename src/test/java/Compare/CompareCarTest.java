package Compare;

import Engine.Car.CarComparator;
import org.junit.jupiter.api.Test;

import Engine.Car.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Engine.Car.Gear.AUTOMATE;
import static Engine.Car.Gear.MANUAL;
import static org.assertj.core.api.Assertions.assertThat;

public class CompareCarTest {

    @Test
    void should_sort_cars() {

        Car benz_1 = new Car("Benz", 150, MANUAL);
        Car benz_2 = new Car("Benz", 100, AUTOMATE);
        Car benz_3 = new Car("Benz", 50, MANUAL);
        Car benz_4 = new Car("Benz", 50, AUTOMATE);

        List<Car> cars = new ArrayList<>();

        cars.add(benz_1);
        cars.add(benz_2);
        cars.add(benz_3);
        cars.add(benz_4);
        Collections.sort(cars);

        List<Car> expectedCar = new ArrayList<>();
        expectedCar.add(benz_3);
        expectedCar.add(benz_4);
        expectedCar.add(benz_2);
        expectedCar.add(benz_1);
        assertThat(cars).isEqualTo(expectedCar);
    }

    @Test
    void should_sort_cars_mark() {

        Car benz = new Car("Benz", 150, MANUAL);
        Car mercedes = new Car("Mercedes", 100, AUTOMATE);
        Car nissan = new Car("Nissan", 50, MANUAL);
        Car alfaRomeo = new Car("Alfa Romeo", 50, AUTOMATE);

        List<Car> cars = new ArrayList<>();

        cars.add(benz);
        cars.add(mercedes);
        cars.add(nissan);
        cars.add(alfaRomeo);
        cars.sort(new CarComparator());

        List<Car> expectedCar = new ArrayList<>();
        expectedCar.add(alfaRomeo);
        expectedCar.add(benz);
        expectedCar.add(mercedes);
        expectedCar.add(nissan);
        assertThat(cars).isEqualTo(expectedCar);
    }
}
