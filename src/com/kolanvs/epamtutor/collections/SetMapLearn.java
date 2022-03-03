package com.kolanvs.epamtutor.collections;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMapLearn {

    public static void trySet() {

//        System.out.println("Unordered set");
//        HashSet<Car> garage = new HashSet<>();
//        garage.add(new Car("A1", "BMW", 200));
//        garage.add(new Car("B1", "Audi", 100));
//        garage.add(new Car("C1", "Opel", 300));
//        //System.out.println(garage);
//
//        System.out.println("Ordered set");
//        LinkedHashSet<Car> garageOrd = new LinkedHashSet<>();
//        garageOrd.add(new Car("A1", "BMW", 100));
//        garageOrd.add(new Car("B1", "Audi", 200));
//        garageOrd.add(new Car("C1", "Opel", 300));
//        //System.out.println(garageOrd);
//
//        System.out.println("Tree set - sorted set");
//        TreeSet<Car> garageTree = new TreeSet<>();
//        garageTree.add(new Car("A1", "BMW", 400));
//        garageTree.add(new Car("B1", "Audi", 300));
//        garageTree.add(new Car("TT", "Opel", 200));
//        //System.out.println(garageTree);
//
//        System.out.println("Add same to garage");
//        garageTree.add(new Car("D1", "Volga", 100));
//        garageTree.add(new Car("TT", "Maybach", 700)); //Vin same as in Opel
//        System.out.println(garageTree);

        TreeSet<Car> garageTree = new TreeSet<>();
////
//        Car car1 = new Car("C1", "Opel", 200);
//        Car car2 = new Car("C1", "Maybach", 700);
//
//        garageTree.add(car1);
//        garageTree.add(car2);
//
        garageTree.add(new Car("TT", "BMW", 400));
        garageTree.add(new Car("B1", "Audi", 300));
        garageTree.add(new Car("TT", "Opel", 200));
        garageTree.add(new Car("D1", "Volga", 100));
        garageTree.add(new Car("TT", "Maybach", 700)); //Vin same as in Opel

        System.out.println(garageTree);

        //Сравнение происходит по compare!!!!

    }


}
