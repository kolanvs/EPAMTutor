package com.kolanvs.epamtutor.multithread;

import com.kolanvs.epamtutor.pojo.Car;

import java.util.ArrayList;
import java.util.Comparator;

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
        while(newThread.isAlive());

        System.out.println("Thread ending");
    }

}
