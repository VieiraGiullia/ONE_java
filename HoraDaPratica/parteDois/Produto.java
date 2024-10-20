package HoraDaPratica.parteDois;

public class Produto {
    // os atributos privados nome e preco
    private String nome;
    private int preco;

    //  Utilize métodos getters e setters para acessar e modificar esses atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto

    public void aplicarDesconto(double desconto){
        desconto = (100/10) + preco;
        System.out.println(desconto);
    }
}
