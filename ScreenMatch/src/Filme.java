public class Filme {
    // atributos da classe
    String nome;
    int anoDeLancamento;
    boolean incluidoPlano;
    double avaliacao;
    int totalDeAvaliacao;
    int duracaoMinutos;

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
