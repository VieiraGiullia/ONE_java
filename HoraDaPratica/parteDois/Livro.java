package HoraDaPratica.parteDois;

public class Livro {
    // atributos privados titulo e autor
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Adicione um método exibirDetalhes que imprime o título e o autor do livro.

    public void exibirDetalhes(String detalhes){
        detalhes = "Nome do livro: " + titulo + "\nAutor: " + autor;
        System.out.println(detalhes);
    }

    // teste ok
}
