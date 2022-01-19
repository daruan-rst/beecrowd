package com.beecrowd.Ex1012Area;

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
    String values = sc.nextLine();
    double a = Double.parseDouble(values.split(" ")[0]);
    double b = Double.parseDouble(values.split(" ")[1]);
    double c = Double.parseDouble(values.split(" ")[2]);
    printResults(a,b,c);
    }

    private static double calculateTriangleArea(double b, double h){
        return b*h*0.5;
    }

    private static double calculateCircleArea(double radius){
        return 3.14159*Math.pow(radius,2);
    }

    private static double calculateTrapeziumArea(double a, double b, double h){
        return (a+b)*h*0.5;
    }

    private static double calculateSquareArea(double side){
        return Math.pow(side,2);
    }

    private static double calculateRectangleArea(double a, double b){
        return a*b;
    }

    private static void printResults(double a, double b, double c){
        System.out.printf("TRIANGULO: %.3f" +
                "\nCIRCULO: %.3f" +
                "\nTRAPEZIO: %.3f" +
                "\nQUADRADO: %.3f" +
                "\nRETANGULO: %.3f\n",
                calculateTriangleArea(a,c),
                calculateCircleArea(c),
                calculateTrapeziumArea(a,b,c),
                calculateSquareArea(b),
                calculateRectangleArea(a,b));
    }

}