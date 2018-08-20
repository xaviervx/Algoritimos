package algori;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Vetores {
public void inicio() throws IOException{
    Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        Vetores ex = new Vetores();

        double[] vetor = new double[]{0, 0, 0, 0};
        int tamanho = String.valueOf(Arrays.toString(vetor)).replace(" ", "").replace(",", "").length() - 10;
//        System.out.println(String.valueOf(Arrays.toString(vetor)).replace(" ", "").replace(",", ""));
//        System.out.println("Qual o vetor desejado? ");
//        int pro = cs.nextInt();
//        while (pro > 3) {
//            System.out.println("Qual o vetor desejado? ");
//            pro = cs.nextInt();
//        }
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * 100);
            System.out.println("");
            System.out.println("Vetor " + (i) + " = " + vetor[i]);
            System.out.println("Vetor = " + String.valueOf(Arrays.toString(vetor)));
        }
        System.out.println("Repetir (Y / N)? ");
        if (lt.readLine().toUpperCase().equals("Y")) {
        ex.inicio();
    }
        ex.fim();
}
    public void fim() {
        System.out.println("\nFim");
    }

    public static void main(String[] args) throws IOException{
        Vetores ex = new Vetores();
        ex.inicio();
    }
}
