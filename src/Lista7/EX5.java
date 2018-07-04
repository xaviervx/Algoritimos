/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class EX5 {
    public static void main (String [] args) throws IOException {
        Scanner cs = new Scanner (System.in);
        BufferedReader lt = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Escreva um número "
                + "\ninteiro e positivo: ");
        int n = cs.nextInt();
        double soma = 1;
        double i = 2;
        while (i <= n) {
            soma += (1/i);
            i++;
/* Para ver a conta passo a passo.
            System.out.println("Soma: " +soma);
*/
        }
        System.out.println("\nSoma da seguinte operação:"
                + "\n1+ 1/2 + 1/3 ... +1/n. é igual a: " +soma);
    }
}
