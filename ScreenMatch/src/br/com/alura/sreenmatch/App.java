package br.com.alura.sreenmatch;

// import br.com.alura.sreenmatch.model.Filme;

public class App {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // tipo referencia
        meuFilme.nome = "Velozes e Furiosos: Desafio em Tóquio";
        meuFilme.anoDeLancamento = 2006;
        meuFilme.avaliacao = 0;
        meuFilme.duracaoMinutos = 104;
        meuFilme.incluidoPlano = true;
        meuFilme.totalDeAvaliacao = 0;

        // instanciando objetos
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.printf("Notas do filme: " + meuFilme.mediaDasAvaliacoes());
    }
}
