package com.kolanvs.epamtutor.jsonxmllearn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kolanvs.epamtutor.pojo.Car;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class JsonLearn {

    private static String getFileContent(String filename)
            throws IOException {


        InputStream is = ClassLoader.getSystemResourceAsStream(filename);

        if (is == null) {
            throw new IOException("Error read!!");
        }
        return new String(is.readAllBytes());
    }

    public static void tryJsonBinding() {

        System.out.println("Json binding");
        String carJson;

        try {
            carJson = getFileContent("singleCar.json");
        } catch (IOException e) {
            e.printStackTrace();
            carJson = "";
            System.exit(-2);
        }

        System.out.println(carJson);

        Car carFromJson;

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            carFromJson = objectMapper.readValue(carJson, Car.class);
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
            carFromJson = new Car("", "", 0);
            System.exit(-3);
        }

        System.out.println("Car from json:");
        System.out.println(carFromJson);

    }


}
