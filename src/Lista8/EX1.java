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
public class EX1 {
    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Senha: ");
        String senha = lt.readLine();
        senha = senha.toUpperCase();
        if (senha.equals("BATATAFRITA")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Você não tem acesso.");
        }
    }
}
