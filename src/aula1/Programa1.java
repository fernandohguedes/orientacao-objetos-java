package aula1;

import java.util.Scanner;

public class Programa1 {

    public static void main(String[] args) {
        /**
         * Exercicio 1: Cálculo do IMC
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por Favor Digite o seu peso: ");
        float peso = teclado.nextFloat();

        System.out.println("Por Favor Digite a sua altura: ");
        float altura = teclado.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC eh: " + imc);

        teclado.close();
    }
}
