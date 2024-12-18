package com.exercicis;

public class Exercici0005 {

    public static boolean isPalindrom(String text) {

        text = normalize(text);
        String inverted = ""; //Creació String invertido
        
        for(int i = text.length() - 1; i >= 0; i--) {
            //Crear string invertido a partir de string para palindrom
            inverted += text.charAt(i);
        }
        return text.equals(inverted);
    }

    public static String normalize(String text) {
        
        String newtext = text.toLowerCase().replace(" ", "").replace("·", "").replace("'", ""); //Treu tots els espais i ajuntar tots els caràcters amb un sol string
        
        return newtext;
    }
   
    public static void main(String[] args) {
        
        String[] frases ={
            "Anul·la la lluna",
            "Atrapa la lluna",
            "Atrapa'l o l'aparta",
            "Aparta'l o atrapa'l",
            "No sap pas on",
            "On sap pas qui",
            "Tramaran anar a Mart",
            "A Mart trobaràn art",
            "Un pop nu",
            "Nu pop un"
        };

        for (String f: frases) {
            boolean esPalindrom = isPalindrom(f);
            System.out.println(f + " (" + (esPalindrom ? "Si" : "No") + ")"); //Print de las frases + si són Palindrom
        }
    }
}
