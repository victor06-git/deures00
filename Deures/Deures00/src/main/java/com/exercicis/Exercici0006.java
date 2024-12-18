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
        
        System.out.println(String.format(Locale.US, "%-35s%.2f€", "Cas 1 (2 adults, 2 nens, 1 gran):", calculaEntrada(2,2,1,"dimarts")));
        System.out.println(String.format(Locale.US, "%-35s%.2f€", "Cas 2 (1 adult, 2 nens, 0 grans):", calculaEntrada(1, 2, 0, "dijous")));
        System.out.println(String.format(Locale.US, "%-35s%.2f€", "Cas 3 (0 adults, 0 nens, 2 grans):", calculaEntrada(0, 0, 2, "dissabte")));
        System.out.println(String.format(Locale.US, "%-35s%.2f€", "Cas 4 (1 adult, 0 nens, 0 grans):", calculaEntrada(1, 0, 0, "diumenge")));
        System.out.println(String.format(Locale.US, "%-35s%.2f€", "Cas 5 (1 adults, 3 nens, 4 gran):", calculaEntrada(1, 3, 4, "dijous")));
        System.out.println(String.format(Locale.US, "%-35s%.2f€", "Cas 6 (2 adults, 2 nens, 1 gran):", calculaEntrada(2, 2, 1, "diumenge")));
    }
}
 