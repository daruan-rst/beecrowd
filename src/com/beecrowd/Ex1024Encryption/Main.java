package com.beecrowd.Ex1024Encryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line;
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            char[] chars = line.toCharArray();
            moveThreePositions(chars);
        }
    }

    private static char[] reverseCharArray(char[] charArray) {
        char[] auxArray = charArray.clone();

        charArray[0] = charArray[charArray.length - 1];
        for (int i = 1; i < charArray.length; i++) {
            charArray[i - 1] = auxArray[charArray.length - i];
        }
        charArray[charArray.length - 1] = auxArray[0];

        return charArray;
    }

    private static char[] moveThreePositions(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                int ascii = (int) array[i];
                array[i] = (char) (ascii + 3);
            }
        }
        array = reverseCharArray(array);

        for (int j = array.length / 2; j < array.length; j++) {
            int ascii = array[j];
            array[j] = (char) (ascii - 1);

        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%c", array[i]);
        }
        System.out.println("");

        return array;
    }

}
