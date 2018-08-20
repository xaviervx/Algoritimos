/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algori;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class estudoMetodos {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Primeiro");
        int n1 = cs.nextInt();
        System.out.println("Segundo");
        int n2 = cs.nextInt();

        
        System.out.println(imprimeDados(n1, n2));
        int adicao = calculaSoma(n1, n2);
        System.out.println ("Adição: " + adicao);
        int multiplicacao = multiplica(n1, n2);
        System.out.println("Multiplicação: " + multiplicacao);
    }

    public static String imprimeDados(int x, int y) {
        return ("Número 1: " + x + "\nNúmero 2: " + y);
    }

    public static int calculaSoma(int a, int b) {
        int soma = a + b;
        return soma;
    }

    public static int multiplica(int n1, int n2) {
        return (n1 * n2);
    }
}
