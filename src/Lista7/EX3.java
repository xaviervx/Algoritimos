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
public class EX3 {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        boolean teste = true;
        while (teste == true) {
            System.out.print("Base: ");
            double base = cs.nextDouble();
            double base1 = base;
            if (base >= 2) {
                System.out.print("Expoente: ");
                int expo = cs.nextInt();
                if (expo >= 0) {
                    while (expo != 1) {
                        base = base * base1;
                        expo -= 1;
                    }
                    System.out.println("\nResultado: " + base);
                    boolean teste1 = true;
                    while (teste1 == true) {
                    System.out.print("Deseja realizar uma nova operação (y/n): ");
                    String dec = lt.readLine();
                        switch (dec) {
                            case "y":
                                teste = true;
                                teste1 = false;
                                break;
                            case "n":
                                teste = false;
                                teste1 = false;
                                break;
                            case "Y":
                                teste = true;
                                teste1 = false;
                                break;
                            case "N":
                                teste = false;
                                teste1 = false;
                                break;
                            default:
                                System.out.println("Informe uma opção válida. \n");
                                teste1 = true;
                        }
                    }
                } else {
                    System.out.println("Informe um número inteiro e positivo. \n");

                }
            } else {
                System.out.println("Informe um número maior ou igual a 2. \n");
            }
        }
        System.out.println("Até uma outra conta. "
                + "\n 0/");
    }
}
