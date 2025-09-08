package com.beecrowd.Ex1025WhereIsTheMarble;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static Scanner sc =
            new Scanner(System.in);
    static ArrayList<Integer> nValues;
    static ArrayList<Integer> qValues;
    static ArrayList<Integer> qPositions;
    static Integer n = -1;
    static Integer q = -1;

    static int caseCounter = 0;

    public static void main(String[] args) throws IOException {

        while (checkCondition(n, q)) {
            nValues = new ArrayList<>();
            qValues = new ArrayList<>();
            qPositions = new ArrayList<>();
            caseCounter++;
            String line = sc.nextLine();
            n = Integer.parseInt(line.split(" ")[0]);
            q = Integer.parseInt(line.split(" ")[1]);
            if (!checkCondition(n, q)){
                break;
            }
            for (int i = 0; i < n; i++) {
                nValues.add(sc.nextInt());
            }
            for (int i = 0; i < q; i++) {
                qValues.add(sc.nextInt());
            }
            findQValuePosition();
            printResults();
            sc.nextLine();
        }
    }

    private static boolean checkCondition(int n, int q) {
        return n != 0 && q != 0;
    }

    private static void findQValuePosition() {
        qValues.forEach(qValue -> {
            if (nValues.contains(qValue)) {
                qPositions.add(nValues.indexOf(qValue) + 1);
            } else {
                qPositions.add(-1);
            }
        });
    }

    private static void printResults(){
        System.out.printf("CASE #%d\n", caseCounter);
        for (int i = 0 ; i<qPositions.size() ; i++){
            if (qPositions.get(i) == -1){
                System.out.printf("%d not found", qValues.get(i));
            }else {
                System.out.printf("%d found at %d", qValues.get(i), qPositions.get(i));
            }
            System.out.println();
        }
    }
}



