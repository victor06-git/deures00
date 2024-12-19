package com.exercicis;

import java.util.Scanner;

public class Exercici0009 {

    public static void dibuixarRectangle(int ample, int alt) {
        
        if(ample < 2 || alt < 2) {
            System.out.println("L'ample i l'alt han de ser com a mínim 2.");
            return;
        }

        System.out.println("*".repeat(ample));
        
        for (int i = 0; i < alt - 2; i++) {
            System.out.println("*" + "o".repeat(ample - 2) + "*");
        }
        System.out.println("*".repeat(ample));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix l'ample del rectangle: ");
        int ample = scanner.nextInt();

        System.out.print("Introdueix l'alt del rectangle: ");
        int alt = scanner.nextInt();

        System.out.println("Resultat:");
        dibuixarRectangle(ample, alt);

        scanner.close();
    }
}
