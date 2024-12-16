package com.exercicis;

import java.util.Scanner;

public class Exercici0004 {

    public static int contaMajuscules(String contrasenya) {
        String Mayus = ("AEIOUÁÉÍÓÚÀÈÌÒÙÄËÏÖÜ");

        return 0;
    }

    public static int contaMinuscules(String contrasenya) {
        String minus = ("aeiouáéíóúàèìòùäëïöü");

        return 0;
    }

    public static String validaContrasenya(String contrasenya) {
        
        Integer length = contrasenya.length();
       
        if (length < 8){
            System.out.println("La contrasenya és vàlida");
        } else {
            System.out.println("La contrasenya NO és vàlida");
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escriu una contrasenya: ");
        String contrasenya = scanner.nextLine();
        

        scanner.close();
    }
}
