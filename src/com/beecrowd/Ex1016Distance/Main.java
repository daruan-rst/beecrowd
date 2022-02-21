package com.beecrowd.Ex1016Distance;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    static int X_SPEED = 60;
    static int Y_SPEED = 90;
    static int RELATIVE_SPEED = Y_SPEED - X_SPEED;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    int distance = sc.nextInt();
    int time = 60*distance/RELATIVE_SPEED;
    System.out.println(time + " minutos");
    }

}