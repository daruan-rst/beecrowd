package com.beecrowd.Ex1023Drought;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cityNumber = 0;
        int x;
        int y;
        while (n != 0); {
            int totalConsumption = 0;
            int population = 0;
            int[][] consumptionRecord = new int[n][2];
            cityNumber++;
            for (int i = 0; i < n; i++) {
                x = sc.nextInt();
                y = sc.nextInt();
                population = population + x;
                totalConsumption = totalConsumption + y;
                consumptionRecord[i][0] = x;
                consumptionRecord[i][1] = y / x;
            }
            System.out.printf("Cidade# %d:\n", cityNumber);
            consumptionRecord = reorderTheResults(consumptionRecord);
            for (int j = 0; j < n; j++) {
                System.out.printf("%d-%d ", consumptionRecord[j][0], consumptionRecord[j][1]);
            }
            System.out.printf("\nConsumo médio: %.2f m3.\n", (float) (totalConsumption / population));
            n = sc.nextInt();
        }

    }

    private static int[][] reorderTheResults(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            int lastValue = array[i - 1][1];
            int thisValue = array[i][1];
            if (thisValue < lastValue) {
                int[] lastArray = array[i - 1];
                array[i - 1] = array[i];
                array[i] = lastArray;

            }

        }
        return array;
    }
}