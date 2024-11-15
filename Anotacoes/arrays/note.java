package arrays;

public class note {
    // são estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo, são muito utilizados para manipulação de dados

    // para declarar um array em Java, é preciso definir seu tipo e tamanho
    int[] numeros = new int[5];
    {
    // iniciando o array, o preenchendo com num de 1 a 5
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
    }

    // limitações:
    // ele é fixo ! e não pode ser alterado após a sua criação
    // Ausência de métodos: arrays não possuem métodos que permitam a inserção, remoção ou pesquisa de elementos de forma eficiente
}
