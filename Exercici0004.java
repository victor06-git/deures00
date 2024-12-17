package com.exercicis;

import java.util.Scanner;

public class Exercici0004 {

    public static int contaMajuscules(String contrasenya) {
        
        int cont = 0;
        for (char ma : contrasenya.toCharArray()) {
            if (Character.isUpperCase(ma)) {
                cont ++;
            }
        }

        return 0;
    }

    public static int contaMinuscules(String contrasenya) {
        int count = 0;
        for (char mi : contrasenya.toCharArray()) {
            if (Character.isLowerCase(mi)){
                cont ++;
            }
        }
        return 0;
    }

    public static String validaContrasenya(String contrasenya) {
        
        Integer length = contrasenya.length();
       
        if (length >= 8 && contaMajuscules(contrasenya) >= 2 && contaMinuscules(contrasenya) >= 2){
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

        validaContrasenya(contrasenya);
        

        scanner.close();
    }
}
