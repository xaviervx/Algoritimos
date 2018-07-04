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
public class EX2 {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        boolean teste = false;
        while (true) {
            System.out.println("Litros vendidos: ");
            int litros = cs.nextInt();
            
            System.out.println("Tipo de combústivel:\nG - Gasolina \nA - Álcool");
            
            do {
                switch (lt.readLine().toUpperCase()) {
                    case ("G"):
                        System.out.println("Preço: " + 2.5 * litros);
                        teste = false;
                        break;
                    case ("A"):
                        System.out.println("Preço: " + 1.9 * litros);
                        teste = false;
                        break;
                    default:
                        System.out.println("Informe um caracter válido.");
                        teste = true;
                        break;
                }
            } while (teste);
            System.out.println("Deseja realizar outr operação? S / N");
            if (lt.readLine().toUpperCase().equals("S")) {
            } else {
                System.exit(0);
            }
        }
    }
}
