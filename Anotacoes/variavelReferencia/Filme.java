package variavelReferencia;

public class Filme {
    // Referências são ponteiros para objetos em memória
    //  No Java, toda variável de objeto é na verdade uma referência a esse objeto que foi alocado na memória

    // Quando você instancia um objeto, está, na realidade, criando um novo bloco de memória que armazena as informações desse objeto. A maneira de chegar a esse bloco de memória, para armazenar e ler informações dele, ocorre por meio de uma referência, que é representada por uma variável.

    // criamos um novo objeto da classe Filme e armazenamos uma referência a ele na variável filme1.
    // Filme filme1 = new Filme("Avatar", 2009);


    //  ELAS APENAS APONTAM PARA O OBJETO
    // Quando você passa uma referência a um método ou atribui uma referência a outra variável, está apenas copiando o valor da referência e não do objeto em si. 

    /*
     *  Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("The Matrix", 1999);
        Filme filme3 = filme1;
     */

    // Uma questão importante relacionada com referências a objetos em Java é a questão da igualdade e identidade de objetos. Quando você compara duas referências de objeto usando o operador de igualdade ==, está comparando as referências em si, não os objetos que elas apontam.

    /*
     * Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("Avatar", 2009);

        if (filme1 == filme2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
     */

    //  a saída no console será: "Diferentes"
    // Embora os dois objetos tenham as mesmas informações na memória, a comparação com == verifica se as referências são iguais, ou seja, se apontam para o mesmo objeto na memória.
}
