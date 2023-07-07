package Engine.Car;

import Engine.Gearbox;
import Engine.Shofer;
import Engine.Sedan;
import Engine.Engine;

import java.util.Objects;

import static Engine.Car.Gear.MANUAL;
import static java.lang.System.out;

public class Car extends Engine implements Sedan, Gearbox, Comparable<Car> {


    public static int numberOfSell;
     public boolean isDoorOpen;
     private String mark;
     private int space;
     private Gear typeOfGear;
     private Shofer shofer;

    public Car() {
    }

    public Car(String mark) {
        this.mark = mark;
    }

    public Car(String mark, int space, Gear typeOfGear) {
        this.mark = mark;
        this.space = space;
        this.typeOfGear = typeOfGear;
    }

    public void openDoor() {
        isDoorOpen = true;
    }

    public void closeDoor() {
        isDoorOpen = false;
    }

    public void isCarMoving() {
        if (!isDoorOpen && isTurnedOn) {
            out.println("Car is Moving");
        } else {
            out.println("Car is parked");
        }
    }

    @Override
    public boolean isMoving() {
        return false;
    }

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public Gear typeGear() {
        return typeOfGear;
    }

    @Override
    public int space() {
        return space;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isDoorOpen=" + isDoorOpen +
                ", mark='" + mark + '\'' +
                ", space=" + space +
                ", typeOfGear=" + typeOfGear +
                ", shofer=" + shofer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return space == car.space && Objects.equals(mark, car.mark) && typeOfGear == car.typeOfGear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, space, typeOfGear);
    }

    @Override
    public int compareTo(Car otherCar) {
        int result = Integer.compare(this.space, otherCar.space);
        if (result == 0) {
            if(Objects.equals(this.typeOfGear, MANUAL)) return -1;
            else return 1;
        }
        return result;
    }
}
