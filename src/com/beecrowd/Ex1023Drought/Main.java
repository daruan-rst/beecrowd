package com.beecrowd.Ex1023Drought;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static int x, y, n, cityNumber, globalConsumption, globalPeople;
    static Integer[] houseConsumption, numberOfPeople;
    static double globalMean;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0) {
            cityNumber++;
            houseConsumption = new Integer[n];
            numberOfPeople = new Integer[n];
            globalConsumption = 0;
            globalPeople = 0;
            sc.nextLine(); // remove \n do console
            for (int i = 0; i < n; i++) {
                String values = sc.nextLine();
                x = Integer.parseInt(values.split(" ")[0]);
                y = Integer.parseInt(values.split(" ")[1]);
                globalPeople = x + globalPeople;
                globalConsumption = y +  globalConsumption;
                houseConsumption[i] = y / x;
                numberOfPeople[i] = x;
            }
            List<Integer> consumption = new ArrayList<>(Arrays.asList(houseConsumption));
            List<Integer> people = new ArrayList<>(Arrays.asList(numberOfPeople));
            globalMean = (double)globalConsumption/globalPeople;
            System.out.printf("Cidade# %d:\n", cityNumber);
            printValues(consumption, people);
            System.out.printf("\nConsumo medio: %.2f m3.\n\n", globalMean);
            n = sc.nextInt();
        }
        sc.close();
    }
    private static double meanConsumption(List<Integer> hc, List<Integer> nop) {
        return (hc.stream() .reduce(0, Integer::sum)) /
                ((double) nop.stream().reduce(0, Integer::sum));
    }
    private static void printValues(List<Integer> consumption, List<Integer> people) {
        while (consumption.size() > 0) {
            int minValue = consumption.stream().min(Integer::compare).get();
            int minIndex = consumption.indexOf(minValue);
            System.out.printf("%d-%d ", people.get(minIndex),minValue);
            consumption.remove(minIndex);
            people.remove(minIndex);
        }
    }
}

