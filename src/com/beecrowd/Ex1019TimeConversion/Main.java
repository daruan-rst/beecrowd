package com.beecrowd.Ex1019TimeConversion;

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
        int inputTime = sc.nextInt(); //seconds
        convert(inputTime);
    }

    private static void convert(int value) {
        int hours = value/3600; //hours
        int minutes = (value-hours*3600)/60; //minutes
        int seconds = (value-(hours*3600)-minutes*60); //seconds
        System.out.println(hours+":"+minutes+":"+seconds);
    }


}