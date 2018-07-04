/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista9;

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

        int numeroEspacos = 0;
        
        System.out.println("===========================");
        
        System.out.println("\nDigite um texto:");
        
        String texto = lt.readLine().toLowerCase().trim() + " ";
        int tamanho = texto.length() - 1;
        int textoSemEspacos = (texto.replace(" ", "")).length();

        for (int i = 0; i <= tamanho; i++) {
            switch (""+(texto.charAt(i))) {
                case " ":
                    numeroEspacos++;
                    break;
                default:
            }
        }
        System.out.println("Números de caracteres: " +textoSemEspacos);
        
        System.out.println("Números de palavras: " +numeroEspacos);
        
        System.out.println("\n===========================");
    }
}
