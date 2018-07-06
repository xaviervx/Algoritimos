/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algori;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

// Esse extends tenho que pesquisar
// o que significa exatamente.
public class MaiorMenor extends JFrame {

    // importar a janela.
    JButton botao = new JButton("Botão");
    JFrame janela = new JFrame();

    public MaiorMenor() {

        // Metodos de configuração da janela: 
        // Deinir o Layout da janela (a principio sera definido como nulo (null)).
        janela.setLayout(null);

        // Chamando o botão.
        // O botão recebe 4 parametro:
        // 1º: Posição horizontal. 100
        // 2º: Posição vertical. 300
        // 3º: Largura. 100
        // 4º: Altura. 60
        janela.getContentPane().add(botao);
        botao.setBounds(15, 10, 100, 60);

        // Definir o tamanho de abertura da janela.
        janela.setSize(500, 400);

        // Definir o titulo da Janela.
        janela.setTitle("Maior e Menor em Vetor");

        // Fazer com que ela apareça.
        janela.setVisible(true);

        // Fazer o processo encerrar ao clicar no botão "X" da janela.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // MEtodo para definir onde ela aparecera na tela.
        janela.setLocationRelativeTo(null);

        // Impedir o úsuario de redimencionar a janela.
        janela.setResizable(true);

        // Fim do estudo de janelas
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int desa = 0;
        boolean vai = true;
        int a = 0;
        int des = cs.nextInt();
        if (des == 1) {
            new MaiorMenor();
        } else {

            double[] n = new double[10];

            System.out.println("Escreva 10 números e sera mostrado"
                    + "\no maior, média e menor entre eles.");

            for (int i = 0; i < 10; i++) {
                while (vai) {
                    System.out.println("Quer o q?\n1 - escrever\n2 - numeros aleatorio");
                    a = cs.nextInt();
                    if (a == 1) {
                        desa = 1;
                    } else {
                        desa = 2;
                    }
                    vai = false;
                }
                if (desa == 1) {
                    System.out.print((i + 1) + "º: ");
                    n[i] = cs.nextDouble();
                } else {
                    n[i] = Math.floor(Math.random() * 100);
                }
            }

            for (int i = 0; i < 10; i++) {
                if (n[i] < n[0]) {
                    double nb = n[0];
                    n[0] = Math.min(n[i], n[0]);
                    n[i] = Math.max(n[i], nb);
                }
                for (int j = 1; j < 10; j++) {
                    if (n[j] < n[1]) {
                        double nb = n[1];
                        n[1] = Math.min(n[j], n[1]);
                        n[j] = Math.max(n[j], nb);
                    }
                    for (int k = 2; k < 10; k++) {
                        if (n[j] < n[2]) {
                            double nb = n[2];
                            n[2] = Math.min(n[j], n[2]);
                            n[j] = Math.max(n[j], nb);
                        }
                        for (int l = 3; l < 10; l++) {
                            if (n[j] < n[3]) {
                                double nb = n[3];
                                n[3] = Math.min(n[j], n[3]);
                                n[j] = Math.max(n[j], nb);
                            }
                            for (int m = 4; m < 10; m++) {
                                if (n[j] < n[4]) {
                                    double nb = n[4];
                                    n[4] = Math.min(n[j], n[4]);
                                    n[j] = Math.max(n[j], nb);
                                }
                                for (int o = 5; o < 10; o++) {
                                    if (n[j] < n[5]) {
                                        double nb = n[5];
                                        n[5] = Math.min(n[j], n[5]);
                                        n[j] = Math.max(n[j], nb);
                                    }
                                    for (int p = 6; p < 10; p++) {
                                        if (n[j] < n[6]) {
                                            double nb = n[6];
                                            n[6] = Math.min(n[j], n[6]);
                                            n[j] = Math.max(n[j], nb);
                                        }
                                        for (int q = 7; q < 10; q++) {
                                            if (n[j] < n[7]) {
                                                double nb = n[7];
                                                n[7] = Math.min(n[j], n[7]);
                                                n[j] = Math.max(n[j], nb);
                                            }
                                            for (int r = 8; r < 10; r++) {
                                                if (n[j] < n[8]) {
                                                    double nb = n[8];
                                                    n[8] = Math.min(n[j], n[8]);
                                                    n[j] = Math.max(n[j], nb);
                                                }
                                                for (int s = 9; s < 10; s++) {
                                                    if (n[j] < n[9]) {
                                                        double nb = n[9];
                                                        n[9] = Math.min(n[j], n[9]);
                                                        n[j] = Math.max(n[j], nb);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("\nVetor: " + Arrays.toString(n));

            System.out.println("\nMenor número:           " + n[0]);

            System.out.println("\nMedia entre os números: " + (n[0] + n[1] + n[2] + n[3] + n[4] + n[5] + n[6] + n[7] + n[8] + n[9]) / 10);

            System.out.println("\nMaior número:           " + n[9]);
        }
    }
}
