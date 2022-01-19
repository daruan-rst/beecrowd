package com.beecrowd.Ex1005Average;

import java.util.Locale;
import java.util.Scanner;

public class Main {



    private static final Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        System.out.printf("MEDIA = %.5f%n", ((3.5*i+7.5*j)/11.0));
    }
}
