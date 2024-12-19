package com.exercicis;

import java.util.ArrayList;
import java.util.Random;

public class Exercici0010 {

    public static ArrayList<Integer> generarNumerosAleatoris(int quantitat, int min, int max) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < quantitat; i ++){
            numbers.add(random.nextInt(max - min + 1) + min);
        }
        return numbers;
    }

    public static ArrayList<Integer> multiplicarPerDos(ArrayList<Integer> llista) {
        ArrayList<Integer> multiplicar = new ArrayList<>();
        for (int num : llista ){
            multiplicar.add(num * 2);
        }
        return multiplicar;
    }

    public static ArrayList<Integer> filtrarImparells(ArrayList<Integer> llista) {
        ArrayList<Integer> impar = new ArrayList<>();
        for (int num : llista) {
            if (num % 2 != 0) {
                impar.add(num); 
            }
        }
        return impar;
    }

    public static ArrayList<Double> dividirPerDos(ArrayList<Integer> llista) {
        ArrayList<Double> dividir = new ArrayList<>();
        for (int num : llista) {
            dividir.add(num / 2.0);
        }
        return dividir;
    }

    public static void main(String[] args) {

        ArrayList<Integer> randomList = generarNumerosAleatoris(10, 0, 99);
        System.out.println("Llista inicial: " + randomList);

        ArrayList<Integer> multilist = multiplicarPerDos(randomList);
        System.out.println("Llista multiplicada per 2: " + multilist);

        ArrayList<Integer> imparlist = filtrarImparells(multilist);
        System.out.println("Llista només amb números imparells: " + imparlist);

        ArrayList<Double> divlist = dividirPerDos(multilist);
        System.out.println("Llista imparells dividits per 2: " + divlist);
        
    }   
}
