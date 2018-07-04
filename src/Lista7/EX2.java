/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista7;

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
        double saldo = 0;
        boolean teste = true;
        while (teste == true) {
            System.out.println("Bem vindo ao Banco VX \nEscolha uma operação.");
            System.out.println("(a) Consulta "
                    + "\n(b) Saque "
                    + "\n(c) Depósito "
                    + "\n(d) Sair");
            String op = lt.readLine();
            switch (op) {
                case "a":
                    System.out.println("Seu Saldo atual é de: " + saldo + " R$");
                    System.out.println(" ");
                    break;
                case "b":
                    System.out.println("Quanto deseja retirar? ");
                    double valor = cs.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente \n");
                    } else {
                        System.out.println("Saque realizado com sucesso. "
                                + "\n");
                        saldo -= valor;
                    }
                    break;
                case "c":
                    System.out.println("Quanto deseja depositar? ");
                    double valo = cs.nextDouble();
                        System.out.println("Deposito realizado com sucesso. "
                                + "\n");
                        saldo += valo;
                    break;
                case "d":
                    teste = false;
                    break;
                default:
                    System.out.println("Selecione uma operação válida "
                            + "\n");

            }
        }
        System.out.println("Obrigado por usar nossos serviços");
    }
}
