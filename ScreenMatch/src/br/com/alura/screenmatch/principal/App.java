package principal;
import java.util.ArrayList;

import calculo.CalculadoraDeTempo;
import calculo.FiltroRecomendacao;
import model.*;

public class App {
    public static void main(String[] args) {
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
        winx.exibeFichaTecnica();
        winx.setTemporadas(8);
        winx.setEpisodiosTemporada(24);
        winx.setMinutosPorTemporada(24);
        System.out.println("Tempo para maratonar Winx: " + winx.getDuracaoMinutos());
    
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
        

        //filmedaGiovanna.setNome("Moana");
        filmedaGiovanna.setDuracaoMinutos(180);
        filmedaGiovanna.avalia(9);

        System.out.println("Tamanho da lista: " + listaDeFilme.size());
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome());
        System.out.println("toString do primeiro filme - " + listaDeFilme.get(0).toString());


    }
}
