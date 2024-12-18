package com.exercicis;

import java.util.Locale;

public class Exercici0006 {

    public static double calculaEntrada(int numeroAdults, int numNens, int numGrans, String dia) {
        
        double entradaAdults = 10.0;
        double entradaNens = 5.0;
        double entradaGrans = 6.0;

        double entradaTotal = (numeroAdults * entradaAdults) + (numNens * entradaNens) + (numGrans * entradaGrans);

        if(dia.equalsIgnoreCase("dimarts")){
            entradaTotal = entradaTotal - (entradaTotal * 0.2);
        }

        if(dia.equalsIgnoreCase("dijous") && numNens > 0 && numeroAdults >= 1){
                entradaTotal -= entradaNens * 0.5;  //Paga la meitat del preu del nen
                entradaTotal -= entradaNens * (numNens - 1); //Paga només un nen
        }

        return entradaTotal;
    }

    public static void main(String[] args) {
        
        System.out.println(String.format(Locale.US, "%-25s%.2f€", "Cas 1 (2 adults, 2 nens, 1 gran):", calculaEntrada(numeroAdults:2, numNens:2, numGrans:1, dia:"dimarts")));
        System.out.println(String.format(Locale.US, "%-25s%.2f€", "Cas 2 (1 adult, 2 nens, 0 grans):", calculaEntrada(numeroAdults:1, numNens:2, numGrans:0, dia:"dijous")));
        System.out.println(String.format(Locale.US, "%-25s%.2f€", "Cas 3 (0 adults, 0 nens, 2 grans):", calculaEntrada(numeroAdults:0, numNens:0, numGrans:2, dia:"dissabte")));
        System.out.println(String.format(Locale.US, "%-25s%.2f€", "Cas 4 (1 adult, 0 nens, 0 grans):", calculaEntrada(numeroAdults:1, numNens:0, numGrans:0, dia:"diumenge")));
    }
}
