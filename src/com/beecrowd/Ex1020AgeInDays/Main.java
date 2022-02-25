package com.beecrowd.Ex1020AgeInDays;

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
        int inputTime = sc.nextInt(); //days
        convert(inputTime);
    }

    private static void convert(int value) {
        int years = value/365; //years
        int months = (value-years*365)/30; //months
        int days = value-(years*365)-(months*30); //days
        System.out.println(years+" ano(s)\n"+months+" mes(es)\n"+days+" dia(s)");
    }


}