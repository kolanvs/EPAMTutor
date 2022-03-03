package com.kolanvs.epamtutor.collections;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.*;

public class ListLearn {

    public static void tryArrayList() {

        System.out.println("Sort int");
        ArrayList<Integer> testAL = new ArrayList<>(List.of(2, 3, 6, 7, -2, 7));
        testAL.sort(Integer::compare);
        System.out.println(testAL);

        System.out.println("Collection sort cars");
        ArrayList<Car> testCars = new ArrayList<>(Car.getTestCarList());
        Collections.sort(testCars);
        System.out.println(testCars);


        System.out.println("Self sort cars");
        ArrayList<Car> testCarsSelfSort = new ArrayList<>(Car.getTestCarList());
        testCarsSelfSort.sort(Comparator.naturalOrder());
        System.out.println(testCarsSelfSort);

        System.out.println("Shuffle cars");
        Collections.shuffle(testCars);
        System.out.println(testCars);

    }
}
