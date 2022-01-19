package com.beecrowd.Ex1006Average;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    private static final Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        double  i,j,k;
        Locale.setDefault(Locale.US);
        i = sc.nextDouble();
        j = sc.nextDouble();
        k = sc.nextDouble();
        System.out.printf("MEDIA = %.1f%n", ((2.0*i+3.0*j+5.0*k)/10.0));
    }
}
