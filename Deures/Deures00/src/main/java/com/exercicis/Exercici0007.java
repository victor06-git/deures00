package com.exercicis;

import java.util.Locale;

public class Exercici0007 {

    public static double calculaCostLloc(String tipusLloc) {
        double preuEstàndard = 100.0;
        double preuPiscina = 200.0;
        double preuEscenari = 500.0;

        double preuLloc = 0.0;

        switch (tipusLloc.toLowerCase()) {
            case "sala estàndard" -> preuLloc = preuEstàndard;
            case "jardí amb piscina" -> preuLloc = preuPiscina;
            case "saló gran amb escenari" -> preuLloc = preuEscenari;
            default -> throw new IllegalArgumentException("Lloc desconegut: " + tipusLloc);
        }
        return preuLloc;
    }

    public static double calculaCostMenjar(String tipusMenjar, int numConvidats) {
        double preuBàsic = 15.0;
        double preuPremium = 30.0;

        double preuMenjar = 0.0;

        switch (tipusMenjar.toLowerCase()) {
            case "menú bàsic" -> preuMenjar = preuBàsic;
            case "menú premium" -> preuMenjar = preuPremium;
            default -> throw new IllegalArgumentException("Menú desconegut: " + tipusMenjar);
        }
        double preuMenjarTotal = (numConvidats > 50) ? (preuMenjar * numConvidats) * 0.95 : preuMenjar * numConvidats;
        
        return preuMenjarTotal;
    }

    public static double calculaCostEntreteniment(String tipusEntreteniment) {
        
        double preuMàgia = 250.0;
        double preuMúsica = 500.0;

        double preuEntreteniment = 0.0;

        switch (tipusEntreteniment.toLowerCase()) {
            case "màgia" -> preuEntreteniment = preuMàgia;
            case "música en directe" -> preuEntreteniment = preuMúsica;
            case "cap" -> preuEntreteniment = 0.0;
            default -> throw new IllegalArgumentException("Entreteniment desconegut: " + tipusEntreteniment);
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
