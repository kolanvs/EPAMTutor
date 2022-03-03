package com.kolanvs.epamtutor.collections;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class QueueDequeLearn {

    public static void tryQueue() {

        PriorityQueue<Car> carQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Random rand = new Random(System.nanoTime());

        for(int i = 0 ; i < 10 ; i++) {
            carQueue.add(Car.getRandomCar(rand));
        }

        System.out.println(carQueue);

        //Точно не сортирует, но старается
    }

}
