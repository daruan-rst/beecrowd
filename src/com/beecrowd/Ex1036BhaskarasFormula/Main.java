package com.beecrowd.Ex1036BhaskarasFormula;

import java.io.IOException;
import java.util.Scanner;


/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {


    public static void main(String[] args) throws IOException {
        Scanner SC = new Scanner(System.in);
        double a = SC.nextDouble();
        double b = SC.nextDouble();
        double c = SC.nextDouble();
        calculateRoots(a,b,c);
        SC.close();

    }

    private static double delta(double a, double b, double c){
        return Math.sqrt(b*b - 4*a*c);}

    private static void calculateRoots(double a, double b, double c){
        double firstRoot = (-b + delta(a,b,c))/(2*a);
        double secondRoot = (-b - delta(a,b,c))/(2*a);
        if(Double.isInfinite(firstRoot) || Double.isNaN(firstRoot)
        ||Double.isInfinite(secondRoot) || Double.isNaN(secondRoot)){
            System.out.println("Impossível Calcular");
        }else {
            System.out.printf("R1 = %.5f\n" , firstRoot);
            System.out.printf("R2 = %.5f\n" , secondRoot);
        }

    }
}
