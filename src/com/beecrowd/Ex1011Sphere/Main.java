package com.beecrowd.Ex1011Sphere;

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
        double radius = sc.nextDouble();
        double volume = (4.0/3)*(Math.pow(radius,3.0))*3.14159;
        System.out.printf("VOLUME = %.3f\n" ,volume );
    }

}