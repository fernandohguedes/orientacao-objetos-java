package aula2;

public class Aluno {
    int matricula;
    String nome;
    String cpf;

    public void info() {
        System.out.println("==================================");
        System.out.println("MATRICULA: " + this.matricula);
        System.out.println("NOME: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("==================================");
    }

}
