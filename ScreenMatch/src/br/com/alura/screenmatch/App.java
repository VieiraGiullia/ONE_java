import calculo.CalculadoraDeTempo;
import calculo.FiltroRecomendacao;
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
        winx.setMinutosPorTemporada(24);
        System.out.println("Tempo para maratonar Winx: " + winx.getDuracaoMinutos());
    
        Filme deleFilme = new Filme(); // tipo referencia
        deleFilme.setNome(" + Velozes + Furiosos");
        deleFilme.setAnoDeLancamento(2003);
        deleFilme.setDuracaoMinutos(147);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        //calculadora.inclui(meuFilme);
        //calculadora.inclui(deleFilme);
        //calculadora.inclui(winx);
        System.out.println("Tempo para maratonar winx + dois fimes de VF: " + calculadora.getTempoTotal());
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNum(1);
        episodio.setSerie(winx);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
