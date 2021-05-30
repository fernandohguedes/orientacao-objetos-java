package aula4;

public class Livro {

    private String titulo;
    private Autor autor;
    private String genero;
    private Integer edicao;

    public Livro() {
    }

    public Livro(String titulo, Autor autor, String genero, Integer edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    public void info(){
        System.out.println("Titulo do livro: " + this.titulo);
        System.out.println("Genero do livro: " + this.genero);
        System.out.println("Edicao do livro: " + this.edicao);
        this.autor.info();
    }
}
