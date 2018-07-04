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
public class Exercicio3_Prova {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nome do paciente: ");
        String nome = ler.readLine();
        System.out.print("Idade: ");
        int idd = sc.nextInt();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.println("Ficha do Paciente");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idd + " anos");

        if (idd >= 12) {
            if (peso > 60) {
                System.out.println("Peso: " + peso + " Kg");
                System.out.println("Dosagem prescrita: " + ((20 * 100) / 500) + " gotas");
            } else {
                System.out.println("Peso: " + peso + " Kg");
                System.out.println("Dosagem prescrita: " + ((20 * 875) / 500) + " gotas");
            }
        } else {
            if ((peso >= 5) && (peso <= 9)) {
                System.out.println("Peso: " + peso + " Kg");
                System.out.println("Dosagem prescrita: " + ((20 * 125) / 500) + " gotas");
            }
            if ((peso >= 10) && (peso <= 16)) {
                System.out.println("Peso: " + peso + " Kg");
                System.out.println("Dosagem prescrita: " + ((20 * 250) / 500) + " gotas");
            }
            if ((peso >= 17) && (peso <= 24)) {
                System.out.println("Peso: " + peso + " Kg");
                System.out.println("Dosagem prescrita: " + ((20 * 350) / 500) + " gotas");
            }
            if ((peso >= 25) && (peso <= 30)) {
                System.out.println("Peso: " + peso + " Kg");
                System.out.println("Dosagem prescrita: " + ((20 * 500) / 500) + " gotas");
            }
            if (peso > 30) {
                System.out.println("Peso: " + peso + " Kg");
                System.out.println("Dosagem prescrita: " + ((20 * 750) / 500) + " gotas");
            }
        }
    }
}
