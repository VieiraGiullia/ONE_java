import model.*;

public class App {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // tipo referencia
        meuFilme.setNome("Velozes e Furiosos: Desafio em Tóquio");
        meuFilme.setAnoDeLancamento(2006);
        meuFilme.setDuracaoMinutos(104);
        meuFilme.setIncluidoPlano(true);

        // instanciando objetos
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.printf("Média das avaliações do filme: " + meuFilme.mediaDasAvaliacoes());
    
        // teste com a classe Serie
        Serie winx = new Serie();
        winx.setNome("Winx Club");
        winx.setAnoDeLancamento(2004);
        winx.exibeFichaTecnica();
        winx.setTemporadas(8);
        winx.setEpisodiosTemporada(24);
    }
}
