package aula4;

public class LivroFisico extends Livro {

    private Integer tiragem;
    private Integer peso;

    private LivroFisico() {

    }

    public LivroFisico(String titulo, Autor autor, String genero, Integer edicao, Integer tiragem, Integer peso) {
        super(titulo, autor, genero, edicao);
        this.tiragem = tiragem;
        this.peso = peso;
    }

    public Integer getTiragem() {
        return tiragem;
    }

    public void setTiragem(Integer tiragem) {
        this.tiragem = tiragem;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Tiragem: " + this.tiragem);
        System.out.println("Peso: " + this.peso);

    }
}
