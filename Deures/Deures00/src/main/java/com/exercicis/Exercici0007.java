package com.exercicis;

public class Exercici0007 {

    public static double calculaCostLloc(String tipusLloc) {
        double preuEstàndard = 100.0;
        double preuPiscina = 200.0;
        double preuEscenari = 500.0;

        double preuLloc = 0.0;

        if (tipusLloc.equalsIgnoreCase("Sala Estàndard")){
            preuLloc = preuEstàndard;
        } else if (tipusLloc.equalsIgnoreCase("Jardí amb piscina")) {
            preuLloc = preuPiscina;
        } else {
            preuLloc = preuEscenari;
        }
       
        return preuLloc;
    }

    public static double calculaCostMenjar(String tipusMenjar, int numConvidats) {
        double preuBàsic = 15.0;
        double preuPremium = 30.0;

        double preuMenjar = 0.0;

        if (tipusMenjar.equalsIgnoreCase(" Menú Bàsic")) {
            preuMenjar = (preuBàsic * numConvidats);
        } else {
            preuMenjar = (preuPremium * numConvidats);
        }
        return preuMenjar;
    }

    public static double calculaCostEntreteniment(String tipusEntreteniment) {
        double preuMàgia = 250.0;
        double preuMúsica = 500.0;

        
        return 0.0;
    }

    public static double calculaFesta(String tipusLloc, String tipusMenjar, String tipusEntreteniment, int numConvidats) {
        /*
            TODO: Resol aquí la funció
        */
        return 0.0;
    }

    public static void main(String[] args) {
        /*
            TODO: Resol aquí l'exercici
        */
    }
}
