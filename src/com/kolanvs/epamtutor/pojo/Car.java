package com.kolanvs.epamtutor.pojo;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

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
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        System.out.printf("Start eq - %s vs %s\n", this.toString(), o.toString());
        if (this == o) return true;
        System.out.println("comp_n1");
        if (o == null || getClass() != o.getClass()) return false;
        System.out.println("comp_n2");
        Car car = (Car) o;
        int result = vin.compareTo(car.vin);
        System.out.printf("comp_result = %d\n", result);
        return result == 0;
    }

    @Override
    public int compareTo(@NotNull Car anotherCar) {
//        System.out.printf("Equality-%s, %d-%s-%s vs %d-%s-%s\n", this.equals(anotherCar) ,
//                this.horsePower, this.model, this.vin, anotherCar.horsePower, anotherCar.model, this.vin);
        if (this.equals(anotherCar)) {
            System.out.printf("Here we are! - %d-%s vs %d-%s\n", this.horsePower, this.model, anotherCar.horsePower, anotherCar.model);
            return 0;
        }
        return Integer.compare(this.horsePower, anotherCar.horsePower);
    }

    @Override
    public int hashCode() {
        System.out.printf("HHAASSHH of %s", this.toString());
        return Objects.hash(vin, 5656);
    }
}
