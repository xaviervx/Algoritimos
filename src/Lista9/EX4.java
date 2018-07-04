/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class EX4 {
    //Chamada de metodo teste.
    public void teste(){
      System.out.println("Fim");
    }
    public static void main(String[] args) throws IOException {
        EX4 ex = new EX4();
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        Random ran = new Random();

        boolean continua = true;
        boolean primeira = true;
        boolean primeiraSequencia = true;
        boolean segundaSequencia = true;
        boolean segundaExecução = false;

        while (continua) {
            int corte = ran.nextInt(10) + 1;
            int ind = ran.nextInt(4) + 1;

            if (primeira) {
                System.out.println("========== Recombinação ==========");
                primeira = false;
            }
            primeiraSequencia = true;
            segundaSequencia = true;

            String s1 = "";
            String s2 = "";

            String s3_1 = "";
            String s3_2 = "";
            String s3_3 = "";
            String s3_4 = "";

            String s4_1 = "";
            String s4_2 = "";
            String s4_3 = "";
            String s4_4 = "";

            while (primeiraSequencia) {
                if (segundaExecução) {
                    System.out.println("\n========== Recombinação ==========");
                }
                System.out.println("\nPrimeira sequencia de genes: ");
                s1 = lt.readLine().toUpperCase().trim().replace(" ", "");

                if (s1.length() < 10) {
                    System.out.println("Didite uma sequencia com no minimo dez caracteres.".toUpperCase());
                } else {
                    primeiraSequencia = false;
                    segundaExecução = true;
                }
            }

            while (segundaSequencia) {
                System.out.println("\nSegunda sequencia de genes: ");
                s2 = lt.readLine().toUpperCase().trim().replace(" ", "");

                if (s2.length() < 10) {
                    System.out.println("Didite uma sequencia com no minimo dez caracteres.".toUpperCase());
                } else {
                    segundaSequencia = false;
                }
            }
            System.out.println("\n====== Novas combinação ========");

            if (ind == 1) {
                s3_1 = s1.substring(0, corte) + s2.substring(corte, 10);
                System.out.println("\n" + s3_1.replace("", " ").trim());
            } else {
                if (ind == 2) {
                    s3_2 = s2.substring(0, corte) + s1.substring(corte, 10);
                    System.out.println("\n" + s3_2.replace("", " ").trim());
                } else {
                    if (ind == 3) {
                        s3_3 = s2.substring(corte, 10) + s1.substring(0, corte);
                        System.out.println("\n" + s3_3.replace("", " ").trim());
                    } else {
                        if (ind == 4) {
                            s3_4 = s1.substring(corte, 10) + s2.substring(0, corte);
                            System.out.println("\n" + s3_4.replace("", " ").trim());
                        }
                    }
                }
            }

            corte = ran.nextInt(10) + 1;
            ind = ran.nextInt(4) + 1;

            if (ind == 1) {
                s4_1 = s1.substring(0, corte) + s2.substring(corte, 10);
                System.out.println("\n" + s4_1.replace("", " ").trim());
            } else {
                if (ind == 2) {
                    s4_2 = s2.substring(0, corte) + s1.substring(corte, 10);
                    System.out.println("\n" + s4_2.replace("", " ").trim());
                } else {
                    if (ind == 3) {
                        s4_3 = s1.substring(corte, 10) + s2.substring(0, corte);
                        System.out.println("\n" + s4_3.replace("", " ").trim());
                    } else {
                        if (ind == 4) {
                            s4_4 = s2.substring(corte, 10) + s2.substring(0, corte);
                            System.out.println("\n" + s4_4.replace("", " ").trim());
                        }
                    }
                }
            }

            System.out.println("\n==================================");
            System.out.println("Nova combinação (S/N)? ");
            if (lt.readLine().toLowerCase().equals("n")) {
                continua = false;
            }
        }
        System.out.println("\n============== FIM ==============");
        System.exit(0);
          ex.teste();
    }

}
