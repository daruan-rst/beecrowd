package com.beecrowd.Ex1004SimpleProduct;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("PROD = "+ (i*j));
    }
}
