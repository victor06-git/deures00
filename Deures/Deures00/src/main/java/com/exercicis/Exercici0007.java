package com.exercicis;

import java.util.Locale;

public class Exercici0007 {

    public static double calculaCostLloc(String tipusLloc) {
        double preuEstàndard = 100.0;
        double preuPiscina = 200.0;
        double preuEscenari = 500.0;

        double preuLloc = 0.0;

        switch (tipusLloc.toLowerCase()) {
            case "sala estàndard":
                preuLloc = preuEstàndard;
                break;
            case "jardí amb piscina":
                preuLloc = preuPiscina;
                break;
            case "saló gran amb escenari":
                preuLloc = preuEscenari;
                break;
            default:
                throw new AssertionError();
        }

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

        double preuEntreteniment = 0.0;

        if (tipusEntreteniment.equalsIgnoreCase("Màgia")){
            preuEntreteniment = preuMàgia;
        } else if (tipusEntreteniment.equalsIgnoreCase("Música en directe")){
            preuEntreteniment = preuMúsica;
        } else {
            preuEntreteniment = 0.0;
        }
        
        return preuEntreteniment;
    }

    public static double calculaFesta(String tipusLloc, String tipusMenjar, String tipusEntreteniment, int numConvidats) {
        double preuEntreteniment = calculaCostEntreteniment(tipusEntreteniment);
        double preuLloc = calculaCostLloc(tipusLloc);
        double preuMenjar = calculaCostMenjar(tipusMenjar, numConvidats);

        if (tipusLloc.equalsIgnoreCase("Saló gran amb escenari") && 
            tipusEntreteniment.equalsIgnoreCase("Música en directe")){
            preuEntreteniment = (preuEntreteniment - 100);
        }

        if (numConvidats > 50) {
            preuMenjar = (preuMenjar * 0.95);
        }

        double preuTotal = preuEntreteniment + preuMenjar + preuLloc;

        return preuTotal;
    }

    public static void main(String[] args) {
        double preuTotal_1 = calculaFesta("Sala Estàndard", "Menú Bàsic", "cap", 20);
        double preuTotal_2 = calculaFesta("jardí amb piscina", "menú premium", "màgia", 60);
        double preuTotal_3 = calculaFesta("jardí amb piscina", "menú bàsic", "música en directe", 40);
        double preuTotal_4 = calculaFesta("saló gran amb escenari", "menú premium", "música en directe", 70);
        double preuTotal_5 = calculaFesta("sala estàndard", "menú premium", "màgia", 15);
        

        System.out.println(String.format(Locale.US, "%-75s%.2f€", "Cas 1 (\"sala estàndard\", \"menú bàsic\", \"cap\", 20): ", preuTotal_1));
        System.out.println(String.format(Locale.US, "%-75s%.2f€", "Cas 2 (\"jardí amb piscina\", \"menú premium\", \"màgia\", 60): ", preuTotal_2));
        System.out.println(String.format(Locale.US, "%-75s%.2f€", "Cas 3 (\"jardí amb piscina\", \"menú bàsic\", \"música en directe\", 40): ", preuTotal_3));
        System.out.println(String.format(Locale.US, "%-75s%.2f€", "Cas 4 (\"saló gran amb escenari\", \"menú premium\", \"música en directe\", 70): ", preuTotal_4));
        System.out.println(String.format(Locale.US, "%-75s%.2f€", "Cas 5 (\"sala estàndard\", \"menú premium\", \"màgia\", 15): ", preuTotal_5));
        
    }
}
