package com.kolanvs.epamtutor.collections;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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


}
