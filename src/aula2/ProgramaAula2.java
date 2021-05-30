package aula2;

public class ProgramaAula2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.cpf = "019956365244";
        aluno1.nome = "Pederneiras";
        aluno1.matricula = 123456;
        aluno1.info();

        Aluno aluno2 = new Aluno();
        aluno2.cpf = "019956365245";
        aluno2.nome = "Lasier";
        aluno2.matricula = 654321;
        aluno2.info();

    }
}
