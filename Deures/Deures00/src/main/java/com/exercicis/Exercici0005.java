package com.exercicis;

public class Exercici0005 {

    public static boolean isPalindrom(String text) {
        
        String newtext = text.toLowerCase().replace(" ", "").replace("·", "").replace("'", ""); //Treu tots els espais i ajuntar tots els caràcters amb un sol string
        
        for(char c: newtext.toCharArray()){
            //Crear string a partir de array invertido para palindrom
            String inverted = "Hola";
        }
        String inverted = "Hola";
       
        if (newtext = inverted){
            System.out.println("Hola");
        } else {
            System.out.println("False ");
        }

        return false;
    }

    public static String normalize(String text) {
        
        String resultat  = "Si";
        System.out.printf("'%s' (%s)", text, resultat);
        
        return "";
    }
   
    public static void main(String[] args) {
        
        String text = "Anul·la la lluna";

    }
}
