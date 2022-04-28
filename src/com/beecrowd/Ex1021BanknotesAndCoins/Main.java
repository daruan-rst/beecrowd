package com.beecrowd.Ex1021BanknotesAndCoins;

import java.io.IOException;
import java.util.Scanner;


/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    private final static double[] BILLS = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
    private final static double[] COINS = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
    private static double amount;

    public static void main(String[] args) throws IOException {
        double money = sc.nextDouble();
        convert(money);
    }

    private static void convert(double money) {
        money+=0.001;
        System.out.println("NOTAS:");
        for (double note : BILLS){
            amount = Math.floor(money/note);
            System.out.printf("%d nota(s) de R$ %.2f\n", (int) amount, note);
            money -= amount*note;
        }
        System.out.println("MOEDAS:");
        for (double coin : COINS){
            amount = Math.floor(money/coin);
            System.out.printf("%d moeda(s) de R$ %.2f\n", (int) amount, coin);
            money -= amount*coin;
        }

    }


}