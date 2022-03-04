package com.kolanvs.epamtutor.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Car implements Comparable<Car> {
    private String vin;
    private String model;
    private int horsePower;

    public Car(String vin, String model, int horsePower) {
        this.vin = vin;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public static Car getRandomCar(Random rand) {
        ArrayList<String> types = new ArrayList<>(List.of("Volvo", "Audi", "Mercedes", "VW", "Skoda", "Lada"));

        return new Car(
                Long.toHexString(Double.doubleToLongBits(Math.random())).substring(2),
                types.get(Math.abs(rand.nextInt()) % 6),
                Math.abs(rand.nextInt()) % 10000000 + 10000000);
    }

    public static List<Car> getTestCarList(int quantity) {
        List<Car> carList = new ArrayList<>();
        Random rand = new Random(System.nanoTime());

        for (int i = 0; i < quantity; i++) {
            carList.add(getRandomCar(rand));
        }
        return carList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        int result = vin.compareTo(car.vin);
        return result == 0;
    }

    @Override
    public int compareTo(Car anotherCar) {
        if (this.equals(anotherCar)) {
            return 0;
        }
        return Integer.compare(this.horsePower, anotherCar.horsePower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, 5656);
    }
}
