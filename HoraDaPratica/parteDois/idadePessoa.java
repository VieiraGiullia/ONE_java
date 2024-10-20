package HoraDaPratica.parteDois;

public class idadePessoa {
    // com os atributos privados nome e idade
    private String nome;
    private int idade;

    // Utilize métodos getters e setters para acessar e modificar esses atributos.
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

    public void verificarIdade() {
        if (idade >= 18 ) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você ainda é menor de idade");
        }
    }
}
// teste ok
