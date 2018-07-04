/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algori;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class ExMIM {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader leitura = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Escreva o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Escreva o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Escreva o terceiro número: ");
        double c = sc.nextDouble();

        if ((a == b) && (b == c) && (a == c)) {
            System.out.println("Os números são iguais à: " + a);
        } else {
            if (a == c) {
                if (c > b) {
                    System.out.println("Maior: " + c);
                    System.out.println("Menor: " + b);
                } else {
                    System.out.println("Maior: " + b);
                    System.out.println("Menor: " + c);
                }
            }
            if (a == b) {
                if (b > c) {
                    System.out.println("Maior: " + b);
                    System.out.println("Menor: " + c);
                } else {
                    System.out.println("Maior: " + c);
                    System.out.println("Menor: " + b);
                }
            }
            if (c == b) {
                if (b > a) {
                    System.out.println("Maior: " + b);
                    System.out.println("Menor: " + a);
                } else {
                    System.out.println("Maior: " + a);
                    System.out.println("Menor: " + b);
                }
            }
        }
        if ((a < b) && (b < c) && (c > a)) {
            System.out.println("Menor: " + a);
            System.out.println("Intermediario: " + b);
            System.out.println("Maior: " + c);
        }
        if ((a < b) && (b > c) && (c > a)) {
            System.out.println("Menor: " + a);
            System.out.println("Intermediario: " + c);
            System.out.println("Maior: " + b);
        }
        if ((a > b) && (b < c) && (c > a)) {
            System.out.println("Menor: " + b);
            System.out.println("Intermediario: " + a);
            System.out.println("Maior: " + c);
        }
        if ((a < b) && (b > c) && (c < a)) {
            System.out.println("Menor: " + c);
            System.out.println("Intermediario: " + a);
            System.out.println("Maior: " + b);
        }
        if ((a > b) && (b < c) && (c < a)) {
            System.out.println("Menor: " + b);
            System.out.println("Intermediario: " + c);
            System.out.println("Maior: " + a);
        }
        if ((a > b) && (b > c) && (c > a)) {
            System.out.println("Menor: " + c);
            System.out.println("Intermediario: " + b);
            System.out.println("Maior: " + a);
        }
        
    }
}
