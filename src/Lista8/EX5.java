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
public class EX5 {

    /*public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("leia um texto: ");
        String texto = entrada.readLine().toLowerCase();
        
        System.out.println("leia letra a: ");
        String a = entrada.readLine().toLowerCase().trim();
        
        System.out.println("leia letra b: ");
        String b = entrada.readLine().toLowerCase().trim();
        
        boolean stringAExisteNoTexto = false;
       
        for (int i = 0; i < texto.length(); i++) {
            if (String.valueOf(texto.charAt(i)).equals(String.valueOf(a.charAt(0)))) {
                
                for (int j = 0; j < a.length(); j++) {
                    
                    if (String.valueOf(texto.charAt(i + j)).equals(String.valueOf(a.charAt(j)))) {
                        stringAExisteNoTexto = true;
                    }
                    if (!stringAExisteNoTexto == false) break; 
                        
                    
                    
                }
                
            }
            
        }
        System.out.println("");
        System.out.println("Texto original: "+ texto);
        
        if (stringAExisteNoTexto == true)  texto = texto.replace(a, b);
        else System.out.println("o valor armazenado na string não existe na variável");
        
        System.out.println("texto contendo as alterações: "+ texto.replace(a, b));
            
        
        
        
    }*/

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escreva um texto: ");
        String texto = lt.readLine().toLowerCase().trim();
        
        System.out.println("Texto a");
        String a = lt.readLine().toLowerCase().trim();
        
        System.out.println("Texto b");
        String b = lt.readLine().toLowerCase().trim();
        
        System.out.println("\nTexto original:       " + texto);
        System.out.println("Texto com alterações: " + texto.replace(a, b));
    }
}
