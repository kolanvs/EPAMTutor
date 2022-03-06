package com.kolanvs.epamtutor.multithread;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class StartThreadLearn {

    public static void tryStartThread() {

        System.out.println("First touch of multithreading");
        Runnable task = () -> {
            System.out.println("We are in another thread");
            ArrayList<Car> dummyList = new ArrayList<>(Car.getTestCarList(500000));
            dummyList.sort(Comparator.naturalOrder());
        };

        Thread newThread = new Thread(task);
        newThread.start();
        System.out.println("New thread started");
        try {
            newThread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread ending");
    }

    public static void tryConcurrent() {

        System.out.println("Work with blocking deque");
        BlockingDeque<Integer> bDeque = new LinkedBlockingDeque<>(10);

        Runnable putter = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(150);
                    System.out.printf("We put %d\n", i);
                    bDeque.put(i);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable taker = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.printf("We take %d\n", bDeque.take());
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread putterThread = new Thread(putter);
        Thread takerThread = new Thread(taker);

        putterThread.start();
        takerThread.start();

    }

}
