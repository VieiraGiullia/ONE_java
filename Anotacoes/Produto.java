package Anotacoes;

public class Produto {

    String nome;
    double preco;
    double descontoParaPix;
        
    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            return preco - descontoParaPix;
        } else {
            return preco;
        }
    }
}