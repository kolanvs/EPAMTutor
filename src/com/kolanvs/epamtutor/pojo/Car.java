package com.kolanvs.epamtutor.pojo;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Car implements Comparable<Car>{
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

    public static Car getCar(String vin, String model, int horsePower) {
        return new Car(vin, model, horsePower);
    }

    public static List<Car> getTestCarList() {
        List<Car> carList= new ArrayList<>();

        carList.add(new Car("D1V2", "Volvo", 250));
        carList.add(new Car("A3A4", "Audi", 120));
        carList.add(new Car("L6M0", "Mercedes", 300));
        carList.add(new Car("Y2F7", "Ferrari", 600));
        carList.add(new Car("F5H9", "Hyundai", 80));

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
    public int compareTo(@NotNull Car anotherCar) {
        return Integer.compare(this.horsePower, anotherCar.horsePower);
    }

}
