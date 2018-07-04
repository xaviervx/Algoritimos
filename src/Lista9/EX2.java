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
public class EX2 {
    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner (System.in);
        BufferedReader lt = new BufferedReader (new InputStreamReader (System.in));
        
        System.out.println("=============================");
        
        System.out.println("Digite uma frase ou palavra: ");
        
        String texto = lt.readLine().toLowerCase().replace(" ", "");
        String textoInvertido = "";
        int tamanho = texto.length()-1;
        
        for (int i = tamanho; 0 <= i; i--) {
            textoInvertido += String.valueOf(texto.charAt(i));
        }
        if (texto.equals(textoInvertido)) {
            System.out.println("È um palíndromo. ");
        } else {
        System.out.println("Não é um palíndromo.");
        }
        System.out.println("=============================");
    }
}
