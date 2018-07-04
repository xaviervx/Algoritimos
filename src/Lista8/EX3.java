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
public class EX3 {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        boolean teste = true;
        while (teste) {
            String exit = "EXIT";
            String a = lt.readLine();
            if ((a.toUpperCase().equals("EXIT"))) {
                System.exit(0);
            }
            String b = lt.readLine();
            if ((b.toUpperCase().equals("EXIT"))) {
                System.exit(0);
            }
            System.out.println(a + ", " + b + ".");
        }
    }
}
