package com.beecrowd.Ex1015DistanceBetweenTwoPoints;

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
    String firstPoint = sc.nextLine();
    String secondPoint = sc.nextLine();
    double firstX = Double.parseDouble(firstPoint.split(" ")[0]);
    double firstY = Double.parseDouble(firstPoint.split(" ")[1]);
    double secondX = Double.parseDouble(secondPoint.split(" ")[0]);
    double secondY = Double.parseDouble(secondPoint.split(" ")[1]);
    System.out.printf("%.4f\n" , calculateDistance(firstX,firstY,secondX,secondY));

    }

    private static double calculateDistance(double aX, double aY, double bX, double bY){
        return Math.sqrt( Math.pow((bX-aX),2) + Math.pow((bY-aY),2));
    }


}