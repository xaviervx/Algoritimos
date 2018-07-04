/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class EX6 {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        boolean condição = true;

        while (condição) {
            System.out.println("\n========================================");
            String texto1 = null;
            String texto2 = null;
            String contar = "";
            String textoReescrito = "";

            System.out.println("Escreva o texto 1: ");
            texto1 = lt.readLine().toLowerCase().trim();

            int tamanho = texto1.length();

            for (int i = 0; i < tamanho; i++) {
                textoReescrito += String.valueOf(texto1.charAt(i)) + " ";
            }

            for (int i = 0; i < tamanho; i++) {
                contar += String.valueOf(i) + " ";
            }

            System.out.println("\nEscreva o texto 2: ");
            texto2 = lt.readLine().trim().toLowerCase();

            System.out.println("\n" + textoReescrito + "\n" + contar);

            System.out.println("\nA partir de qual posição deseja por o texto 2: ");
            int pos = cs.nextInt() + 1;

            String primeiraLetra = (String.valueOf(texto1.charAt(0)).toUpperCase());
            /* Aqui nesse codigo seria apenas um teste para verificar 
        a substituição apenas do primeiro caracter para maiusculo
        apenas no texto um.
        Texte abaixo:
        System.out.println((String.valueOf(texto1.charAt(0)).toUpperCase()) +texto1.substring(1));
             */

 /*
       Resultado final usando a String chamda primeiraLetra e pondo
       ela no lugar do caracter que esta em minusculo e mais o restante do texto 
       já com a incerssão do teto2 no texto1.
             */
            System.out.println(primeiraLetra
                    + texto1.substring(1, pos).trim()
                    + " " + texto2 + " "
                    + texto1.substring(pos).trim());
            System.out.println("========================================");

            System.out.print("\nDeseja prosseguir com um novo texto?(S / N) ");
            if (lt.readLine().toUpperCase().trim().equals("N")) {
                condição = false;
            }
        }
        System.out.println("\nAgradeço por testar este algoritimo.");
    }
}
