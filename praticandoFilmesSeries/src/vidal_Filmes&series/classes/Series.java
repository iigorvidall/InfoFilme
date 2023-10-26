package ScreeMatch.classes;

public class Series extends Titulo{
    private int temporadas;
    private int epsPorTemporadas;
    private int minutoPorEp;
    private boolean ativa;



    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsPorTemporadas() {
        return epsPorTemporadas;
    }

    public void setEpsPorTemporadas(int epsPorTemporadas) {
        this.epsPorTemporadas = epsPorTemporadas;
    }

    public int getMinutoPorEp() {
        return minutoPorEp;
    }

    public void setMinutoPorEp(int minutoPorEp) {
        this.minutoPorEp = minutoPorEp;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
