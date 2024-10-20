package HoraDaPratica.parteDois;

public class Produto {
    // os atributos privados nome e preco
    private String nome;
    private double preco;
    private int desconto;

    private double precoFinal;
    private double valorDesconto;

    //  Utilize métodos getters e setters para acessar e modificar esses atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto

    public double calculaValorDesconto() {
        return valorDesconto = (getDesconto() / 100.0) * getPreco();
    }
    public double getPrecoFinal(){
        return precoFinal = preco - calculaValorDesconto();
    }
}
