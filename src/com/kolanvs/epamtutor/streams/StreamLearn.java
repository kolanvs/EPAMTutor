package com.kolanvs.epamtutor.streams;

import com.kolanvs.epamtutor.pojo.Car;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamLearn {

    public static void tryStream(){

        System.out.println("Simple stream");
        System.out.println("Before work");
        ArrayList<Car> newCarArray = Car.getTestCarList(10)
                .stream()
                .peek(System.out::println)
                .filter(car -> car.getHorsePower() > 15_000_000)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("After work");
        newCarArray.forEach(System.out::println);

    }

}
