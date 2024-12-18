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

        if(dia.equalsIgnoreCase("dijous") && numNens > 0){
            if(numeroAdults >= 1){
                entradaTotal -= entradaNens * 0.5  //Paga la meitat del preu del nen
                entradaTotal -= entradaNens * (numNens - 1); //Paga només un nen
            
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        
        System.out.printf(LocaleUS, )
    }
}
