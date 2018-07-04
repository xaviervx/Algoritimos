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
public class EX4 {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escreva: ");
        String nome = lt.readLine();
        int t = nome.length()-1;
        String nomeInvert = "";
        while (t >= 0){
            nomeInvert += String.valueOf(nome.charAt(t));
            t--;
        }
        System.out.println("==== Palavra Invertida ====");
        System.out.println(nomeInvert);
    }
}
