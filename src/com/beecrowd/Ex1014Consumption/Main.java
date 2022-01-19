package com.beecrowd.Ex1014Consumption;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    int distance = sc.nextInt();
    double fuel = sc.nextDouble();
    System.out.printf("%.3f km/l\n", distance/fuel);
    }


}