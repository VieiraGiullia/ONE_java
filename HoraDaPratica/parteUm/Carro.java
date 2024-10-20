package HoraDaPratica.parteUm;

public class Carro {
    String modelo;
    int ano;
    int anoDeLancamento;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("O modelo: " + modelo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Cor: " + cor);
    }

    double idadeCarro(){
        return anoDeLancamento + ano;
    }
}
