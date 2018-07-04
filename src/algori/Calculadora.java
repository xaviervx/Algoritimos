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
public class Calculadora {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nome de Usuario: ");
        String nome = leitura.readLine();
//Usuario Cadastrado        
        String nome2 = "Xavier";
        if (nome == null ? nome2 == null : nome.equals(nome2)) {
            System.out.print("Senha: ");
            String senha = leitura.readLine();
            String senha2 = "rvr99097";
            if (senha == null ? senha2 == null : senha.equals(senha2)) {
                System.out.println("Acesso permitido");
                System.out.println("Qual operação deseja realizar? ");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Quantos números serão somados (minimo 2 limite de 5)? ");
                        int nn = sc.nextInt();
                        switch (nn) {
                            case 2:
                                System.out.println("Iforme os números: ");
                                double n1 = sc.nextDouble();
                                double n2 = sc.nextDouble();
                                System.out.println(n1 + n2);
                                break;
                            case 3:
                                System.out.println("Iforme os números: ");
                                double na = sc.nextDouble();
                                double nb = sc.nextDouble();
                                double nc = sc.nextDouble();
                                System.out.println(na + nb + nc);
                                break;
                            case 4:
                                System.out.println("Iforme os números: ");
                                double nd = sc.nextDouble();
                                double ne = sc.nextDouble();
                                double nf = sc.nextDouble();
                                double ng = sc.nextDouble();
                                System.out.println(nd + ne + nf + ng);
                                break;
                            case 5:
                                System.out.println("Iforme os números: ");
                                double nh = sc.nextDouble();
                                double ni = sc.nextDouble();
                                double nj = sc.nextDouble();
                                double nk = sc.nextDouble();
                                double nl = sc.nextDouble();
                                System.out.println(nh + ni + nj + nk + nl);
                                break;
                            default:
                                System.out.println("Mas o que é isso?");
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Quantos números serão subtraidos (minimo 2 limite de 3)? ");
                        int n1n = sc.nextInt();
                        switch (n1n) {
                            case 2:
                                System.out.println("Informe os números:");
                                double m1 = sc.nextDouble();
                                double m2 = sc.nextDouble();
                                System.out.println(m1 - m2);
                                break;
                            case 3:
                                System.out.println("Informe os números: ");
                                double m3 = sc.nextDouble();
                                double m4 = sc.nextDouble();
                                double m5 = sc.nextDouble();
                                System.out.println(m3 - m4 - m5);
                                break;
                            default:
                                System.out.println("Mas o que é isso?");
                                break;
                        }
                        break;
                    case 3:
                        System.out.print("Quantos números serão multiplicados (minimo 2 limite de 3)? ");
                        int n2n = sc.nextInt();
                        switch (n2n) {
                            case 2:
                                System.out.println("Informe os números:");
                                double h1 = sc.nextDouble();
                                double h2 = sc.nextDouble();
                                System.out.println(h1 * h2);
                                break;
                            case 3:
                                System.out.println("Informe os números:");
                                double h3 = sc.nextDouble();
                                double h4 = sc.nextDouble();
                                double h5 = sc.nextDouble();
                                System.out.println(h3 * h4 * h5);
                                break;
                            default:
                                System.out.println("Mas o que é isso?");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Informe os números a serem divididos: ");
                        double d1 = sc.nextDouble();
                        double d2 = sc.nextDouble();
                        System.out.println(d1 / d2);
                        System.out.println("Resto = " + (d1 % d2));
                        break;
                }
            } else {
                System.out.println("Acesso Negado");
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println("Acesso Negado");
            System.out.println("Usuario Incorreto");
        }

    }
}
