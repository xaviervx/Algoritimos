/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algori;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class testeWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = 0;
        int numeroAleatorio = random.nextInt(11);
        boolean tentarNovamente = true;
        boolean tentarNovamente1 = true;
        boolean segundaVez = false;
        
        System.out.println("============================");
// Aleatórios de 0 até 9

// Enquanto tentarNovamente igual a true, itera novamente.
        while (tentarNovamente) {
            for (int i = 0; i < 1; i++) {
                System.out.print("Tente adivinhar o número sorteado de 0 a 10: ");
                numero = scanner.nextInt();
                tentarNovamente1 = numeroAleatorio != numero;
                if (tentarNovamente1) {
                    System.out.println("Errado!");
                    segundaVez = true;
                }
                tentarNovamente = false;
            }
            while (segundaVez) {
                System.out.print("Tente novamente: ");
                numero = scanner.nextInt();
                tentarNovamente = numeroAleatorio != numero;
                if (tentarNovamente) {
                    System.out.println("Errado!");
                }
                segundaVez = false;
            }
        }

        System.out.println("Parabéns! Você adivinhou. Era o número "
                + numeroAleatorio + " mesmo.");
        System.out.println("Fim!");
        System.out.println("============================");
    }
}
