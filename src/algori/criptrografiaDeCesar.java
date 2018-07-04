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
public class criptrografiaDeCesar {
    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String fim = "";
        System.out.println("Qual operação?\nEncriptar - 1\nDecodificar - 2");
        int escolha = cs.nextInt();
        while ((escolha > 25) || (escolha < 0)) {
                System.out.println("Escolha uma chave válida: ");
                escolha = cs.nextInt();
        }
        if (escolha == 1) {
            System.out.println("Texto: ");
            String texto = lt.readLine().replace(" ", "").replace("é", "e").replace("ç", "c")
                    .replace("ó", "o").replace("ã", "a").replace("á", "a").replace("ú", "u")
                    .replace("í", "i").replace(",", "").replace(".", "").replace(";", "")
                    .replace("?", "").replace("!", "").replace("'", "").replace("-", "")
                    .replace(":", "").replace("_", "").replace("=", "").replace("+", "").toUpperCase();
            int tamanho = texto.length();

            System.out.println("Chave: ");
            int ch = cs.nextInt();

            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < 25; j++) {
                    if (String.valueOf(al.charAt(j)).equals(String.valueOf(texto.charAt(i)))) {
                        fim += String.valueOf(al.charAt(j + ch));
                        break;
                    }
                }
            }
            System.out.println(fim);
        }
        if (escolha == 2) {
            System.out.println("Texto: ");
            String texto = lt.readLine().replace(" ", "").replace("é", "e").replace("ç", "c")
                    .replace("ó", "o").replace("ã", "a").replace("á", "a").replace("ú", "u")
                    .replace("í", "i").replace(",", "").replace(".", "").replace(";", "")
                    .replace("?", "").replace("!", "").replace("'", "").replace("-", "")
                    .replace(":", "").replace("_", "").replace("=", "").replace("+", "").toUpperCase();

            int tamanho = texto.length();

            System.out.println("Chave: ");
            int ch = cs.nextInt();

            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < 25; j++) {
                    if (String.valueOf(al.charAt(j)).equals(String.valueOf(texto.charAt(i)))) {
                        fim += String.valueOf(al.charAt((j + 26) - ch));
                        break;
                    }
                }
            }
            System.out.println(fim);
        }
    }
}
