package ScreeMatch;

import ScreeMatch.classes.Filmes;
import ScreeMatch.classes.Titulo;
import ScreeMatch.classes.Series;

public class Main {
    public static void main(String[] args) {
        Filmes avengers = new Filmes();
        Titulo meuCurso = new Titulo();
        Series loki = new Series();
        System.out.println("=======================================");

/*--------------------------------------------------------------------------------------------------------------------*/


        // Titulo está puxando dados de ''Diretor'' apenas enquanto o diretorFilme não está sendo puxado naquela class
        /*Filme*/
        avengers.setNome("Vingadores");
        avengers.setLançamento(2025);
        avengers.setDiretor("Emannuel Macron");
        avengers.setDuraçãoMinutos(180);
        avengers.exibeFicha();
        avengers.somaMedia(6);
        avengers.somaMedia(8);
        avengers.somaMedia(4);

        System.out.println("Duração do filme: "+avengers.getDuraçãoMinutos()+" minutos");





        System.out.println("=======================================");

        loki.setNome("Loki caça herois");
        loki.setLançamento(2024);
        loki.setDiretor("Silverster istaloune");
        loki.setDuraçãoMinutos(5100);

        loki.somaMedia(8);
        loki.somaMedia(9);
        loki.somaMedia(6);

        loki.exibeFicha();

        System.out.println("duração em minutos: "+loki.getDuraçãoMinutos()+" minutos");





    }
}