package com.beecrowd.Ex1034IceStatuesFestival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    private static final Scanner SC = new Scanner(System.in);

    private static final BufferedReader bi = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            int m = SC.nextInt();
            int n = SC.nextInt();
            Integer[] nValues = parseLineToArrayOfInt(n);
            System.out.println(findNeededBlocks(n, nValues));

        }
    }

    private static Integer[] parseLineToArrayOfInt(int n) throws IOException {
        String[] s;
        String line;
        do{
            line = bi.readLine();
        }while(line.equals(""));
        s = line.split(" ");
        Integer[] a = new Integer[s.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        return a;
    }

    private static int findNeededBlocks(int m, Integer[] l) {
        fromHighToLow(l);
        int i = 0;
        int blocks = 0;
        while (m > 0) {
            m = m - l[i];
            if (m < l[i]) {
                i++;
            }
            blocks++;
        }
        return blocks;
    }

    private static void fromHighToLow(Integer[] a) {
        Arrays.sort(a);
        int i = 0;
        int j = a.length - 1;
        int tmp;
        while (j > i) {
            tmp = a[j];
            a[j] = a[i];
            a[i] = tmp;
            j--;
            i++;
        }
    }


}