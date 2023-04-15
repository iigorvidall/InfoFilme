import br.com.vidal.modelos.Filme;

public class main {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("top gun");
        favorito.setAvaliacao(8);
        favorito.setDuracaoMinutos(135);
        favorito.setLancamento(1986);
        favorito.setOscars(3);
        favorito.chamarInfoFilme();
        favorito.getSinopse();

        System.out.println("Total de avaliaçoes:  " + favorito.getTotalAvaliacoes());
        System.out.println("Sinopse do filme:  " + favorito.getSinopse());
        System.out.println("*************************");
    }

}
