/* Escreva um código que deve imprimir a tabela de multiplicação desse algum número fornecido, e deve exibir um cabeçalho 
    com o nome Tabela de multiplicação de X, onde X é o número a ser multiplicado. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro e visualize a sua tabela de multiplicação");

        int n = sc.nextInt();

        System.out.printf(" ---------- Tabela de Multiplicação de  %d ---------- ", n);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n %d x %d = %d", n, i, (n * i));
        }
    }
}
