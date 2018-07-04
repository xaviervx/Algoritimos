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
public class EX4_1 {
    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Escreva um númerom inteiro positivo para verificar se ele é primo: ");
            int p = cs.nextInt();
            boolean teste = true;
            for (int i = 2; i <= p; i++) {
                if ((p % i == 0) && (i != p)) {
                    System.out.println("Número não primo.");
                    teste = false;
                    break;
                }
            }
            if (teste) {
                System.out.println("Número primo.");
            }
            System.out.println("Deseja? S / N");
            if (lt.readLine().toUpperCase().equals("S")) {
            } else {
                System.exit(0);
            }
        }
    }
}
