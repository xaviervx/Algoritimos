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
public class NewClass1 {

    public static void main(String[] args) throws IOException {
        Scanner entra = new Scanner(System.in);
        BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nome: ");
        String nome = leitura.readLine();
        System.out.print("Nota 1: ");
        double n1 = entra.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = entra.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = entra.nextDouble();
        System.out.print("Faltas: ");
        int falta = entra.nextInt();
        if (falta > 20) {
            System.out.println("Nome do alunoª: " + nome);
            System.out.println("Media final: " + (n1 + n2 + n3) / 3);
            System.out.println("Reprovado por falta. ");
        } else {
            if ((n1 + n2 + n3) / 3 < 7) {
                System.out.println("Nome do alunoª: " + nome);
                System.out.println("Media final: " + (n1 + n2 + n3) / 3);
                System.out.println("REPROVADO!! ");
            } else {
                System.out.println("Nome do alunoª: " + nome);
                System.out.println("Media final: " + (n1 + n2 + n3) / 3);
                System.out.println("APROVADO!! ");
            }
        }
    }
}
