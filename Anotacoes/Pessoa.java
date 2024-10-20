package Anotacoes;

// Uma classe é uma estrutura que define um tipo de objeto
// define quais são as características (atributos) e comportamentos (métodos)

// classe 
public class Pessoa {
    // atributos 
    String nome;
    int idade;

    // método 
    void fazAniversario() {
        idade++;
    }
    
    public static void main(String[] args) {

    // objetos
    Pessoa pessoa1 = new Pessoa();

    pessoa1.nome = "ana";
    pessoa1.idade = 20;

    System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

    pessoa1.fazAniversario();

    System.out.println("A idade agora é: " +pessoa1.idade);

    Pessoa pessoa2 = new Pessoa();

    pessoa2.nome = "Carlos";
    pessoa2.idade = 20;

    System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");

    pessoa2.fazAniversario();

    System.out.println("A idade agora é: " + pessoa2.idade);
    }
}