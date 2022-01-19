package com.beecrowd.Ex1010SimpleCalculate;

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
        double total = 0;
        int size = 2;
        String[] line;
        String[] codes = new String[size];
        int[] quantities = new int[size];
        double[] prices = new double[size];
        for (int i=0 ; size>i ; i++){
            line = sc.nextLine().split(" ");
            codes[i] = line[0];
            quantities[i] = Integer.parseInt(line[1]);
            prices[i] = Double.parseDouble(line[2]);
            total = total + prices[i]*quantities[i];
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" ,total );

    }

}