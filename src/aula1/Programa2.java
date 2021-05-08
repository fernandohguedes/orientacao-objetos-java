package aula1;

import java.util.Scanner;

public class Programa2 {

    public static void main(String[] args) {

        /**
         * Exercicio 2: Ajude Leônidas
         */

        Scanner teclado = new Scanner(System.in);
        int valorCorreto = 10000;

        System.out.println("Digite o seu palpite");
        int palpite = teclado.nextInt();

        // solução sem If ternário
        while (palpite != valorCorreto) {

            if (palpite < valorCorreto) {
                System.out.println("Um pouco mais...");
            } else {
                System.out.println("Um pouco menos...");
            }
            System.out.println("Digite o próximo palpite");
            palpite = teclado.nextInt();
        }
        System.out.println("Está correto");

        //---------------------------------------------------------------

        // solução com If ternário
        String mensagem;
        while (palpite != valorCorreto) {
            mensagem = palpite < valorCorreto ? "Um pouco mais..." : "Um pouco menos...";
            System.out.println(mensagem);
            System.out.println("Digite o próximo palpite");
            palpite = teclado.nextInt();
        }
        System.out.println("Está correto");

        teclado.close();
    }
}

