package model;

import calculo.Classificavel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public Filme(String nome, int anoDeLancamento) { super(nome, anoDeLancamento);}

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaDasAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + " )";
    }
}
