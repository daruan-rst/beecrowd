package com.beecrowd.Ex1022TDARational;

import java.io.IOException;
import java.util.Scanner;


/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = SC.nextInt();
        for (int i = 0 ; i<n ; i++){
            scanAndDoTheMath();
        }
    }

    private static void scanAndDoTheMath() {
        String x = SC.next();
        String operation = SC.next();
        String y = SC.next();
        int[] answer = doTheMath(makeItIntoNumber(x),
                                 makeItIntoNumber(y),
                                 operation);
        printTheSolution(answer);

    }

    private static int[] makeItIntoNumber(String value) {
        return new int[]{Integer.parseInt(value.split("/")[0]),
                Integer.parseInt(value.split("/")[1])};
    }

    private static int[] doTheMath(int[] x, int[] y, String o) {
        int[] answer;
        switch (o) {
            case "+":
                answer = new int[]{x[0] * y[1] + x[1] * y[0], y[1] * x[1]};
                break;
            case "-":
                answer = new int[]{x[0] * y[1] - x[1] * y[0], y[1] * x[1]};
                break;
            case "*":
                answer = new int[]{x[0] * y[0], x[1] * y[1]};
                break;
            case "/":
                answer = new int[]{x[0] * y[1], x[1] * y[0]};
                break;
            default:
                answer = new int[]{};
        }
        return answer;
    }

    private static int simplify(int n, int d){
        if (d == 0){
            return n;
        }else{
            return simplify(d, n%d);
        }
    }

    private static void printTheSolution(int[] solution){
        if (solution[1]<0){
            solution[0] = Math.negateExact(solution[0]);
            solution[1] = Math.negateExact(solution[1]);
        }
        System.out.println(solution[0] + "/" + solution[1]);
        System.out.println(solution[0]/simplify(solution[0], solution[1]) + "/" + solution[1]/simplify(solution[0], solution[1]) );
        System.out.printf("%d/%d = %d/%d", solution[0], solution[1], solution[0]/simplify(solution[0], solution[1])
                , solution[1]/simplify(solution[0], solution[1]));
    }

}