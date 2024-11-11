package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String Titulo;
    private int totalReproucoes;
    private int totalCurtidas;
    private int classificacao;

    public int getTotalReproucoes() {
        return totalReproucoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    
    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproucoes++;
    }
}
