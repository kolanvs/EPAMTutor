package com.kolanvs.epamtutor.jsonxmllearn;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.kolanvs.epamtutor.pojo.Car;
import net.minidev.json.JSONArray;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
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

    public static void tryJsonBinding() throws IOException {

        System.out.println("Json binding");
        String carJson = getFileContent("singleCar.json");

        System.out.println(carJson);

        Car carFromJson;

        ObjectMapper objectMapper = new ObjectMapper();
        carFromJson = objectMapper.readValue(carJson, Car.class);

        System.out.println("Car from json:");
        System.out.println(carFromJson);

    }

    public static void tryJsonTree() throws IOException {

        System.out.println("Json tree");
        String carArrayJson;

        carArrayJson = getFileContent("carArray.json");
        JsonNode rootNode;

        ObjectMapper objectMapper = new ObjectMapper();
        rootNode = objectMapper.readValue(carArrayJson, JsonNode.class);
        JsonNode arrayCars = rootNode.get("carArray");
        JsonNode opelCar = arrayCars.get(0);
        System.out.printf("Vin of Opel = %s ", opelCar.get("vin").asText());

    }

    public static void tryJsonStreaming() throws IOException {
        System.out.println("Json streaming");
        String carArrayJson;

        carArrayJson = getFileContent("carArray.json");

        JsonParser parser = new JsonFactory().createParser(carArrayJson);

        do {
            JsonToken token = parser.nextToken();
            if (token == JsonToken.VALUE_STRING) {
                System.out.printf("Found : %s\n", parser.getText());
            }
        } while (parser.hasCurrentToken());

    }

    public static void tryJsonPathAndPointer() throws IOException {

        System.out.println("JsonPath and JsonPointer");
        String carArrayJson = getFileContent("carArray.json");

        JSONArray models = JsonPath.read(carArrayJson, "$.carArray[*].model");

        System.out.printf("Founded models from JsonPath: %s\n",
                models.stream().map(Object::toString).collect(Collectors.joining(", ")));

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(carArrayJson);

        System.out.printf("Model of first car from JsonPointer: %s\n", root.at("/carArray/0/model").asText());
    }

}
