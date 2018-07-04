/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista7;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class EX1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        /* System.out.println ("Escreva o primeiro número: ");
        double n1 = cs.nextDouble();
        System.out.println ("Escreva o segundo número: ");
        double n2 = cs.nextDouble();
         */
        int quant = 0;
        double maior = 0;
        double menor = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe o " + i + "º número: ");
            double n = cs.nextDouble();
            if (i == 1) {
                menor = n;
                maior = n;
            } else {
                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }
            }
            if (i == 2) {
                if (maior == menor) {
                    System.out.println("Digite números diferentes.");
                    i = 0;
                }
                if ((menor <= 0) || (maior <= 0)) {
                    System.out.println("Digite números maiores que zero.");
                    i = 0;
                }
            }
        }
        double v = maior - menor;
        while (v != 0) {
            double div = menor % 11;
            if (div == 5) {
                quant++;
                if (quant == 1) {
                    System.out.println("Números que quando divididos por zero dão resto cinco: ");
                }
                System.out.println(menor);
            }
            v--;
            menor++;
        }
        if (quant == 0) {
            System.out.println("Nenhum dos números quando dividido por 11 da resto cinco.");
        } else {
            System.out.println("Quantidade de números dentro do intervalo com resto cinco: " + quant);
        }
    }
}
