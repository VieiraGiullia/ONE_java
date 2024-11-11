package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.PodCast;

public class principal {
    public static void main(String[] args) {
        Musica primeirMusica = new Musica();
        primeirMusica.setTitulo("like i want you ");
        primeirMusica.setCantor("Giveon");
        primeirMusica.setAlbum("Take Time");
        primeirMusica.setGenero("POP Interncional");

        for (int i = 0; i < 1000; i++) {
            primeirMusica.reproduz();
        }
        for (int i = 0; i < 150; i++) {
            primeirMusica.curtir();
        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setApresentador("Vieira Giullia");
        meuPodCast.setTitulo("Fala Giullia");

        for (int i = 0; i < 120; i++) {
            meuPodCast.reproduz();
        }
        for (int i = 0; i < 30; i++) {
            meuPodCast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodCast);
        preferidas.inclui(primeirMusica);
    }
}
