/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algori;

/**
 *
 * @author Xavier
 */
public class testes {

    public static void main(String args[]) {

        int[][][][] a = new int[10][10][10][10];
        a[4][0][0][0] = 7;
        a[5][0][0][0] = 7;
        System.out.println(a[4][0][0][0] * a[5][0][0][0]);
    }
}
/*
        String curso = "Curso Técnico em Informática";
        String area = "Informática";
        System.out.println("Curso: " + curso);
        System.out.println("Área: " + area);
        System.out.println("Índice da palavra Informática no nome do cruso: " + curso.indexOf(area));
    }
 */
 /* public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Frase: ");
        String frase = entrada.readLine();
        System.out.println("Frase: " + frase);
        System.out.println("Caractere 2: " + frase.charAt(1));
    }*/
