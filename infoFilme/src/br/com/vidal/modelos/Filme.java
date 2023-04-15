package br.com.vidal.modelos;

public class Filme {
    private String sinopse = """
            A escola naval de pilotos é onde o melhor dos melhores treinam para refinar suas habilidades de voo de elite. 
            Quando o piloto Maverick é enviado para a escola, sua atitude irresponsável e comportamento arrogante o colocam em desacordo com os outros pilotos, especialmente Iceman.
            Porém Maverick não está apenas competindo para ser o piloto superior de caça, ele também está lutando pela atenção de sua bonita instrutora de voo, Charlotte Blackwood.
            """;
    private String nome;
    private int lancamento;
    private double avaliacao;
    private double duracaoMinutos;
    private int oscars;
    private int totalAvaliacoes = 133;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setOscars(int oscars) {
        this.oscars = oscars;
    }



    public void chamarInfoFilme() {
        System.out.println("*************************");
        System.out.println("Filme: " + nome);
        System.out.println("Lançado em: " + lancamento);
        System.out.println("Avaliado em : " + avaliacao + " estrelas " + "(" + totalAvaliacoes + ")");
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Numero de oscars: " + oscars);


    }

}