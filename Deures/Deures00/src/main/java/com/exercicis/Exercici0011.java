package com.exercicis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercici0011 {

    public static ArrayList<String> escullNomsAleatoris(ArrayList<String> noms, int quantitat) {
        if (quantitat > noms.size()){
            throw new IllegalArgumentException("La quantitat no pot ser més gran que " + noms.size() + ".");
        }

        
        
        ArrayList<String> randomlist = new ArrayList<>(); //Primera llista
        Random random = new Random(); //Nou random
        
        ArrayList<String> copiaNoms = new ArrayList<>(); //Segona llista
        for (int i = 0; i < quantitat; i++) {
            if (copiaNoms.isEmpty()) break;
            int index = random.nextInt(copiaNoms.size());
            randomlist.add(copiaNoms.remove(index));
        }

        return randomlist;
    }
   
    public static ArrayList<String> nomsAcabenVocal(ArrayList<String> noms) {
        ArrayList<String> vocales = new ArrayList<>();

        for (String nom : noms){
            String minus = nom.toLowerCase();
            if (minus.endsWith("a") || minus.endsWith("e") || minus.endsWith("i") || minus.endsWith("o") || minus.endsWith("u")){
                vocales.add(nom);
            }
        }

        return vocales;
    }

    public static ArrayList<String> nomsCompostos(ArrayList<String> noms) {
        
        ArrayList<String> compostos = new ArrayList<>();

        for (String nom : noms) {
            if (nom.contains(" ")){
                compostos.add(nom);
            }
        }
        return compostos;
    }

    public static void main(String[] args) {

        ArrayList<String> noms = new ArrayList<>(Arrays.asList(
            "Mario", "Princess Peach", "Wario", "Luigi", "Iggy Koopa", "Toad", "Yoshi", "Donkey Kong", "Birdo"
        ));
        ArrayList<String> llistaAleatoris = escullNomsAleatoris(noms, 5);
        System.out.println("Noms escollits a l'atzar: " + llistaAleatoris);

        

        
        ArrayList<String> acabenVocal = nomsAcabenVocal(noms);
        System.out.println("Noms que acaben amb vocal: " + acabenVocal);

        ArrayList<String> compostosNoms = nomsCompostos(noms);
        System.out.println("Noms compostos: " + compostosNoms);
    }
}
