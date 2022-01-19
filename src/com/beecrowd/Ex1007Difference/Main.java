package com.beecrowd.Ex1007Difference;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    private static final Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int  A,B,C,D,diff;
        Locale.setDefault(Locale.US);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diff = A*B-C*D;
        System.out.println("DIFERENCA = " + diff);
    }
}

