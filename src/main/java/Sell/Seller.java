package Sell;

import Engine.Car.Car;

public class Seller {
    public static String[] sellerName = new String[10];

    static {
        sellerName[0] = "mohamad";
        sellerName[1] = "elika";
        sellerName[2] = "mehran";
        sellerName[3] = "arezo";
        sellerName[4] = "fatemeh";
    }

    public void sellCar() {
        Car.numberOfSell++;
    }
}
