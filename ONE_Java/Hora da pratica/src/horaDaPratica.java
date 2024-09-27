public class horaDaPratica {
    public static void main(String[] args) {
    // Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    double a = 7.2;
    double b = 9.1;;

    double media = (a + b)/2;
    System.out.println("A media das notas é: " + media);
    System.out.println("-----------------");

    // Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
    int c = (int) a;
    System.out.println("Este é um exemplo de casting explícito: " + c);
    System.out.println("-----------------");

    // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
    char caracter = 'C';
    String palavra = "Cinema";
    
    System.out.println("A letra " + caracter + " inicia a palavra " + palavra);
    System.out.println("-----------------");

    // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
    double precoProduto = 25.59;
    int quantidade = 5;

    double multiplicacao = (precoProduto * quantidade);
    System.out.println("Há " + quantidade + " produtos com o valor de " + precoProduto + " totalizando: " + multiplicacao);
    System.out.println("-----------------");

    // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
    double valorEmDolares = 72.80;
    double conversao = (valorEmDolares / 4.94);
    
    System.out.println("O valor em reais de " + valorEmDolares + " equivale a " + conversao);
    System.out.println("-----------------");

    // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
    double precoOriginal = 45.99;
    double percentualDesconto = 10;

    double desconto = precoOriginal * (percentualDesconto/100);
    System.out.println("O valor do desconto é: " + desconto);

    double precoDesconto = precoOriginal - desconto;
    System.out.println("o preço final é: " + precoDesconto);
    }
}

