package com.beecrowd.Ex1002AreaOfACircle;


import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final double PI = 3.14159;

    public static void main(String[] args) throws IOException {
    double R = sc.nextDouble();
    formatPlaces(2, R);
    System.out.println("A="+ formatPlaces(4,PI*R*R));
    }

    private static Formatter formatPlaces (int i, double number){
        return new Formatter().format("%." + i +"f", number);
    }
}
