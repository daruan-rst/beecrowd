package com.beecrowd.Ex1008Salary;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        int hours, number;
        double ammount;
        number = sc.nextInt();
        hours = sc.nextInt();
        ammount = sc.nextDouble();
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n" , hours*ammount );


    }

}
