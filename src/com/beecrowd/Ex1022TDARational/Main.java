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
        SC.nextLine();  //lê o "\n" que o teclado.nextInt() deixa para trás.
        for (int i = 0 ; i<n ; i++){
            scanAndParse();
        }
        SC.close();
    }

    private static void scanAndParse() {

        String s = SC.nextLine();
        String[] values = s.split(" ");
        String operation = values[3];
        int[] x = new int[]{Integer.parseInt(values[0]), Integer.parseInt(values[2])};
        int[] y = new int[]{Integer.parseInt(values[4]), Integer.parseInt(values[6])};
        int[] answer = doTheMath(x, y, operation);
        printTheSolution(answer);

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
        formatNegativeSign(solution);
        int[] simplifiedSolution = new int[]{ solution[0]/simplify(solution[0], solution[1])
                , solution[1]/simplify(solution[0], solution[1])};
        formatNegativeSign(simplifiedSolution);

        System.out.printf("%d/%d = %d/%d\n", solution[0], solution[1], simplifiedSolution[0], simplifiedSolution[1]);

    }

    private static int[] formatNegativeSign(int[] fraction){
        if (fraction[1]<0){
            fraction[0] = Math.negateExact(fraction[0]);
            fraction[1] = Math.negateExact(fraction[1]);
        }
        return fraction;
    }

}