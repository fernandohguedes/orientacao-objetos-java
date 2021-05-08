package aula1;

import java.util.*;

public class Programa3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /**
         * Exercicio 3: Leia uma seqência de Strings
         */
        List<String> nomes = new ArrayList<>();
        String nome;

        System.out.println("Digite quantos nomes você quer inserir: ");
        int total = teclado.nextInt();

        System.out.println("Digite os nomes: ");

        for (int i = 0; i < total; i++) {
            nome = teclado.next();
            nomes.add(nome);
        }

        System.out.println("=============================");

        System.out.println("Ordem normal...");
        System.out.println(nomes);

        System.out.println("=============================");

        System.out.println("Ordem reversa...");
        Collections.reverse(nomes);
        System.out.println(nomes);

        System.out.println("=============================");

        // fechando o Scanner
        teclado.close();
    }
}
