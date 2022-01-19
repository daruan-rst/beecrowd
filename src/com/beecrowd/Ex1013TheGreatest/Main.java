package com.beecrowd.Ex1013TheGreatest;

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
    String inputs = sc.nextLine();
    int a = splitInput(0,inputs," ");
    int b = splitInput(1,inputs," ");
    int c = splitInput(2,inputs," ");
        System.out.println(theGreatest(a,b,c) + " eh o maior");
    }

    private static int  splitInput(int position, String inputLine, String splitString){
        return Integer.parseInt(inputLine.split(splitString)[position]);
    }

    private static int theGreatest(int a, int b, int c){
       int firstGreatest = formula(a,b);
       int secondGreatest = formula(b,c);
       return formula(firstGreatest,secondGreatest);
    }

    private static int formula(int a, int b){
        return (a+b + Math.abs(a-b))/2;}

}