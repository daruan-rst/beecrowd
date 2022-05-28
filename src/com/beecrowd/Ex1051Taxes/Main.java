package com.beecrowd.Ex1051Taxes;

import java.io.IOException;
import java.util.Scanner;


/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner SC = new Scanner(System.in);
        double salary = SC.nextDouble();
        double tax;
        if(salary>4500){
            tax = (salary-4500L)*0.28 + 350;
        } else if (salary > 3000.01) {
            tax = (salary-3000)*0.18 + 80;
        } else if (salary > 2000.01) {
            tax = (salary-2000)*0.08;
        }else {
            tax = 0;
        }
        System.out.printf(tax == 0? "Isento" : "R$ %.2f" , tax);
        SC.close();

    }


}