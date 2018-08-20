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


public class EX1 {
    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("==========================================");
        System.out.print("Escreva um texto/frase/palavra qualquer: ");
        
        String texto = lt.readLine().trim();
        String carac = texto.replace(" ", "");
        String texto1 = texto.toUpperCase();
        int tamanho = texto1.length();
        int tamanho1 = carac.length();
        int vogais = 0;
        
        for (int i = 0; i < tamanho; i++) {
            String letra = String.valueOf(texto1.charAt(i));
            if (letra.equals("A") || 
                letra.equals("E") || 
                letra.equals("I") || 
                letra.equals("O") || 
                letra.equals("U")) {
               vogais++;
            }
//            switch(letra){
//                case "A":
//                    vogais++;
//                    break;
//                case "E":
//                    vogais++;
//                    break;
//                case "I":
//                    vogais++;
//                    break;
//                case "O":
//                    vogais++;
//                    break;
//                case "U":
//                    vogais++;
//                    break;
//                default:
//            }
          }
        System.out.println("\nNúmero de caracteres: " + tamanho1);
        System.out.println("texto em maiusculo: " + texto.toUpperCase());
        System.out.println("Número de vogais: " + vogais);
        
        System.out.println("==========================================");
    }
}
