package br.com.alura.sreenmatch.model;

public class Filme {
    // atributos da classe
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoPlano;
    private double avaliacao;
    private double totalDeAvaliacao;
    private int duracaoMinutos;

    double getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome; // “this” se refere ao objeto atual e não ao parâmetro do método
    }
    
    // metódo
    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        avaliacao += nota;
        totalDeAvaliacao++;
    }

    double mediaDasAvaliacoes(){
        return avaliacao / totalDeAvaliacao;
    }
}
