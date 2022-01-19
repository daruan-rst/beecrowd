package com.beecrowd.Ex1009SalaryWithBonus;

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
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();
        double total = salary + sales*0.15;
        System.out.printf("TOTAL = R$ %.2f\n" ,total );

    }

}