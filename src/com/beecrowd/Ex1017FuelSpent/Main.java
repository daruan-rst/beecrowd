package com.beecrowd.Ex1017FuelSpent;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static double AVARAGE_CONSUMPTION = 12;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int time = sc.nextInt();
        int meanVelocity = sc.nextInt();
        System.out.printf("%.3f\n",time*meanVelocity/AVARAGE_CONSUMPTION);
    }

}