package ONE_java.HoraDaPratica;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    double numAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Lançamento: " + anoDeLancamento);
    }

    void totalDasAvaliacoes(double nota){
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaDasAvaliacoes(){
        return avaliacao / numAvaliacao;
    }
}
