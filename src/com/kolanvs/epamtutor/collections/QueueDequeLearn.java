package com.kolanvs.epamtutor.collections;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.*;

public class QueueDequeLearn {

    public static void tryQueue() {

        PriorityQueue<Car> carQueue = new PriorityQueue<>(Comparator.reverseOrder());
        Random rand = new Random(System.nanoTime());

        for(int i = 0 ; i < 10 ; i++) {
            carQueue.add(Car.getRandomCar(rand));
        }

        while(!carQueue.isEmpty()) {
            System.out.println(carQueue.poll());
        }

        //Вывод через .toString Некорректен!!!!!!!!
    }
}
