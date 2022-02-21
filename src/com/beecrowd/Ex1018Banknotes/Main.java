package com.beecrowd.Ex1018Banknotes;

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

    public static void main(String[] args) throws IOException {
        int value = sc.nextInt();
        exchange(value);
    }

    private static int[] exchange(int value) {
        int[] bills= new int[7];
        int[] banknotes = new int[]{100,50,20,10,5,2,1};
        System.out.println(value);
        for (int i = 0 ; i<bills.length; i++){
        bills[i] = value/banknotes[i];
        value = value-bills[i]*banknotes[i];
        System.out.println(bills[i] + " nota(s) de R$ " + banknotes[i] + ",00");
        }

    return bills;}


}