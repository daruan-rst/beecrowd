package com.beecrowd.Ex1023Drought;

import java.io.IOException;
import java.util.*;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static int x, y, n, cityNumber, globalConsumption, globalPeople;
    static Map<Integer, String> mapOfCitiesAndConsumption = new HashMap<>();
    static Map<Integer, String> mapOfCitiesAndAverageHouseConsumption = new HashMap<>();

    static Integer[] houseConsumption, numberOfPeople, averageHouseConsumption;
    static double globalMean;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        cityNumber = 0;
        n = sc.nextInt();
        while(n!=0) {
            cityNumber++;
            houseConsumption = new Integer[n];
            numberOfPeople = new Integer[n];
            averageHouseConsumption = new Integer[n];
            sc.nextLine(); // remove \n do console
            for (int i = 0; i < n; i++) {
                String values = sc.nextLine();
                x = Integer.parseInt(values.split(" ")[0]);
                y = Integer.parseInt(values.split(" ")[1]);
                numberOfPeople[i] = x;
                houseConsumption[i] = y;
                averageHouseConsumption[i] = y/x;
            }
            sortArraysByAverageHouseConsumption();

            mapOfCitiesAndAverageHouseConsumption.put(cityNumber, pairOfHouseAndMeanConsumption());

            mapOfCitiesAndConsumption.put(cityNumber, cityMeanConsumption());

            n = sc.nextInt();
        }
        sc.close();

        printFinalResults();
    }

    private static void sortArraysByAverageHouseConsumption(){
        boolean hasSwapped = true;
        while (hasSwapped){
            hasSwapped = false;
            for(int i = 1 ; i < n;  i++) {

                int currentAverageHouseConsumption = averageHouseConsumption[i];
                int currentNumberOfPeople = numberOfPeople[i];

                if (averageHouseConsumption[i] < averageHouseConsumption[i-1]) {
                    averageHouseConsumption[i] = averageHouseConsumption[i-1];
                    averageHouseConsumption[i-1] = currentAverageHouseConsumption;

                    numberOfPeople[i] = numberOfPeople[i-1];
                    numberOfPeople[i-1] = currentNumberOfPeople;

                    hasSwapped = true;
                }
            }
        }
    }

    private static void calculateMeanConsumption(){
        int totalPeople = 0;
        int totalConsumption = 0;
        for (int i = 0 ; i < n;  i++){
            totalPeople = totalPeople + numberOfPeople[i];
            totalConsumption = totalConsumption + houseConsumption[i];
        }
        globalMean = (float) totalConsumption/totalPeople;
    }
    private static String pairOfHouseAndMeanConsumption() {
        String secondAnswer = "";
        for (int i = 0 ; i < n;  i++){
            secondAnswer = secondAnswer.concat(String.format("%d-%d", numberOfPeople[i], averageHouseConsumption[i]));
            secondAnswer = i > n-1 ? secondAnswer.concat("") : secondAnswer.concat(" ");
        }
        return secondAnswer;
    }

    private static String cityMeanConsumption() {
        calculateMeanConsumption();
        return String.format("Consumo medio: %.2f m3.", globalMean);
    }

    private static void printFinalResults(){
        for (int i =1 ; i <= cityNumber ; i++){
            System.out.printf("Cidade# %d:\n", i);
            System.out.println(mapOfCitiesAndAverageHouseConsumption.get(i));
            System.out.println(mapOfCitiesAndConsumption.get(i));
            if (i != cityNumber) {
                System.out.println("");
            }
        }
    }
}

