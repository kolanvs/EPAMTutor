package com.kolanvs.epamtutor.collections;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.*;

public class ListLearn {

    public static void tryList() {

        System.out.println("Sort int");
        ArrayList<Integer> testAL = new ArrayList<>(List.of(2, 3, 6, 7, -2, 7));
        testAL.sort(Integer::compare);
        System.out.println(testAL);

        System.out.println("Collection sort cars");
        ArrayList<Car> testCars = new ArrayList<>(Car.getTestCarList(15));
        Collections.sort(testCars);
        System.out.println(testCars);


        System.out.println("Self sort cars");
        ArrayList<Car> testCarsSelfSort = new ArrayList<>(Car.getTestCarList(15));
        testCarsSelfSort.sort(Comparator.naturalOrder());
        System.out.println(testCarsSelfSort);

        System.out.println("Shuffle cars");
        Collections.shuffle(testCars);
        System.out.println(testCars);

    }

    public static void performanceList() {
        Random rand = new Random(System.nanoTime());
        System.out.println("ArrayList vs LinkedList perf");
        ArrayList<Car> arrayListPerf = new ArrayList<>(Car.getTestCarList(2000000));
        LinkedList<Car> linkedListPerf = new LinkedList<>(Car.getTestCarList(2000000));

        long timeAL = System.currentTimeMillis();
        arrayListPerf.sort(Comparator.naturalOrder());
        System.out.printf("ArrayList sorttime = %d%n", System.currentTimeMillis() - timeAL);
        System.out.println(arrayListPerf.subList(0,20));

        long timeLL = System.currentTimeMillis();
        linkedListPerf.sort(Comparator.naturalOrder());
        System.out.printf("LinkedList sorttime = %d%n", System.currentTimeMillis() - timeLL);
        System.out.println(linkedListPerf.subList(0,20));

        //Test

        timeAL = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            arrayListPerf.add(arrayListPerf.size() % 2, Car.getRandomCar(rand));
        }
        System.out.printf("ArrayList addtime = %d%n", System.currentTimeMillis() - timeAL);

        timeLL = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            linkedListPerf.add(linkedListPerf.size() % 2, Car.getRandomCar(rand));
        }
        System.out.printf("LinkedList addtime = %d%n", System.currentTimeMillis() - timeLL);

    }




}
