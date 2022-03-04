package com.kolanvs.epamtutor.collections;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.*;

public class SetMapLearn {

    public static void trySet() {

        System.out.println("Unordered set");
        HashSet<Car> garage = new HashSet<>();
        garage.add(new Car("A1", "BMW", 200));
        garage.add(new Car("B1", "Audi", 100));
        garage.add(new Car("C1", "Opel", 300));
        //System.out.println(garage);

        System.out.println("Ordered set");
        LinkedHashSet<Car> garageOrd = new LinkedHashSet<>();
        garageOrd.add(new Car("A1", "BMW", 100));
        garageOrd.add(new Car("B1", "Audi", 200));
        garageOrd.add(new Car("C1", "Opel", 300));
        //System.out.println(garageOrd);

        System.out.println("Tree set - sorted set");
        TreeSet<Car> garageTree = new TreeSet<>();
        garageTree.add(new Car("A1", "BMW", 400));
        garageTree.add(new Car("B1", "Audi", 300));
        garageTree.add(new Car("C1", "Opel", 200));
        System.out.println(garageTree);
    }

    public static void tryMap() {

        System.out.println("Elementary map");
        ArrayList<Car> carList = new ArrayList<>(Car.getTestCarList(5));
        HashMap<String, Car> mapCar = new HashMap<>();
        for (int i = 0; i < carList.size(); i++) {
            mapCar.put(Integer.toString(i), carList.get(i));
        }

        mapCar.forEach((key, value) -> System.out.printf("%s --- %s\n", key, value.toString()));
        //Все равно выводится в порядке добавления, хотя и не LinkedHashMap

        System.out.println("Linked hash map with access order");
        //Почему второй аргумент обязательно Float
        LinkedHashMap<String, Car> lhmCar = new LinkedHashMap<>(5, 0.75F, true);

        for (int i = 0; i < carList.size(); i++) {
            lhmCar.put(Integer.toString(i), carList.get(i));
        }

        lhmCar.get("2");
        lhmCar.get("0");
        lhmCar.get("1");
        lhmCar.forEach((key, value) -> System.out.printf("%s --- %s\n", key, value.toString()));

        System.out.println("Tree map");
        TreeMap<String, Car> treeCar = new TreeMap<>();

        for (Car car : carList) {
            treeCar.put(car.getVin(), car);
        }
        treeCar.forEach((key, value) -> System.out.printf("%s --- %s\n", key, value.toString()));
        //Отсортировано




    }


}
