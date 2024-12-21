package com.exercicis;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercici0012 {

    public static HashMap<String, Object> createWonder(String name, String location, int age) {
        
        HashMap<String, Object> wonder = new HashMap<>();
        wonder.put("name", name);
        wonder.put("location", location);
        wonder.put("age", age);
        
        return wonder;
    }

    public static void showInformation(ArrayList<HashMap<String, Object>> wonders) {
        for (HashMap<String, Object> wonder : wonders) {
            System.out.println("Name: " + wonder.get("name"));
            System.out.println("Location: " + wonder.get("location"));
            System.out.println("Age: " + wonder.get("age"));
    }

    public static ArrayList<HashMap<String, Object>> sortWondersByName(ArrayList<HashMap<String, Object>> wonders) {
        /*
            TODO: Resol aquí la funció
        */
        return new ArrayList<>();
    }
  
    public static ArrayList<HashMap<String, Object>> getSortedWondersByName(ArrayList<HashMap<String, Object>> wonders, int quantity) {
        /*
            TODO: Resol aquí la funció
        */
        return new ArrayList<>();
    }
   
    public static ArrayList<String> sortNames(ArrayList<HashMap<String, Object>> wonders) {
        /*
            TODO: Resol aquí la funció
        */
        return new ArrayList<>();
    }

    public static ArrayList<HashMap<String, Object>> getOlder(ArrayList<HashMap<String, Object>> wonders, int quantity) {
        /*
            TODO: Resol aquí la funció
        */
        return new ArrayList<>();
    }
   
    public static ArrayList<HashMap<String, Object>> getRegion(ArrayList<HashMap<String, Object>> wonders, String region) {
        /*
            TODO: Resol aquí la funció
        */
        return new ArrayList<>();
    }

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> wonders = new ArrayList<>();
        wonders.add(createWonder("Great Pyramid of Giza", "Egypt", 4500));
        wonders.add(createWonder("Hanging Gardens of Babylon", "Babylon, Mesopotamia", 2500));
        wonders.add(createWonder("Statue of Zeus at Olympia", "Olympia, Greece", 2500));
        wonders.add(createWonder("Temple of Artemis at Ephesus", "Ephesus, Turkey", 2400));
        wonders.add(createWonder("Mausoleum at Halicarnassus", "Halicarnassus, Turkey", 2300));
        wonders.add(createWonder("Colossus of Rhodes", "Island of Rhodes, Greece", 2300));
        wonders.add(createWonder("Lighthouse of Alexandria", "Alexandria, Egypt", 2200));

        /*
            TODO: Resol aquí l'exercici
        */
    }
}
